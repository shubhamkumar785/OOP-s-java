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

// class Calculator {
//     public int add(int a, int b) {
//         return a + b;
//     }

//     public int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     public int add(int a, int b, int c, int d) {
//         return a + b + c + d;
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println(calc.add(2, 4));
//         System.out.println(calc.add(2, 4, 6));
//         System.out.println(calc.add(2, 4, 6, 8));
//     }
// }




// class Employee {
// String name;
// int Salary;

// public Employee(String name, int Salary) {
// this.name = name;
// this.Salary = Salary;
// }

// public void setName(String name) {
// this.name = name;
// }

// public String getName() {
// return name;
// }

// public void setSalary(int Salary) {
// this.Salary = Salary;
// }

// public int getSalary() {
// return Salary;
// }

// public void display() {
// System.out.println("Employee Name: " + name);
// System.out.println("Employee Salary: " + Salary);
// }
// }

// public class practice {
// public static void main(String[] args) {
// Employee e1 = new Employee("Shubham", 10000);
// e1.display();

// e1.setName("Subhanshu");
// e1.setSalary(10000);
// System.out.println(e1.getName());
// System.out.println(e1.getSalary());
// }
// }

// class cellphone{
// public void ringing(){
// System.out.println("ringing...");
// }
// public void vibrating(){
// System.out.println("vibrating...");
// }
// }

// public class practice{
// public static void main(String[] args) {
// cellphone cp = new cellphone();

// cp.ringing();
// cp.vibrating();
// }
// }

// class square{
// int side;

// public square(int side){
// this.side = side;
// }

// public int area(){
// return side * side;
// }
// public int perimeter(){
// return 4 * side;
// }
// }

// public class practice {
// public static void main(String[] args) {
// square s = new square(4);

// System.out.println(s.area());
// System.out.println(s.perimeter());
// }
// }

/*
 * 
 * Access Modifier
 * 
 * 1. public --- all packages
 * 2. private --- same class
 * 3. Default --- same package
 * 
 */

/*
 * 
 * class student {
 * private String name;
 * private int roll;
 * 
 * public student(String name, int roll){
 * this.name = name;
 * this.roll = roll;
 * }
 * public void display(){
 * System.out.println("name:  " + name);
 * System.out.println("roll no:  " + roll);
 * }
 * }
 * 
 * 
 * public class practice {
 * public static void main(String[] args) {
 * student s1 = new student("shubham", 12);
 * s1.display();
 * }
 * }
 */

// using getter and setter and constructor both used

