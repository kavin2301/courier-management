package entity;

import java.util.Date;

public class Courier {
    private static int trackingNumberSeed = 1000; 

    private int courierID;
    private int senderUserID;
    private int receiverUserID;
    private String packageName;
    private int numberOfPackages;
    private double weight;
    private String status; 
    private String trackingNumber;
    private Date createdDate;
    private Date deliveryDate;
    private int serviceID;
    private Integer employeeID; 
    
  
    public Courier() {
        this.trackingNumber = "TRK" + (++trackingNumberSeed);
        this.createdDate = new Date(); 
        this.status = "Processing";
    }

    
    public Courier(int senderUserID, int receiverUserID, String packageName,
                   int numberOfPackages, double weight, int serviceID) {
        this(); 
        this.senderUserID = senderUserID;
        this.receiverUserID = receiverUserID;
        this.packageName = packageName;
        this.numberOfPackages = numberOfPackages;
        this.weight = weight;
        this.serviceID = serviceID;
    }


    public int getCourierID() {
        return courierID;
    }

    public void setCourierID(int courierID) {
        this.courierID = courierID;
    }

    public int getSenderUserID() {
        return senderUserID;
    }

    public void setSenderUserID(int senderUserID) {
        this.senderUserID = senderUserID;
    }

    public int getReceiverUserID() {
        return receiverUserID;
    }

    public void setReceiverUserID(int receiverUserID) {
        this.receiverUserID = receiverUserID;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(int numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public static int getTrackingNumberSeed() {
        return trackingNumberSeed;
    }

    public static void setTrackingNumberSeed(int trackingNumberSeed) {
        Courier.trackingNumberSeed = trackingNumberSeed;
    }
}