INSERT INTO User (Name, Email, Password, ContactNumber, Address) VALUES
('John Doe', 'johndoe@example.com', 'password123', '9876543210', '123 Main St, New York, NY'),
('Alice Smith', 'alice.smith@example.com', 'alicepass456', '9123456789', '456 Elm St, San Francisco, CA'),
('Bob Johnson', 'bob.johnson@example.com', 'bobsecure789', '9234567890', '789 Oak St, Chicago, IL'),
('Charlie Brown', 'charlie.b@example.com', 'charliepass101', '9345678901', '321 Pine St, Houston, TX'),
('Emma Wilson', 'emma.w@example.com', 'emma123pass', '9456789012', '555 Maple St, Los Angeles, CA'),
('David Miller', 'david.m@example.com', 'davidstrong987', '9567890123', '777 Cedar St, Seattle, WA'),
('Sophia Lee', 'sophia.lee@example.com', 'sophia999', '9678901234', '999 Birch St, Miami, FL'),
('Ethan Martinez', 'ethan.m@example.com', 'ethansecure555', '9789012345', '111 Redwood St, Denver, CO'),
('Olivia Davis', 'olivia.d@example.com', 'oliviaqwerty', '9890123456', '222 Cherry St, Boston, MA'),
('Liam Anderson', 'liam.a@example.com', 'liamstrong444', '9901234567', '333 Spruce St, Atlanta, GA');

INSERT INTO CourierServices (ServiceName, Cost) VALUES
('Standard Delivery', 5.99),
('Express Delivery', 9.99),
('Same-Day Delivery', 14.99),
('Overnight Shipping', 19.99),
('International Express', 49.99);

INSERT INTO Location (LocationID, LocationName, Address) VALUES
(1, 'New York Hub', '50 Broadway, New York, NY'),
(2, 'San Francisco Center', '200 Market St, San Francisco, CA'),
(3, 'Chicago Warehouse', '150 Lake Shore Dr, Chicago, IL'),
(4, 'Houston Depot', '275 Westheimer Rd, Houston, TX'),
(5, 'Los Angeles Office', '300 Sunset Blvd, Los Angeles, CA'),
(6, 'Seattle Distribution', '120 Rainier Ave, Seattle, WA'),
(7, 'Miami Logistics', '80 Ocean Dr, Miami, FL'),
(8, 'Denver Facility', '90 Colfax Ave, Denver, CO'),
(9, 'Boston Terminal', '175 Beacon St, Boston, MA'),
(10, 'Atlanta Operations', '250 Peachtree St, Atlanta, GA');

INSERT INTO Employee (EmployeeID, Name, Role, Salary) VALUES
(1, 'John Williams', 'Courier Manager', 55000.00),
(2, 'Alice Brown', 'Delivery Executive', 45000.00),
(3, 'Robert Johnson', 'Sorting Supervisor', 50000.00),
(4, 'Sophia Martinez', 'Customer Support', 42000.00),
(5, 'David Anderson', 'Logistics Coordinator', 48000.00);

INSERT INTO Courier (SenderUserID, ReceiverUserID, PackageName, NumberOfPackages, Weight, Status, TrackingNumber, CreatedDate, DeliveryDate, ServiceID, EmployeeID) VALUES
(1, 2, 'Electronics', 2, 4.50, 'Delivered', 'TRK1234567890', '2025-03-15', '2025-03-17', 1, 1),
(3, 4, 'Books', 1, 2.30, 'Processing', 'TRK0987654321', '2025-03-16', NULL, 2, 2),
(5, 6, 'Clothing', 3, 5.00, 'Cancelled', 'TRK1122334455', '2025-03-14', NULL, 3, 3),
(7, 8, 'Documents', 1, 1.20, 'Delivered', 'TRK5566778899', '2025-03-12', '2025-03-14', 4, 4),
(9, 10, 'Gadgets', 1, 3.75, 'Processing', 'TRK6677889900', '2025-03-17', NULL, 5, 5),
(2, 3, 'Furniture Parts', 2, 12.40, 'Processing', 'TRK7788990011', '2025-03-18', NULL, 1, 1),
(4, 5, 'Home Decor', 1, 7.80, 'Delivered', 'TRK9900112233', '2025-03-10', '2025-03-13', 2, 2),
(6, 7, 'Groceries', 4, 6.00, 'Delivered', 'TRK1122446688', '2025-03-05', '2025-03-06', 3, 3),
(8, 9, 'Jewelry', 1, 1.10, 'Cancelled', 'TRK5566889900', '2025-03-19', NULL, 4, 4),
(10, 1, 'Sports Equipment', 2, 9.20, 'Delivered', 'TRK2233445566', '2025-03-01', '2025-03-04', 5, 5);