/*
 * class student{
 * private String name;
 * private int roll;
 * 
 * public student(String name, int roll){
 * this.name = name;
 * this.roll = roll;
 * }
 * 
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return name;
 * }
 * public void setRoll(int roll){
 * this.roll = roll;
 * }
 * public int getRoll(){
 * return roll;
 * }
 * public void display(){
 * System.out.println("name: " + name);
 * System.out.println("roll no: " + roll);
 * }
 * }
 * 
 * 
 * public class practice {
 * public static void main(String[] args) {
 * student s1 = new student("subhanshu",12);
 * s1.display();
 * s1.setName("shubham");
 * s1.setRoll(01);
 * System.out.println("name: " + s1.getName());
 * System.out.println("roll no: " + s1.getRoll());
 * }
 * }
 * 
 * 
 * 
 * 
 * class cellphone{
 * public void ringing(){
 * System.out.println("phone is ringing...");
 * }
 * public void vibrating(){
 * System.out.println("phone is vibrating...");
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * cellphone cp = new cellphone();
 * cp.ringing();
 * cp.vibrating();
 * }
 * }
 * 
 * 
 * 
 * 
 * class square{
 * int side;
 * 
 * public square(int side){
 * this.side = side;
 * }
 * public int getArea(){
 * return side * side;
 * }
 * public int getPerimeter(){
 * return 4 * side;
 * }
 * public void display(){
 * System.out.println("Area of a square is: " + getArea());
 * System.out.println("Perimeter of a square is: " + getPerimeter());
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * square s = new square(4);
 * s.display();
 * }
 * }
 * 
 * 
 * 
 * class rectangle{
 * int length;
 * int breadth;
 * 
 * public rectangle(int length, int breadth){
 * this.length = length;
 * this.breadth = breadth;
 * }
 * public int getArea(){
 * return length * breadth;
 * }
 * public int getPerimeter(){
 * return 2 * (length + breadth);
 * }
 * public void display(){
 * System.out.println("Area of rectangle: " + getArea());
 * System.out.println("Perimeter of rectangle: " + getPerimeter());
 * }
 * }
 * 
 * public class oop {
 * public static void main(String[] args) {
 * rectangle rec = new rectangle(2, 4);
 * rec.display();
 * }
 * }
 * 
 * 
 * 
 * 
 * class TommyVecetti {
 * public void hit(){
 * System.out.println("hitting...");
 * }
 * public void run(){
 * System.out.println("running...");
 * }
 * public void fire(){
 * System.out.println("firing...");
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * TommyVecetti tv = new TommyVecetti();
 * tv.hit();
 * tv.run();
 * tv.fire();
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * // constructor - constructor is a similar to a function which name is same as
 * a class name.
 * // there is two types of constructor in java
 * // 1. defsult constructor
 * // 2. parametrized constructor
 * 
 * 
 * 
 * 
 * class Employee{
 * String name;
 * int id;
 * 
 * public Employee(){
 * name = "shubham";
 * id = 101;
 * }
 * public void setName(String name){
 * this. name = name;
 * }
 * public String getName(){
 * return name;
 * }
 * public void setId(int id){
 * this.id = id;
 * }
 * public int getId(){
 * return id;
 * }
 * public void display(){
 * System.out.println("name: "+ name);
 * System.out.println("id: "+ id);
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * Employee emp = new Employee();
 * emp.display();
 * emp.setName("shubham");
 * emp.setId(121);
 * System.out.println(emp.getName());
 * System.out.println(emp.getId());
 * }
 * }
 * 
 * 
 * 
 * 
 * // question on access modifier
 * 
 * 
 * class cylinder{
 * int radius;
 * int height;
 * 
 * public void setRadius(int radius){
 * this.radius = radius;
 * }
 * public int getRadius(){
 * return radius;
 * }
 * public void setHeight(int height){
 * this.height = height;
 * }
 * public int getHeight(){
 * return height;
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * cylinder c = new cylinder();
 * c.setRadius(4);
 * c.setHeight(8);
 * System.out.println("radius: " + c.getRadius());
 * System.out.println("height: " + c.getHeight());
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * class cylinder{
 * int radius;
 * int height;
 * 
 * public void setRadius(int radius){
 * this.radius = radius;
 * }
 * public int getRadius(){
 * return radius;
 * }
 * public void setHeight(int height){
 * this.height = height;
 * }
 * public int getHeight(){
 * return height;
 * }
 * public double getSurfaceArea() {
 * return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
 * }
 * 
 * public double getVolume(){
 * return Math.PI * radius * radius * height;
 * }
 * public void display(){
 * System.out.println("Surface area: " + getSurfaceArea());
 * System.out.println("volume: " + getVolume());
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * cylinder c = new cylinder();
 * c.setRadius(4);
 * c.setHeight(8);
 * System.out.println("radius: " + c.getRadius());
 * System.out.println("height: " + c.getHeight());
 * c.display();
 * }
 * }
 * 
 * 
 * 
 * 
 * class Cylinder{
 * int radius;
 * int height;
 * 
 * public Cylinder(int radius, int height){
 * this.radius = radius;
 * this.height = height;
 * }
 * public void display(){
 * System.out.println("radius: " + radius);
 * System.out.println("height: " + height);
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * Cylinder c = new Cylinder(4, 6);
 * c.display();
 * }
 * }
 * 
 * 
 * 
 * 
 * class rectangle{
 * int length;
 * int breadth;
 * 
 * public rectangle(){
 * this.length = 4;
 * this.breadth = 5;
 * }
 * public rectangle(int length, int breadth){
 * this.length = length;
 * this.breadth = breadth;
 * }
 * public int getLength(){
 * return length;
 * }
 * public int getBreadth(){
 * return breadth;
 * }
 * public int getArea(){
 * return length * breadth;
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * rectangle rec = new rectangle();
 * System.out.println("Default constrictor");
 * System.out.println("length: " + rec.getLength());
 * System.out.println("breadth: " + rec.getBreadth());
 * System.out.println("area: " + rec.getArea());
 * 
 * 
 * rectangle rec1 = new rectangle(10, 20);
 * System.out.println("custom constructor");
 * System.out.println("length: " + rec1.getLength());
 * System.out.println("breadth: " + rec1.getBreadth());
 * System.out.println("area: " + rec1.getArea());
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * // Inheritance -- deriving new things from a existing things
 * 
 * class Base{
 * int x;
 * 
 * public void setX(int x){
 * System.out.println("I am in base and setting x now");
 * this.x = x;
 * }
 * public int getX(){
 * return x;
 * }
 * public void printMe(){
 * System.out.println("I am a base class constructor");
 * }
 * }
 * 
 * class Derived extends Base{
 * int y;
 * 
 * public void setY(int y){
 * System.out.println("I am in derived and setting y now");
 * this.y = y;
 * }
 * public int getY(){
 * return y;
 * }
 * public void printMe(){
 * System.out.println("I am a derived class constructor");
 * }
 * 
 * 
 * }
 * public class practice {
 * public static void main(String[] args) {
 * Base b = new Base();
 * b.setX(4);
 * System.out.println(b.getX());
 * 
 * Derived d = new Derived();
 * d.setY(43);
 * System.out.println(d.getY());
 * 
 * 
 * 
 * }
 * }
 * 
 * 
 * 
 * 
 * class Base{
 * public int x;
 * Base(){
 * System.out.println("I am a constructor of Base class");
 * }
 * Base(int x){
 * System.out.println("I am an overloaded constructor with value of x as: " +
 * x);
 * }
 * }
 * class Derived extends Base{
 * public int y;
 * public Derived() {
 * // super(0);
 * System.out.println("I am a constructor of derived class");
 * }
 * public Derived(int x, int y){
 * super(x);
 * System.out.
 * println("I am an overloaded constructor of derived with value of y as: " +
 * y);
 * }
 * }
 * 
 * class childOfDerived extends Derived{
 * childOfDerived(){
 * System.out.println("I am a constructor of childOfDerived class");
 * }
 * childOfDerived(int x, int y, int z){
 * super(x, y);
 * System.out.
 * println("I am an overloaded constructor of childOfDerived with value of z as: "
 * + z);
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * // Base b = new Base();
 * // Derived d = new Derived(1, 2,3);
 * childOfDerived cd = new childOfDerived(1, 2, 3);
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * // this keyword is a reference
 * 
 * class EkClass{
 * int a;
 * 
 * public EkClass(int a){
 * this.a = a;
 * }
 * public int getA(){
 * return a;
 * }
 * }
 * 
 * 
 * public class practice {
 * public static void main(String[] args) {
 * EkClass ek = new EkClass(5);
 * System.out.println(ek.getA());
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * // method overloading - two or more method have same name but different
 * parameters
 * // method overriding - two or method have same name and same parameters
 * 
 * class A{
 * public int a;
 * public void meth2(){
 * System.out.println("I am method 2 of class A");
 * }
 * }
 * class B extends A{
 * 
 * @Override
 * public void meth2(){
 * System.out.println("I am method 2 of class B");
 * }
 * public void meth3(){
 * System.out.println("I am method 3 of class B");
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * B b = new B();
 * b.meth2();
 * }
 * }
 * 
 * 
 * 
 * 
 * // dynamic method dispatch
 * 
 * class phone{
 * public void greet(){
 * System.out.println("Good morning");
 * }
 * public void name(){
 * System.out.println("My name is java");
 * }
 * }
 * class smartphone extends phone {
 * public void welcome(){
 * System.out.println("welcome");
 * }
 * 
 * @Override
 * public void name(){
 * System.out.println("My name is java in class two");
 * }
 * }
 * public class practice {
 * public static void main(String[] args) {
 * // phone obj = new phone();
 * // smartphone smobj = new smartphone();
 * // obj.name();
 * 
 * phone obj = new smartphone();
 * obj.greet();
 * obj.name();
 * }
 * }
 * 
 * 
 * 
 * 
 * class circle {
 * int radius;
 * 
 * public circle(int radius){
 * this.radius = radius;
 * }
 * public double getArea(){
 * return Math.PI * radius * radius;
 * }
 * }
 * 
 * class cylinder extends circle{
 * int height;
 * 
 * public cylinder(int radius, int height){
 * super(radius);
 * this.height = height;
 * }
 * 
 * @Override
 * public double getArea() {
 * return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
 * }
 * }
 * 
 * 
 * public class practice {
 * public static void main(String[] args) {
 * cylinder cn = new cylinder(2,4);
 * System.out.println("area of cylinder is: " + cn.getArea());
 * }
 * }
 * 
 * 
 * 
 * 
 * // create a class rectangle and use inheritance to create another class
 * cuboid. try to keep it as close to real world scenario as possible
 * 
 * class rectangle {
 * int length;
 * int breadth;
 * 
 * public rectangle(int length, int breadth){
 * this.length = length;
 * this.breadth = breadth;
 * }
 * public int getLength(){
 * return length;
 * }
 * public int getBreadth(){
 * return breadth;
 * }
 * public int getArea(){
 * return length * breadth;
 * }
 * }
 * class cuboid extends rectangle{
 * int height;
 * 
 * public cuboid(int length, int breadth, int height){
 * super(length, breadth);
 * this.height = height;
 * }
 * public int getHeight(){
 * return height;
 * }
 * 
 * @Override
 * public int getArea(){
 * return 2 * length * breadth + 2 * breadth * height + 2 * length * height;
 * }
 * }
 * 
 * 
 * public class practice {
 * public static void main(String[] args) {
 * cuboid cb = new cuboid(2, 4, 6);
 * System.out.println(cb.getArea());
 * }
 * }
 * 
 * 
 * 
 * 
 * // oop's questions
 * 
 * 
 * //Write a Java program to create a class Student with attributes name,
 * rollNumber, and marks. Create multiple student objects and display their
 * details.
 * 
 * 
 * 
 * class student {
 * String name;
 * int rollNumber;
 * int marks;
 * 
 * public student(String name, int rollNumber, int marks){
 * this.name = name;
 * this.rollNumber = rollNumber;
 * this.marks = marks;
 * }
 * public void details(){
 * System.out.println("name: " + name);
 * System.out.println("rollNumber: " + rollNumber);
 * System.out.println("marks: " + marks);
 * }
 * }
 * public class practice {
 * public static void main(String[] args) {
 * student std = new student("shubham", 01, 44);
 * student std1 = new student("subhanshu", 02, 48);
 * std.details();
 * std1.details();
 * }
 * }
 * 
 * 
 * 
 * // mplement a class BankAccount with private attributes accountNumber,
 * balance, and methods deposit() and withdraw(). Ensure the balance cannot be
 * directly accessed from outside the class.
 * 
 * class BankAccount{
 * private String accountNumber;
 * private double balance;
 * 
 * public BankAccount(String accountNumber, double balance){
 * this.accountNumber = accountNumber;
 * this.balance = balance;
 * }
 * public void deposit(double amount){
 * if(amount > 0){
 * balance += amount;
 * System.out.println("Deposited: " + amount);
 * }
 * else{
 * System.out.println("Invalid deposit amount");
 * }
 * }
 * public void withdraw(double amount){
 * if(amount > 0 && amount <= balance){
 * balance -= amount;
 * System.out.println("Withdrawn: " + amount);
 * }
 * else{
 * System.out.println("Insuffficient balance");
 * }
 * }
 * public double getBalance(){
 * return balance;
 * }
 * 
 * }
 * public class practice {
 * public static void main(String[] args) {
 * BankAccount BA = new BankAccount("450320345", 1000);
 * BA.deposit(10000);
 * BA.withdraw(5000);
 * System.out.println("Final Balance: " + BA.getBalance());
 * }
 * }
 * 
 * 
 * 
 * // Create a base class Animal with a method makeSound(). Derive classes Dog
 * and Cat from Animal and override makeSound() to print specific sounds.
 * 
 * class Animal{
 * public void makeSound(){
 * System.out.println("sound...");
 * }
 * }
 * class Dog extends Animal {
 * 
 * @Override
 * public void makeSound(){
 * System.out.println("Woof! Woof!");
 * }
 * }
 * class cat extends Animal{
 * 
 * @Override
 * public void makeSound(){
 * System.out.println("Meow! Meow!");
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * Animal Ani = new Animal();
 * Ani.makeSound();
 * 
 * Dog dg = new Dog();
 * dg.makeSound();
 * 
 * cat ct = new cat();
 * ct.makeSound();
 * }
 * }
 * 
 * 
 * 
 * // Create a class Calculator with overloaded methods add() that accept
 * different numbers of parameters (e.g., two integers, three integers, or two
 * double values).
 * 
 * class Calculator{
 * 
 * public int add(int a, int b){
 * return a + b;
 * }
 * public int add(int a, int b, int c){
 * return a + b + c;
 * }
 * public double add(double a, double b){
 * return a + b;
 * }
 * public double add(double a, double b, double c){
 * return a + b + c;
 * }
 * }
 * public class practice {
 * public static void main(String[] args) {
 * Calculator cl = new Calculator();
 * System.out.println(cl.add(1, 2));
 * System.out.println(cl.add(1, 2,3));
 * }
 * }
 * 
 * 
 * 
 * 
 * // Define a base class Vehicle with a method speed(). Derive Car and Bike
 * from Vehicle and override speed() to display their respective speeds.
 * 
 * class vehicle {
 * int time;
 * int distance;
 * 
 * public vehicle(int time, int distance){
 * this.time = time;
 * this.distance = distance;
 * }
 * public double speed(){
 * return distance / time;
 * }
 * }
 * class Car extends vehicle{
 * public Car(int time, int distance){
 * super(time, distance);
 * }
 * 
 * @Override
 * public double speed(){
 * return distance / time;
 * }
 * }
 * class Bike extends vehicle {
 * public Bike(int time, int distance) {
 * super(time, distance);
 * }
 * 
 * @Override
 * public double speed() {
 * System.out.println("Bike Speed:");
 * return distance / time;
 * }
 * }
 * public class practice{
 * public static void main(String[] args) {
 * vehicle v = new vehicle(2, 4);
 * System.out.println("vehicle speed: " + v.speed() + " m/s");
 * 
 * Car c = new Car(6, 2);
 * System.out.println("car speed: " + v.speed() + " m/s");
 * 
 * Bike b = new Bike(8, 2);
 * System.out.println("Bike speed: " + v.speed() + " m/s");
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * class BankAccount{
 * String accountNumber;
 * double balance;
 * 
 * public BankAccount(String accountNumber, double balance){
 * this.accountNumber = accountNumber;
 * this.balance = balance;
 * }
 * public void balance(){
 * System.out.println("Balance: " + balance);
 * }
 * public void deposit(double amount){
 * if(amount > 0){
 * balance += amount;
 * System.out.println("Deposit Amount: " + amount);
 * }
 * else{
 * System.out.println("Invalid deposit amount");
 * }
 * }
 * public void withdraw(double amount){
 * if(amount > 0 && amount <= balance){
 * balance -= amount;
 * System.out.println("Withdrawn amount: " + amount);
 * }
 * else{
 * System.out.println("Invalid withdrawal amount or insufficient balance.");
 * }
 * }
 * public double getBalance(){
 * return balance;
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * BankAccount RBI = new BankAccount("123456789", 5000);
 * RBI.balance();
 * RBI.deposit(10000);
 * RBI.withdraw(5000);
 * System.out.println("Balance: " + RBI.getBalance());
 * }
 * }
 * 
 * 
 * 
 * 
 * //Write a class Book with multiple constructors to initialize books with
 * different details (e.g., title only, title and author, title, author, and
 * price).
 * 
 * 
 * class Book {
 * String title;
 * String author;
 * double price;
 * 
 * public Book(String title){
 * this.title = title;
 * this.author = "unknown";
 * this.price = 0.0;
 * }
 * public Book(String title, String author){
 * this.title = title;
 * this.author = author;
 * this.price = 0.0;
 * }
 * public Book(String title, String author, double price){
 * this.title = title;
 * this.author = author;
 * this.price = price;
 * }
 * 
 * public void details(){
 * System.out.println("Title: " + title);
 * System.out.println("Author: " + author);
 * System.out.println("Price: " + price);
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * Book book1 = new Book("Java programming");
 * Book book2 = new Book("Python" , "H.C verma");
 * Book book3 = new Book("C++ Advanced", "Jane smith", 499.0);
 * 
 * book1.details();
 * book2.details();
 * book3.details();
 * }
 * }
 * 
 * 
 * 
 * 
 * // Polymorphism (Upcasting and Downcasting)
 * // Create a base class Employee with a method work(). Create derived classes
 * Developer and Manager that override work(). Demonstrate upcasting and
 * downcasting.
 * 
 * 
 * class Employee{
 * public void work(){
 * System.out.println("Employee is working...");
 * }
 * }
 * class Developer extends Employee{
 * 
 * @Override
 * public void work(){
 * System.out.println("Developer is coding...");
 * }
 * public void debug(){
 * System.out.println("Developer is debugging code...");
 * }
 * 
 * }
 * class Manager extends Employee{
 * 
 * @Override
 * public void work(){
 * System.out.println("Manager is managing project...");
 * }
 * public void conductMeeting(){
 * System.out.println("Manager is conducting a meeting...");
 * }
 * 
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * Employee emp1 = new Developer();
 * Employee emp2 = new Manager();
 * 
 * emp1.work();
 * emp2.work();
 * 
 * if(emp1 instanceof Developer){
 * Developer dev = (Developer) emp1;
 * dev.debug();
 * }
 * 
 * if(emp2 instanceof Manager){
 * Manager mgr = (Manager) emp2;
 * mgr.conductMeeting();
 * }
 * 
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * // Aggregation (Has-a Relationship)
 * // Create a class Engine with attributes horsePower and type. Then create a
 * class Car that has an Engine object as an attribute. Show how composition
 * works in OOP.
 * 
 * 
 * 
 * class Engine {
 * int horsePower;
 * String type;
 * 
 * public Engine(int horsePower, String type){
 * this.horsePower = horsePower;
 * this.type = type;
 * }
 * public void displayEngine(){
 * System.out.println("Engine Type: " + type);
 * System.out.println("Horsepower: " + horsePower + " HP");
 * }
 * }
 * 
 * class car {
 * String brand;
 * Engine engine;
 * 
 * public car(String brand, Engine engine){
 * this.brand = brand;
 * this.engine = engine;
 * }
 * public void displayInfoCar(){
 * System.out.println("Car Brand: " + brand);
 * engine.displayEngine();
 * }
 * }
 * 
 * 
 * public class practice {
 * public static void main(String[] args) {
 * Engine v8 = new Engine(500, "V8");
 * car fordMustang = new car("Ford Mustang", v8);
 * 
 * fordMustang.displayInfoCar();
 * }
 * }
 * 
 * 
 * 
 * 
 * class BankAccount {
 * String accountNumber;
 * double balance;
 * 
 * public BankAccount(String accountNumber, double balance) {
 * this.accountNumber = accountNumber;
 * this.balance = balance;
 * }
 * 
 * public void deposit(double amount) {
 * if (amount > 0) {
 * balance += amount;
 * System.out.println("Deposit amount: " + amount);
 * } else {
 * System.out.println("Invalid to deposit a cash");
 * }
 * }
 * 
 * public void withdraw(double amount) {
 * if (amount > 0 && amount <= balance) {
 * balance -= amount;
 * System.out.println("Withdrawn amount: " + amount);
 * } else {
 * System.out.println("Insufficient Balance");
 * }
 * }
 * 
 * public double getBalance() {
 * return balance;
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * BankAccount SBI = new BankAccount("45031035601", 5000);
 * SBI.deposit(10000);
 * SBI.withdraw(15000);
 * System.out.println("Current Balance: " + SBI.getBalance());
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * // TCS Coding round
 * 
 * // Write a program in Java to create a class Student with attributes name,
 * rollNumber, and marks. Create a method to display student details.
 * 
 * class student {
 * String name;
 * int rollNumber;
 * int marks;
 * 
 * public student(String name, int rollNumber, int marks) {
 * this.name = name;
 * this.rollNumber = rollNumber;
 * this.marks = marks;
 * }
 * 
 * public void displayDetails() {
 * System.out.println("Name of student: " + name);
 * System.out.println("RollNo of student: " + rollNumber);
 * System.out.println("Marks of student: " + marks);
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * student s1 = new student("shubham", 01, 95);
 * s1.displayDetails();
 * }
 * }
 * 
 * 
 * 
 * // Create a BankAccount class with attributes accountNumber, balance, and
 * ownerName. Implement getter and setter methods to access private variables.
 * 
 * class BankAccount {
 * String accountNumber;
 * double balance;
 * String ownerName;
 * 
 * public BankAccount(String accountNumber, double balance, String ownerName) {
 * this.accountNumber = accountNumber;
 * this.balance = balance;
 * this.ownerName = ownerName;
 * }
 * 
 * public double getBalance1() {
 * return balance;
 * }
 * 
 * public void deposit(double amount) {
 * if (amount > 0) {
 * balance += amount;
 * System.out.println("Deposit: " + amount);
 * } else {
 * System.out.println("Invalid to deposit");
 * }
 * }
 * 
 * public void withdraw(double amount) {
 * if (amount > 0 && amount <= balance) {
 * balance -= amount;
 * System.out.println("Withdraw: " + amount);
 * } else {
 * System.out.println("Insufficient balance");
 * }
 * }
 * 
 * public double getBalance() {
 * return balance;
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * BankAccount SBI = new BankAccount("45003109", 5000, "shubham");
 * 
 * SBI.deposit(10000);
 * SBI.withdraw(10000);
 * System.out.println("Current Balance is: " + SBI.getBalance());
 * }
 * }
 * 
 * 
 * 
 * // Create a base class Vehicle with attributes brand and speed. Create a
 * derived class Car that adds an attribute fuelType and displays all details.
 * 
 * class Vehicle {
 * String brand;
 * double speed;
 * 
 * public Vehicle(String brand, double speed) {
 * this.brand = brand;
 * this.speed = speed;
 * }
 * 
 * public void display() {
 * System.out.println("Brand: " + brand + ", Speed: " + speed + "km/h");
 * }
 * }
 * 
 * class car extends Vehicle {
 * String fuelType;
 * 
 * public car(String brand, double speed, String fuelType) {
 * super(brand, speed);
 * this.fuelType = fuelType;
 * }
 * 
 * public void displayCar() {
 * display();
 * System.out.println("Fuel Type: " + fuelType);
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * car myCar = new car("BMW", 280, "Petrol");
 * myCar.displayCar();
 * }
 * }
 * 
 * 
 * 
 * // Create a class Calculator with overloaded methods to add two, three, or
 * four numbers.
 * 
 * class Calculator {
 * public int add(int a, int b) {
 * return a + b;
 * }
 * 
 * public int add(int a, int b, int c) {
 * return a + b + c;
 * }
 * 
 * public int add(int a, int b, int c, int d) {
 * return a + b + c + d;
 * }
 * }
 * 
 * public class practice {
 * public static void main(String[] args) {
 * Calculator calc = new Calculator();
 * System.out.println(calc.add(2, 4));
 * System.out.println(calc.add(2, 4, 6));
 * System.out.println(calc.add(2, 4, 6, 8));
 * }
 * }
 * 
 */

