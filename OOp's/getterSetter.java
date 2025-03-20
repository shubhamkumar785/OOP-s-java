class Employee {
    String name;
    int Salary;

    public Employee(String name, int Salary) {
        this.name = name;
        this.Salary = Salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getSalary() {
        return Salary;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + Salary);
    }
}

public class getterSetter {
    public static void main(String[] args) {
        Employee e1 = new Employee("Shubham", 10000);
        e1.display();

        e1.setName("Subhanshu");
        e1.setSalary(10000);
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}