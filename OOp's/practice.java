//  Q1. Create a BankAccount class with attributes accountNumber, balance, and
//   ownerName. Implement getter and setter methods to access private variables.

// class BankAccount {
//     String accountNumber;
//     double balance;

//     public BankAccount(String accountNumber, double balance) {
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//     }

//     public void balance() {
//         System.out.println("Balance: " + balance);
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposit Amount: " + amount);
//         } else {
//             System.out.println("Invalid deposit amount");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn amount: " + amount);
//         } else {
//             System.out.println("Invalid withdrawal amount or insufficient balance.");
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         BankAccount RBI = new BankAccount("123456789", 5000);

//         RBI.balance();

//         RBI.deposit(10000);

//         RBI.withdraw(5000);

//         System.out.println("Balance: " + RBI.getBalance());
//     }
// }

// Q2. Write a class Book with multiple constructors to initialize books with
//     different details (e.g., title only, title and author, title, author, and
//     price).

// class Book {
//     String title;
//     String author;
//     double price;

//     public Book(String title) {
//         this.title = title;
//         this.author = "unknown";
//         this.price = 0.0;
//     }

//     public Book(String title, String author) {
//         this.title = title;
//         this.author = author;
//         this.price = 0.0;
//     }

//     public Book(String title, String author, double price) {
//         this.title = title;
//         this.author = author;
//         this.price = price;
//     }

//     public void details() {
//         System.out.println("Title: " + title);
//         System.out.println("Author: " + author);
//         System.out.println("Price: " + price);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Book book1 = new Book("Java programming");
//         Book book2 = new Book("Python", "H.C verma");
//         Book book3 = new Book("C++ Advanced", "Jane smith", 499.0);

//         book1.details();
//         book2.details();
//         book3.details();
//     }
// }

//  Q3. Create a base class Employee with a method work(). Create derived classes
//  Developer and Manager that override work(). Demonstrate upcasting and
//  downcasting.

// class Employee {
//     public void work() {
//         System.out.println("Employee is working...");
//     }
// }

// class Developer extends Employee {
//     @Override
//     public void work() {
//         System.out.println("Developer is coding...");
//     }

//     public void debug() {
//         System.out.println("Developer is debugging code...");
//     }
// }

// class Manager extends Employee {
//     @Override
//     public void work() {
//         System.out.println("Manager is managing project...");
//     }

//     public void conductMeeting() {
//         System.out.println("Manager is conducting a meeting...");
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Employee emp1 = new Developer();
//         Employee emp2 = new Manager();

//         emp1.work();
//         emp2.work();

//         if (emp1 instanceof Developer) {
//             Developer dev = (Developer) emp1;
//             dev.debug();
//         }

//         if (emp2 instanceof Manager) {
//             Manager mgr = (Manager) emp2;
//             mgr.conductMeeting();
//         }
//     }
// }

// Q4. Aggregation (Has-a Relationship)
// Create a class Engine with attributes horsePower and type. Then create a
// class Car that has an Engine object as an attribute. Show how composition
// works in OOP.

// class Engine {
//     int horsePower;
//     String type;

//     public Engine(int horsePower, String type) {
//         this.horsePower = horsePower;
//         this.type = type;
//     }

//     public void displayEngine() {
//         System.out.println("Engine Type: " + type);
//         System.out.println("Horsepower: " + horsePower + " HP");
//     }
// }

// class car {
//     String brand;
//     Engine engine;

//     public car(String brand, Engine engine) {
//         this.brand = brand;
//         this.engine = engine;
//     }

//     public void displayInfoCar() {
//         System.out.println("Car Brand: " + brand);
//         engine.displayEngine();
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Engine v8 = new Engine(500, "V8");
//         car fordMustang = new car("Ford Mustang", v8);

//         fordMustang.displayInfoCar();
//     }
// }

// Write a program in Java to create a class Student with attributes name,
// rollNumber, and marks. Create a method to display student details.

//  class student {
//     String name;
//     int rollNumber;
//     int marks;

//     public student(String name, int rollNumber, int marks) {
//         this.name = name;
//         this.rollNumber = rollNumber;
//         this.marks = marks;
//     }

//     public void displayDetails() {
//         System.out.println("Name of student: " + name);
//         System.out.println("RollNo of student: " + rollNumber);
//         System.out.println("Marks of student: " + marks);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         student s1 = new student("shubham", 1, 95);
//         s1.displayDetails();
//     }
// }

// Create a base class Animal with a method makeSound(). Override this method in
// Dog and Cat

// class Animal {
//     public void makeSound() {
//         System.out.println("make sound....");
//     }
// }

// class Dog extends Animal {
//     @Override
//     public void makeSound() {
//         System.out.println("Bark! Bark!");
//     }
// }

// class cat extends Animal {
//     @Override
//     public void makeSound() {
//         System.out.println("Meow! Meow!");
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Animal myDog = new Dog();
//         Animal myCat = new cat();

//         myDog.makeSound();
//         myCat.makeSound();
//     }
// }

// Create a class Calculator with overloaded methods to add two, three, or
// four numbers.

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

public class practice {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 4));
        System.out.println(calc.add(2, 4, 6));
        System.out.println(calc.add(2, 4, 6, 8));
    }
}
