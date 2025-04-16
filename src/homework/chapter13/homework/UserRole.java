package md.enums;

public enum UserRole {
    ADMIN(3, "Administrator complet"),
    MODERATOR(2, "Moderator cu acces limitat"),
    USER(1, "Utilizator obișnuit");

    private final int permissionLevel;
    private final String description;

    UserRole(int permissionLevel, String description) {
        this.permissionLevel = permissionLevel;
        this.description = description;
    }

    public boolean hasAccessToAdminPanel() {
        return this == ADMIN || this == MODERATOR;
    }

    public int getPermissionLevel() {
        return permissionLevel;
    }

    public String getDescription() {
        return description;
    }
}
