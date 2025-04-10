package entity;

public class Employee {
    private int employeeID;
    private int userID;
    private String role;
    private double salary;
    private String name;

    // Default Constructor
    public Employee() {}

    // Parameterized Constructor
    public Employee(int employeeID, int userID, String role, double salary, String name) {
        this.employeeID = employeeID;
        this.userID = userID;
        this.role = role;
        this.salary = salary;
        this.name = name;
    }

    // Getters and Setters
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [employeeID=" + employeeID + ", userID=" + userID + ", role=" + role + ", salary=" + salary
                + ", name=" + name + "]";
    }
}