// Create a base class Animal with a method makeSound(). Override this method in
// Dog and Cat

// class Animal {
// public void makeSound() {
// System.out.println("make sound....");
// }
// }

// class Dog extends Animal {
// @Override
// public void makeSound() {
// System.out.println("Bark! Bark!");
// }
// }

// class cat extends Animal {
// @Override
// public void makeSound() {
// System.out.println("Meow! Meow!");
// }
// }

// public class practice {
// public static void main(String[] args) {
// Animal myDog = new Dog();
// Animal myCat = new cat();

// myDog.makeSound();
// myCat.makeSound();
// }
// }

//  new session

//  class - class is a blueprint of object
//  object - object is an instance of a class, entity.

// class Pen {
//     String color;
//     String type;

//     public Pen(String color, String type) {
//         this.color = color;
//         this.type = type;
//     }

//     public void write() {
//         System.out.println("Writing something");
//     }

//     public void printcolor() {
//         System.out.println("color of pen : " + color);
//     }
// }

// class student {
//     String name;
//     int age;

//     student(student s2) {
//         this.name = s2.name;
//         this.age = s2.age;
//     }

//     student() {

//     }

//     public void printInfo() {
//         System.out.println("name : " + name);
//         System.out.println("age : " + age);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Pen p1 = new Pen("blue", "gel");
//         Pen p2 = new Pen("Black", "ballpoint");

