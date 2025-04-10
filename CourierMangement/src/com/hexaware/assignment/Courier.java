package com.hexaware.assignment;

class Courier {
    int courierId;
    int senderId;
    int receiverId;
    String packageName;
    String status;

    public Courier(int courierId, int senderId, int receiverId, String packageName, String status) {
        this.courierId = courierId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.packageName = packageName;
        this.status = status;
    }
}

