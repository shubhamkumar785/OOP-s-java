/*
   this keyword is a reference variable that refers to the current object, allowing you to access its members (fields, methods, and constructors) within an instance method or constructor
 */

class EkClass {
    int a;

    public EkClass(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

public class thisKeyboard {
    public static void main(String[] args) {
        EkClass ek = new EkClass(5);
        System.out.println(ek.getA());
    }
}