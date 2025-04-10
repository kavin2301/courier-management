package entity;

import java.util.ArrayList;
import java.util.List;

public class CourierCompanyCollection {

    private List<Courier> couriers = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    // Getter for courier list
    public List<Courier> getCouriers() {
        return couriers;
    }

    // Add a courier to the list
    public void addCourier(Courier courier) {
        couriers.add(courier);
    }

    // Remove courier by tracking number
    public boolean removeCourierByTrackingNumber(String trackingNumber) {
        return couriers.removeIf(c -> c.getTrackingNumber().equals(trackingNumber));
    }

    // ✅ Correct method name: findCourierByTrackingNumber
    public Courier findCourierByTrackingNumber(String trackingNumber) {
        for (Courier c : couriers) {
            if (c.getTrackingNumber().equals(trackingNumber)) {
                return c;
            }
        }
        return null;
    }

    // Get couriers assigned to a particular employee
    public List<Courier> getCouriersByEmployeeId(int employeeId) {
        List<Courier> assigned = new ArrayList<>();
        for (Courier c : couriers) {
            if (c.getEmployeeID() != null && c.getEmployeeID() == employeeId) {
                assigned.add(c);
            }
        }
        return assigned;
    }

    // Getter for employee list
    public List<Employee> getEmployees() {
        return employees;
    }

    // Add employee and return their ID
    public int addEmployee(Employee emp) {
        employees.add(emp);
        return emp.getEmployeeID(); // assumes employeeID is set externally or auto-generated
    }

    // Find employee by ID
    public Employee findEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getEmployeeID() == id) {
                return emp;
            }
        }
        return null;
    }
}
