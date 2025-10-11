package project.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class BankTest {

    // TODO test when addAccount fails
    // TODO test when findAccontById fails
    // TODO test data validation in addAccount and findAccountByID

    @Test
    public void testAddAccountAndCount(){
        Bank bank = new Bank();
        Account a1 = new Account("405", "Danelle", 350.00, "checking");
        bank.addAccount(a1);
        Account result = bank.findAccountById("405");
        assertNotNull(result); // compile error
        assertEquals("Danelle", result.getOwnerName());
    
    }

    // looks like work-in-progress
    @Test
    public void 

}
