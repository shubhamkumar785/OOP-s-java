
/* 
  Access Modifier
  
  1. public --- all packages
  2. private --- same class
  3. Default --- same package
*/

// class student {

//     private String name;
//     private int roll;

//     public student(String name, int roll) {
//         this.name = name;
//         this.roll = roll;
//     }

//     public void display() {
//         System.out.println("name:  " + name);
//         System.out.println("roll no:  " + roll);
//     }
// }

// public class accessModifier {

//     public static void main(String[] args) {
//         student s1 = new student("shubham", 12);
//         s1.display();
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

public class accessModifier {
    public static void main(String[] args) {
        student s1 = new student("subhanshu", 12);
        s1.display();
        s1.setName("shubham");
        s1.setRoll(01);
        System.out.println("name: " + s1.getName());
        System.out.println("roll no: " + s1.getRoll());
    }
}
