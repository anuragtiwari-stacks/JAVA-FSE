CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_source_account IN NUMBER,
    p_target_account IN NUMBER,
    p_amount IN NUMBER
)
IS
    v_balance NUMBER;
BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_source_account;

    IF v_balance >= p_amount THEN

        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_source_account;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_target_account;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE('Transfer completed successfully.');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient balance.');

    END IF;

END;
/