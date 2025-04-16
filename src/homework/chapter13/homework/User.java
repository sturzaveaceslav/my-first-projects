package md.enums;

public class User {
    private String name;
    private UserRole role;

    public User(String name, UserRole role) {
        this.name = name;
        this.role = role;
    }

    public void displayPermissions() {
        switch (role) {
            case ADMIN -> System.out.println(name + ": Ai acces complet la toate funcțiile.");
            case MODERATOR -> System.out.println(name + ": Poți modera conținutul.");
            case USER -> System.out.println(name + ": Poți edita doar propriul profil.");
        }

        if (role.hasAccessToAdminPanel()) {
            System.out.println("Acces la panoul de administrare: PERMIS.");
        } else {
            System.out.println("Acces la panoul de administrare: RESTRICȚIONAT.");
        }
    }
}