//         p1.printcolor();
//         p2.printcolor();

//         student s1 = new student();
//         s1.name = "shubham";
//         s1.age = 20;

//         student s2 = new student(s1);

//         s1.printInfo();
//         s2.printInfo();
//     }
// }

// class shape {
//     public void area(){
//         System.out.println("display area");
//     }
// }
// class Triangle extends shape {
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }
// class equilateralTriangle extends Triangle {
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }

// class circle extends shape {
//     public void area(int r){
//         System.out.println((3.14)* r * r);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Triangle t = new Triangle();

//     }
// }

// abstract class Animal {
//     abstract void walk();

//     public void eat() {
//         System.out.println("Animal eat");
//     }

//     public Animal() {
//         System.out.println("you are creating a new constructor");
//     }

// }

// class horse extends Animal {
//     horse() {
//         System.out.println("created a horse");
//     }

//     public void walk() {
//         System.out.println("walks on 4 legs");
//     }
// }

// class chicken extends Animal {
//     public void walk() {
//         System.out.println("walks on 2 legs");
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         horse h = new horse();
//         h.walk();
//         h.eat();
//     }
// }

// interface Animal {
//     public void walk();
// }

// class horse implements Animal {
//     public void walk() {
//         System.out.println("walks on 4 leg");
//     }
// }

