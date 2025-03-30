package cursurPractice2.incapsularea;

public class AdultPerson {
    private String name;
    private long idnp;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIdnp(long idnp) {
        this.idnp = idnp;
    }

    public void setAge(int age) {
        if (age > 18) ;
        this.age = age;
    }
}
