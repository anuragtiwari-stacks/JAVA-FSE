CREATE TABLE Customers
(
    CustomerID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);

CREATE TABLE Loans
(
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

INSERT INTO Customers VALUES (1, 'Anurag', 65, 15000, 'FALSE');
INSERT INTO Customers VALUES (2, 'Rahul', 45, 8000, 'FALSE');
INSERT INTO Customers VALUES (3, 'Priya', 70, 20000, 'FALSE');

INSERT INTO Loans VALUES (101, 1, 10, SYSDATE + 15);
INSERT INTO Loans VALUES (102, 2, 12, SYSDATE + 40);
INSERT INTO Loans VALUES (103, 3, 11, SYSDATE + 20);

COMMIT;