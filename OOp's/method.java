/*
    In Java, a method (also known as a function) is a block of code that performs a specific task and can be called for execution.

    There are two types of method in java.
    1. method overloading
    2. method overriding
 */

//  1. method overloading - two or more method have same name but difeerent parameters.

// public class method {
//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static int sum(int a, int b, int c) {
//         return a + b + c;
//     }

//     public static int sum(int a, int b, int c, int d) {
//         return a + b + c + d;
//     }

//     public static void display() {
//         System.out.println("sum of a + b is: " + sum(2, 4));
//         System.out.println("sum of a + b + c is: " + sum(2, 4, 6));
//         System.out.println("sum of a + b + c + d is: " + sum(2, 4, 6, 8));
//     }

//     public static void main(String[] args) {
//         method m = new method();
//         m.display();
//     }

// }

// 2. method overriding - two or more method have same name and same parameters.

class A {
    public int a;

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {

    @Override
    public void meth2() {
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }
}

public class method {
    public static void main(String[] args) {
        B b = new B();
        b.meth2();
    }
}