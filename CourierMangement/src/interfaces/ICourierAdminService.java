package interfaces;

import entity.Employee;

public interface ICourierAdminService extends ICourierUserService {
    void addCourierStaff(Employee emp);
    boolean assignEmployeeToOrder(String trackingNumber, int employeeId);
    boolean deleteCourier(String trackingNumber);
}