// public class oop {
//     public static void main(String[] args) {
//         horse h = new horse();
//         h.walk();
//     }
// }

// class student {
//     String name;
//     static String school;

//     public static void changeSchool (){
//         school = "newschool";
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         student.school = "sharda";
//         student s = new student();
//         s.name = "shubham";

//         System.out.println(s.school);
//     }
// }

// Create a class Display with overloaded show() methods. Then override show() in a subclass.

// class Display {
//     public void show() {
//         System.out.println("Display - show with no argument");
//     }

//     public void show(String message) {
//         System.out.println("Display - show with message");
//     }

//     public void show(int number) {
//         System.out.println("Display - show with number");
//     }
// }

// class subDisplay extends Display {
//     @Override
//     public void show() {
//         System.out.println("subDisplay - override with no argument");
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Display d = new Display();
//         d.show();
//         d.show("shubham");
//         d.show(12);

//         subDisplay sd = new subDisplay();
//         sd.show();
//         sd.show("subhanshu");
//         sd.show(89);

//     }
// }

// Vehicle class has run(). Override it in Truck and Bike. Demonstrate runtime polymorphism.

// class Vehicle {
//     public void run() {
//         System.out.println("Vehicle is running");
//     }
// }

// class Truck extends Vehicle {
//     @Override
//     public void run() {
//         System.out.println("Truck is running");
//     }
// }

