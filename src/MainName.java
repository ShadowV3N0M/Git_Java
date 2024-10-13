class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

// Employee.java
 class Company extends Person {
    private int employeeId;
    private String jobTitle;

    public Company(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}
public class MainName {

	public static void main(String[] args) {
		Person person = new Person("John", "Doe");
        System.out.println("Person First Name: " + person.getFirstName());
        System.out.println("Person Last Name: " + person.getLastName());

        Company e = new Company("Jane", "Smith", 12345, "Manager");
        System.out.println("Employee First Name: " + e.getFirstName());
        System.out.println("Employee Last Name: " + e.getLastName());
        System.out.println("Employee ID: " + e.getEmployeeId());
	}
}