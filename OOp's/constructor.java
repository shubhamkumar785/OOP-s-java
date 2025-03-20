
//  constructor - constructor is a similar to a function which name is same as a class name.
//  there is two types of constructor in java
//  1. default constructor
//  2. parametrized constructor

// 1.  default constructor

// class Employee {
//     String name;
//     int id;

//     public Employee() {
//         name = "shubham";
//         id = 101;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public int getId() {
//         return id;
//     }

//     public void display() {
//         System.out.println("name: " + name);
//         System.out.println("id: " + id);
//     }
// }

// public class constructor {
//     public static void main(String[] args) {
//         Employee emp = new Employee();
//         emp.display();
//         emp.setName("shubham");
//         emp.setId(121);
//         System.out.println(emp.getName());
//         System.out.println(emp.getId());
//     }
// }

// 2. parametrized constructor

class Employee {
    String name;
    int id;

    // Parameterized Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("id: " + id);
    }
}

public class constructor {
    public static void main(String[] args) {

        // Using Parameterized Constructor
        Employee emp2 = new Employee("shubham", 121);
        emp2.display();

        // Testing setter and getter methods
        emp2.setName("Rahul");
        emp2.setId(222);
        System.out.println(emp2.getName());
        System.out.println(emp2.getId());
    }
}
