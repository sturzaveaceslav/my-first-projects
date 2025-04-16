package md.enums;

public enum ErrorCode {
    INVALID_INPUT(100, "Datele introduse nu sunt valide."),
    NOT_FOUND(404, "Resursa nu a fost găsită."),
    SERVER_ERROR(500, "Eroare internă a serverului.");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getUserMessage() {
        return message;
    }

    public static ErrorCode fromCode(int code) {
        for (ErrorCode e : values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
