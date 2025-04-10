package entity;

public class CourierServices {
    private int serviceID;
    private String serviceName;
    private double cost;

    // Default Constructor
    public CourierServices() {}

    // Parameterized Constructor
    public CourierServices(int serviceID, String serviceName, double cost) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.cost = cost;
    }

    // Getters and Setters
    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "CourierServices [serviceID=" + serviceID + ", serviceName=" + serviceName + ", cost=" + cost + "]";
    }
}
