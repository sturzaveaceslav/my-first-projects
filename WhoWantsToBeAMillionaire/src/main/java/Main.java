import exception.InvalidInputException;

public class Main {
    public static void main(String[] args) {
        System.out.println("🎉 Bine ai venit la 'Cine vrea să devină milionar?' 🎉");

        Game game = new Game();

        try {
            game.start();
        } catch (InvalidInputException e) {
            System.out.println("❌ Eroare: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ O eroare neașteptată: " + e.getMessage());
        }

        System.out.println("Jocul s-a încheiat. Mulțumim pentru participare!");
    }
}