INSERT INTO Payment (CourierID, LocationID, EmployeeID, Amount, PaymentDate) VALUES
(1, 1, 1, 25.50, '2025-03-15'),  
(2, 3, 2, 95.75, '2025-03-16'),  
(3, 5, 3, 330.20, '2025-03-14'),  
(4, 7, 4, 412.90, '2025-03-12'),  
(5, 9, 5, 48.90, '2025-03-17'),  
(6, 2, 1, 65.60, '2025-03-18'), 
(7, 4, 2, 78.25, '2025-03-10'), 
(8, 6, 3, 822.80, '2025-03-05'),  
(9, 8, 4, 919.90, '2025-03-19'),  
(10, 10, 5, 1035.70, '2025-03-01');

INSERT INTO Courier (SenderUserID, ReceiverUserID, PackageName, NumberOfPackages, Weight, Status, TrackingNumber, CreatedDate, DeliveryDate, ServiceID, EmployeeID) VALUES
(2, 6, 'Headphones', 1, 0.50, 'Delivered', 'TRK0011', '2025-03-02', '2025-03-05', 2, 1),
(3, 9, 'Laptop Charger', 1, 0.75, 'Processing', 'TRK0012', '2025-03-03', NULL, 1, 2),
(5, 1, 'Books', 3, 2.50, 'Delivered', 'TRK0013', '2025-03-04', '2025-03-07', 3, 3),
(6, 10, 'Smartphone', 1, 0.80, 'Cancelled', 'TRK0014', '2025-03-05', NULL, 2, 4),
(7, 4, 'Winter Jacket', 1, 1.20, 'Processing', 'TRK0015', '2025-03-06', NULL, 3, 5),
(8, 2, 'Kitchen Utensils', 2, 3.00, 'Delivered', 'TRK0016', '2025-03-07', '2025-03-10', 4, 1),
(9, 3, 'Gaming Console', 1, 2.00, 'Processing', 'TRK0017', '2025-03-08', NULL, 5, 2),
(10, 5, 'Shoes', 1, 1.10, 'Delivered', 'TRK0018', '2025-03-09', '2025-03-12', 1, 3),
(1, 7, 'Backpack', 1, 1.30, 'Cancelled', 'TRK0019', '2025-03-10', NULL, 2, 4),
(4, 8, 'LED Lamp', 1, 0.90, 'Delivered', 'TRK0020', '2025-03-11', '2025-03-14', 3, 5);

INSERT INTO Payment (CourierID, LocationID, EmployeeID, Amount, PaymentDate) VALUES
(11, 2, 1, 120.00, '2025-03-02'),
(12, 3, 2, 95.00, '2025-03-03'),
(13, 5, 3, 150.00, '2025-03-04'),
(14, 6, 4, 60.00, '2025-03-05'),
(15, 7, 5, 80.00, '2025-03-06'),
(16, 8, 1, 200.00, '2025-03-07'),
(17, 9, 2, 50.00, '2025-03-08'),
(18, 10, 3, 175.00, '2025-03-09'),
(19, 1, 4, 35.00, '2025-03-10'),
(20, 4, 5, 90.00, '2025-03-11');
