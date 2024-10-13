import java.util.*;
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

// HRManager.java
class HRManager extends Employee {

    public HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing HR activities.");
    }

    public void addEmployee(Employee employee) {
        System.out.println(getName() + " added a new employee: " + employee.getName());
    }
}
public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Employee emp1 = new Employee("Alice", 50000);
	        emp1.work();
	        System.out.println("Salary: " + emp1.getSalary());

	        HRManager hrManager = new HRManager("Bob", 70000);
	        hrManager.work();
	        System.out.println("Salary: " + hrManager.getSalary());

	        hrManager.addEmployee(emp1);
	}
}
