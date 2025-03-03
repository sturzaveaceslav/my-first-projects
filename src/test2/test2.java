package test2;

public class test2 {
public int a = 2;

test2() {

}
test2(int b) {
    a = b;
}
public int getA() {
    System.out.println(a);
    return a;
}
}

class secondClass {
    public static void main(String[] args) {
        test2 test = new test2();

        test2 secondVariable = new test2(6);
        test.getA();
    }
}