// class Bike extends Vehicle {
//     @Override
//     public void run() {
//         System.out.println("Bike is running");
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Vehicle v = new Vehicle();
//         v.run();

//         Truck t = new Truck();
//         t.run();

//         Bike b = new Bike();
//         b.run();
//     }
// }

// Define Notification class with overloaded constructors. Override send() method in subclass.

// class Notification {
//     String recipient;
//     String message;

//     public Notification() {
//         this.recipient = "unknown";
//         this.message = "No message";
//     }

//     public Notification(String recipient) {
//         this.recipient = recipient;
//     }

//     public Notification(String recipient, String message) {
//         this.recipient = recipient;
//         this.message = message;
//     }

//     public void send() {
//         System.out.println("sending message to " + recipient + " : " + message);
//     }
// }

// class EmailNotification extends Notification {

//     public EmailNotification(String recipient, String message) {
//         super(recipient, message);
//     }

//     @Override
//     public void send() {
//         System.out.println("sending email to " + recipient + " with message " + message);
//     }
// }

// class SMSNOtification extends Notification {
//     public SMSNOtification(String recipient, String message) {
//         this.recipient = recipient;
//         this.message = message;
//     }

//     @Override
//     public void send() {
//         System.out.println("sending sms to " + recipient + " with  message " + message);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Notification n = new Notification();
//         n.send();

