CREATE TABLE User (
    UserID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Email VARCHAR(255) UNIQUE NOT NULL,
    Password VARCHAR(255) NOT NULL,
    ContactNumber VARCHAR(20) NOT NULL,
    Address TEXT NOT NULL
);
CREATE TABLE Courier (
    CourierID INT PRIMARY KEY AUTO_INCREMENT,
    SenderUserID INT NOT NULL,
    ReceiverUserID INT NOT NULL,
    PackageName VARCHAR(255) NOT NULL,
    NumberOfPackages INT NOT NULL DEFAULT 1,
    Weight DECIMAL(5,2) NOT NULL,
    Status ENUM('Processing', 'Delivered', 'Cancelled') NOT NULL,
    TrackingNumber VARCHAR(20) UNIQUE NOT NULL,
    CreatedDate Date NOT NULL,
    DeliveryDate DATE,
    ServiceID INT NOT NULL,
    EmployeeID INT,
    FOREIGN KEY (SenderUserID) REFERENCES User(UserID) ON DELETE CASCADE,
    FOREIGN KEY (ReceiverUserID) REFERENCES User(UserID) ON DELETE CASCADE,
    FOREIGN KEY (ServiceID) REFERENCES CourierServices(ServiceID) ON DELETE CASCADE,
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID) ON DELETE SET NULL
);
CREATE TABLE CourierServices (
    ServiceID INT PRIMARY KEY AUTO_INCREMENT,
    ServiceName VARCHAR(100) NOT NULL,
    Cost DECIMAL(8,2) NOT NULL
);
CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY AUTO_INCREMENT,
    UserID INT UNIQUE NOT NULL,
    Role VARCHAR(50) NOT NULL,
    Salary DECIMAL(10,2) NOT NULL,
    Name Varchar(100) Not null
);
CREATE TABLE Location (
    LocationID INT PRIMARY KEY AUTO_INCREMENT,
    LocationName VARCHAR(100) NOT NULL,
    Address TEXT NOT NULL
);
CREATE TABLE Payment (
    PaymentID INT PRIMARY KEY AUTO_INCREMENT,
    CourierID INT NOT NULL UNIQUE,
    LocationID INT NOT NULL,
    EmployeeID INT, 
    Amount DECIMAL(10,2) NOT NULL,
    PaymentDate DATE NOT NULL,
    FOREIGN KEY (CourierID) REFERENCES Courier(CourierID) ON DELETE CASCADE,
    FOREIGN KEY (LocationID) REFERENCES Location(LocationID) ON DELETE CASCADE,
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID) ON DELETE SET NULL
);
