package md.enums;

public class ErrorTest {
    public static void main(String[] args) {
        int receivedCode = 500;
        ErrorCode error = ErrorCode.fromCode(receivedCode);

        if (error != null) {
            switch (error) {
                case INVALID_INPUT -> System.out.println("Eroare: " + error.getUserMessage());
                case NOT_FOUND -> System.out.println("Eroare: " + error.getUserMessage());
                case SERVER_ERROR -> System.out.println("Eroare critică: " + error.getUserMessage());
            }

            if (error == ErrorCode.SERVER_ERROR) {
                System.out.println("Atenție! Contactați administratorul.");
            }
        } else {
            System.out.println("Eroare necunoscută.");
        }
    }
}