//         EmailNotification en = new EmailNotification("shubham@gmail.com", "Interview at 3");
//         en.send();

//         SMSNOtification sn = new SMSNOtification("shubham@gmail.com", "Java interview at 5");
//         sn.send();

//     }
// }

//  Bank class has calculateInterest(). Overload by duration, override in SBI and ICICI.

// class Bank {
//     double rateOfIntrest;

//     public double calculateInterest(double principal) {
//         rateOfIntrest = 5.0;
//         return (principal * rateOfIntrest * 1) / 100;
//     }

//     public double calculateInterest(double principal, int year) {
//         rateOfIntrest = 5.0;
//         return (principal * rateOfIntrest * year) / 100;
//     }

//     public double calculateInterest(double principal, int year, double rateOfIntrest) {
//         return (principal * rateOfIntrest * year) / 100;
//     }
// }

// class SBI extends Bank {
//     public double calculateInterest(double principal) {
//         rateOfIntrest = 8.0;
//         return (principal * rateOfIntrest * 1) / 100;
//     }
// }

// class ICICI extends Bank {
//     public double calculateInterest(double principal) {
//         rateOfIntrest = 8.5;
//         return (principal * rateOfIntrest * 1) / 100;
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Bank b = new Bank();
//         System.out.println("Bank Interest (1 year) : " + b.calculateInterest(100000));
//         System.out.println("Bank Interest (3 year) : " + b.calculateInterest(100000, 3));
//         System.out.println("Bank Interest (3 year - 7.5%) : " + b.calculateInterest(100000, 3, 7.5));

