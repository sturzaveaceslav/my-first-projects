package main;

import help.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.Answer;
import model.Question;

import javafx.scene.image.Image; // CORECT
import java.util.*;

public class MillionaireApp extends Application {

    private VBox root;
    private Label questionLabel;
    private Button[] answerButtons = new Button[4];
    private Label scoreLabel;
    private int currentLevel = 1;
    private int score = 0;
    private Question currentQuestion;
    private HelpAnswer[] activeHelpAnswers = null;

    private final Game game = new Game();
    private final FiftyFiftyHelp fiftyFifty = new FiftyFiftyHelp();
    private final AudienceHelp audienceHelp = new AudienceHelp();
    private final PhoneHelp phoneHelp = new PhoneHelp();

    @Override
    public void start(Stage stage) {
        game.initQuestions();
        root = new VBox(15);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);

// Setează fundal cu imagine
        BackgroundImage bgImage = new BackgroundImage(
                new Image(getClass().getResource("/img/milionar.jpg").toExternalForm()),
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(100, 100, true, true, true, true)
        );
        root.setBackground(new Background(bgImage));


        questionLabel = new Label("Întrebare");
        questionLabel.setWrapText(true);
        questionLabel.setFont(new Font(18));

        scoreLabel = new Label("Scor: 0");
        scoreLabel.setFont(new Font(16));

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        char letter = 'a';
        for (int i = 0; i < 4; i++) {
            Button btn = new Button();
            btn.setPrefWidth(250);
            btn.setUserData("" + (char)(letter + i));
            btn.setOnAction(e -> handleAnswer(((Button) e.getSource()).getUserData().toString()));
            answerButtons[i] = btn;
            grid.add(btn, i % 2, i / 2);
        }

        HBox helpBox = new HBox(10);
        helpBox.setAlignment(Pos.CENTER);

        Button fBtn = new Button("50/50");
        Button aBtn = new Button("Ajutor public");
        Button pBtn = new Button("Sună un prieten");

        fBtn.setOnAction(e -> handleHelp("F"));
        aBtn.setOnAction(e -> handleHelp("A"));
        pBtn.setOnAction(e -> handleHelp("P"));

        helpBox.getChildren().addAll(fBtn, aBtn, pBtn);

        HBox controlBox = new HBox(10);
        controlBox.setAlignment(Pos.CENTER);
        Button restartBtn = new Button("🔁 Restart");
        Button exitBtn = new Button("❌ Ieșire");

        restartBtn.setOnAction(e -> restartGame());
        exitBtn.setOnAction(e -> stage.close());
        controlBox.getChildren().addAll(restartBtn, exitBtn);

        root.getChildren().addAll(scoreLabel, questionLabel, grid, helpBox, controlBox);

        Scene scene = new Scene(root, 700, 400);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/style.css")).toExternalForm());

        stage.setScene(scene);
        stage.setTitle("Cine vrea să devină milionar?");
        stage.show();

        playIntroSound();
        nextQuestion();
    }

    private void nextQuestion() {
        currentQuestion = game.getRandomQuestion(currentLevel);
        if (currentQuestion == null) {
            questionLabel.setText("Nu mai sunt întrebări pentru nivelul " + currentLevel);
            return;
        }

        questionLabel.setText("Nivel " + currentLevel + ": " + currentQuestion.getText());
        Answer[] answers = currentQuestion.getAnswers();

        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i].setText(answers[i].getSequence() + ") " + answers[i].getText());
            answerButtons[i].setDisable(false);
        }

        activeHelpAnswers = null;
    }

    private void handleAnswer(String input) {
        Answer[] answers = currentQuestion.getAnswers();

        if (activeHelpAnswers != null) {
            boolean found = false;
            for (HelpAnswer ha : activeHelpAnswers) {
                if (ha.getAnswer().getSequence().equalsIgnoreCase(input)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                showAlert("⚠️ Varianta nu e printre cele 2 rămase (50/50).");
                return;
            }
        }

        int index = input.charAt(0) - 'a';
        Answer selected = answers[index];

        if (selected.isCorrect()) {
            score += currentQuestion.getScore();
            scoreLabel.setText("Scor: " + score);
            currentLevel++;
            nextQuestion();
        } else {
            showAlert("❌ Greșit! Răspunsul corect era: " + currentQuestion.getCorrectAnswer().getText());
            disableAnswers();
        }
    }

    private void disableAnswers() {
        for (Button btn : answerButtons) {
            btn.setDisable(true);
        }
    }

    private void handleHelp(String type) {
        switch (type) {
            case "F":
                if (fiftyFifty.isUsed()) {
                    showAlert("❗ Deja ai folosit 50/50.");
                } else {
                    activeHelpAnswers = fiftyFifty.getHelpAnswers(currentQuestion);
                    updateHelpView();
                }
                break;
            case "A":
                if (audienceHelp.isUsed()) {
                    showAlert("❗ Deja ai folosit ajutorul publicului.");
                } else {
                    HelpAnswer[] publicVotes = audienceHelp.getHelpAnswers(currentQuestion);
                    StringBuilder sb = new StringBuilder("📊 Publicul a votat:\n");
                    for (HelpAnswer ha : publicVotes) {
                        sb.append(" - ").append(ha.getAnswer().getSequence()).append(") ")
                                .append(ha.getAnswer().getText()).append(" ➤ ")
                                .append(ha.getProbability()).append("%\n");
                    }
                    showAlert(sb.toString());
                }
                break;
            case "P":
                if (phoneHelp.isUsed()) {
                    showAlert("❗ Deja ai sunat un prieten.");
                } else {
                    HelpAnswer[] suggestions = phoneHelp.getHelpAnswers(currentQuestion);
                    StringBuilder sb = new StringBuilder("📞 Prietenul tău sugerează:\n");
                    for (HelpAnswer ha : suggestions) {
                        sb.append(" - ").append(ha.getAnswer().getSequence()).append(") ")
                                .append(ha.getAnswer().getText()).append("\n");
                    }
                    showAlert(sb.toString());
                }
                break;
        }
    }

    private void updateHelpView() {
        Set<String> validSeq = new HashSet<>();
        for (HelpAnswer ha : activeHelpAnswers) {
            validSeq.add(ha.getAnswer().getSequence().toLowerCase());
        }
        for (Button btn : answerButtons) {
            String seq = ((String) btn.getUserData()).toLowerCase();
            btn.setDisable(!validSeq.contains(seq));
        }
    }

    private void restartGame() {
        score = 0;
        currentLevel = 1;
        scoreLabel.setText("Scor: 0");
        fiftyFifty.reset();
        audienceHelp.reset();
        phoneHelp.reset();
        nextQuestion();
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ajutor");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    private void playIntroSound() {
        try {
            Media media = new Media(getClass().getResource("/sounds/intro.mp3").toExternalForm());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        } catch (Exception e) {
            System.out.println("❌ Eroare la redarea melodiei intro: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}