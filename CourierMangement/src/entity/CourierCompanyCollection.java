package entity;

import java.util.ArrayList;
import java.util.List;

public class CourierCompanyCollection {

    private List<Courier> couriers = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public List<Courier> getCouriers() {
        return couriers;
    }

    public void addCourier(Courier courier) {
        couriers.add(courier);
    }

    public boolean removeCourierByTrackingNumber(String trackingNumber) {
        return couriers.removeIf(c -> c.getTrackingNumber().equals(trackingNumber));
    }

    public Courier findCourierByTrackingNumber(String trackingNumber) {
        for (Courier c : couriers) {
            if (c.getTrackingNumber().equals(trackingNumber)) {
                return c;
            }
        }
        return null;
    }

    public List<Courier> getCouriersByEmployeeId(int employeeId) {
        List<Courier> assigned = new ArrayList<>();
        for (Courier c : couriers) {
            if (c.getEmployeeID() != null && c.getEmployeeID() == employeeId) {
                assigned.add(c);
            }
        }
        return assigned;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int addEmployee(Employee emp) {
        employees.add(emp);
        return emp.getEmployeeID(); 
    }

    public Employee findEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getEmployeeID() == id) {
                return emp;
            }
        }
        return null;
    }
}