//         SBI sbi = new SBI();
//         System.out.println("SBI Interest (1 year) : " + sbi.calculateInterest(100000));

//         ICICI icici = new ICICI();
//         System.out.println("ICICI Interest (1 year) : " + sbi.calculateInterest(100000));
//     }
// }

//  Build a ChatBot class that overloads respond() method and overrides it in SalesBot and SupportBot.

// class ChatBot {
//     public void respond(){
//         System.out.println("ChatBot : Hello! I can you help you?");
//     }
//     public void respond(String message){
//         System.out.println("ChatBot: You said - " + message);
//     }
//     public void respond(String message, String userType){
//         System.out.println("ChatBot: [" + userType + "] " + message);
//     }
// }
// class SalesBot extends ChatBot{
//     @Override
//     public void respond(){
//         System.out.println("SalesBot: Welcome! Looking for our latest offers?");
//     }
// }
// class SupportBot {
//     public void respond(){
//         System.out.println("SupportBot: Hi there! Tell me your issue, I'm here to help");
//     }
// }

// public class practice{
//     public static void main(String[] args) {
//         ChatBot cb = new ChatBot();
//         cb.respond();

//         SalesBot sb = new SalesBot();
//         sb.respond();

//         SupportBot sbb = new SupportBot();
//         sbb.respond();
//     }
// }

// Method Overloading: Create a Calculator class with overloaded methods add(int, int), add(double, double).

// class calculator {
//     public void add(int a, int b) {
//         System.out.println(a + b);
//     }

//     public void add(double a, double b) {
//         System.out.println(a + b);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         calculator c = new calculator();
//         c.add(2, 3);
//         c.add(5.0, 6.0);
//     }
// }

//  Q2. Method Overriding: Define a Printer class and override print() method in LaserPrinter, InkjetPrinter.

// class printer {
//     public void print(){
//         System.out.println("Printer: Printing a document...");
//     }
// }
// class LaserPrinter  extends printer{
//     @Override
//     public void print(){
//         System.out.println("LaserPrinter: Printing using laser technology.");
//     }
// }
// class InkjetPrinter extends printer{
//     @Override
//     public void print(){
//         System.out.println("InkjetPrinter: Printing using inkjet technology.");
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         printer p = new printer();
//         p.print();

//         LaserPrinter lp = new LaserPrinter();
//         lp.print();

//         InkjetPrinter ip = new InkjetPrinter();
//         ip.print();

//     }
// }

// create a corporate Notification class with method send(). Override it in EmailNotification, SMSNotification.

// class Notification {
//     public void send(){
//         System.out.println("sending coperate notification");
//     }
// }
// class EmailNOtification extends Notification {
//     @Override
//     public void send(){
//         System.out.println("sending email to coperate client");
//     }
// }
// class SMSNOtification extends Notification {
//     @Override
//     public void send(){
//         System.out.println("sending sms to coperate client");
//     }
// }
// public class  practice {
//     public static void main(String[] args) {
//         Notification n = new Notification();
//         n.send();

//         EmailNOtification en = new EmailNOtification();
//         en.send();

//         SMSNOtification sn = new SMSNOtification();
//         sn.send();
//     }
// }

// Build a MediaPlayer interface and implement polymorphic play() methods in MP3Player, MP4Player, WAVPlayer.

// interface MediaPlayer {
//     public void play();
// }

// class MP3Player implements MediaPlayer {
//     public void play() {
//         System.out.println("Playing audio from an MP3 file...");
//     }
// }

// class MP4Player implements MediaPlayer {
//     public void play() {
//         System.out.println("Playing video and audio from an MP4 file...");
//     }
// }

// class WAVPlayer implements MediaPlayer {
//     public void play() {
//         System.out.println("Playing high-quality audio from a WAV file...");
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         MediaPlayer player;

//         player = new MP3Player();
//         player.play();

//         player = new MP4Player();
//         player.play();

//         player = new WAVPlayer();
//         player.play();

//     }
// }

//  In a warehouse system, create Item class with ship() method, overridden in FragileItem, HeavyItem.

class Item {
    public void ship() {
        System.out.println("Shipping item using standard method...");
    }
}

class FragileItem extends Item {
    @Override
    public void ship() {
        System.out.println("Shipping fragile item with extra padding and fragile label.");
    }
}

class HeavyItem extends Item {
    @Override
    public void ship() {
        System.out.println("Shipping heavy item using forklift and reinforced packaging.");
    }
}

public class practice {
    public static void main(String[] args) {
        Item item;

        item = new FragileItem();
        item.ship();

        item = new HeavyItem();
        item.ship();
    }
}
