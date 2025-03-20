/*
    Dynamic Method Dispatch is a fundamental concept in Java, enabling polymorphism — one of the four pillars of Object-Oriented Programming. It refers to the process by which a method call to an overridden method is resolved at runtime, rather than compile-time.
 */
class phone {
    public void greet() {
        System.out.println("Good morning");
    }

    public void name() {
        System.out.println("My name is java");
    }
}

class smartphone extends phone {
    public void welcome() {
        System.out.println("welcome");
    }

    @Override
    public void name() {
        System.out.println("My name is java in class two");
    }
}

public class dynamicDispatch {
    public static void main(String[] args) {
        // phone obj = new phone();
        // smartphone smobj = new smartphone();
        // obj.name();

        phone obj = new smartphone();
        obj.greet();
        obj.name();
    }
}
