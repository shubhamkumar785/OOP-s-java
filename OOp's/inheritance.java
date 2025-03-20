
// Inheritance -- deriving new things from a existing things

// class Base {
//     int x;

//     public void setX(int x) {
//         System.out.println("I am in base and setting x now");
//         this.x = x;
//     }

//     public int getX() {
//         return x;
//     }

//     public void printMe() {
//         System.out.println("I am a base class constructor");
//     }
// }

// class Derived extends Base {
//     int y;

//     public void setY(int y) {
//         System.out.println("I am in derived and setting y now");
//         this.y = y;
//     }

//     public int getY() {
//         return y;
//     }

//     public void printMe() {
//         System.out.println("I am a derived class constructor");
//     }

// }

// public class inheritance {
//     public static void main(String[] args) {
//         Base b = new Base();
//         b.setX(4);
//         System.out.println(b.getX());

//         Derived d = new Derived();
//         d.setY(43);
//         System.out.println(d.getY());

//     }
// }

// using getter and setter and constructor both used

class student {
    private String name;
    private int roll;

    public student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("roll no: " + roll);
    }
}

public class inheritance {
    public static void main(String[] args) {
        student s1 = new student("subhanshu", 12);
        s1.display();
        s1.setName("shubham");
        s1.setRoll(01);
        System.out.println("name: " + s1.getName());
        System.out.println("roll no: " + s1.getRoll());
    }
}
