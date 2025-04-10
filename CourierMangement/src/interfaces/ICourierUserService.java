package interfaces;

import java.util.List;

import entity.Courier;
import exceptions.TrackingNumberNotFoundException;

public interface ICourierUserService {
    String placeOrder(Courier courier);
    Courier getOrderDetails(String trackingNumber);
    List<Courier> getAssignedOrder(int employeeId);
    String getOrderStatus(String trackingNumber) throws TrackingNumberNotFoundException;
    boolean cancelOrder(String trackingNumber) throws TrackingNumberNotFoundException;
}
