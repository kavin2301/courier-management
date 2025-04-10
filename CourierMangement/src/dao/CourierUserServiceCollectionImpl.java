package dao;

import java.util.List;

import entity.Courier;
import entity.CourierCompanyCollection;
import exceptions.TrackingNumberNotFoundException;
import interfaces.ICourierUserService;

public class CourierUserServiceCollectionImpl implements ICourierUserService {

    protected CourierCompanyCollection companyObj = new CourierCompanyCollection();

    @Override
    public String placeOrder(Courier courier) {
        companyObj.addCourier(courier);
        return courier.getTrackingNumber();
    }

    @Override
    public Courier getOrderDetails(String trackingNumber) {
        return companyObj.findCourierByTrackingNumber(trackingNumber);
    }

    @Override
    public List<Courier> getAssignedOrder(int employeeId) {
        return companyObj.getCouriersByEmployeeId(employeeId);
    }

    @Override
    public String getOrderStatus(String trackingNumber) throws TrackingNumberNotFoundException {
        Courier c = companyObj.findCourierByTrackingNumber(trackingNumber);
        if (c == null) throw new TrackingNumberNotFoundException("Tracking number not found");
        return c.getStatus();
    }

    @Override
    public boolean cancelOrder(String trackingNumber) throws TrackingNumberNotFoundException {
        Courier c = companyObj.findCourierByTrackingNumber(trackingNumber);
        if (c == null) throw new TrackingNumberNotFoundException("Tracking number not found");
        c.setStatus("cancelled");
        return true;
    }
}
