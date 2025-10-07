package project.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class BankTest {

    @Test
    public void testAddAccountAndCount(){
        Bank bank = new Bank();
        Account a1 = new Account("405", "Danelle", 350.00, "checking");
        bank.addAccount(a1);
        Account result = bank.findAccountById("405");
        assertNotNull(result);
        assertEquals("Danelle", result.getOwnerName());
    
    }

    @Test
    public void 

}
