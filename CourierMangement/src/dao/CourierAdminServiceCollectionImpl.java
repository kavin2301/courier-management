package dao;

import entity.Courier;
import entity.Employee;
import exceptions.InvalidEmployeeIdException;
import interfaces.ICourierAdminService;

public class CourierAdminServiceCollectionImpl extends CourierUserServiceCollectionImpl implements ICourierAdminService {

    @Override
    public void addCourierStaff(Employee emp) {
        companyObj.addEmployee(emp);
    }

    @Override
    public boolean assignEmployeeToOrder(String trackingNumber, int employeeId) {
        Courier courier = companyObj.findCourierByTrackingNumber(trackingNumber);
        if (courier == null) {
            return false;
        }

        if (companyObj.findEmployeeById(employeeId) == null) {
            throw new InvalidEmployeeIdException("Employee ID not found: " + employeeId);
        }

        courier.setEmployeeID(employeeId);
        courier.setStatus("inTransit");
        return true;
    }

    @Override
    public boolean deleteCourier(String trackingNumber) {
        return companyObj.removeCourierByTrackingNumber(trackingNumber);
    }
}
