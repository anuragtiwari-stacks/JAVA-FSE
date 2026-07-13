CREATE TABLE Accounts
(
    AccountID NUMBER PRIMARY KEY,
    AccountType VARCHAR2(20),
    Balance NUMBER
);

CREATE TABLE Employees
(
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(50),
    DepartmentID NUMBER,
    Salary NUMBER
);

INSERT INTO Accounts VALUES (101, 'Savings', 10000);
INSERT INTO Accounts VALUES (102, 'Savings', 15000);
INSERT INTO Accounts VALUES (103, 'Current', 20000);

INSERT INTO Employees VALUES (1, 'Anurag', 10, 50000);
INSERT INTO Employees VALUES (2, 'Rahul', 10, 45000);
INSERT INTO Employees VALUES (3, 'Priya', 20, 60000);

COMMIT;