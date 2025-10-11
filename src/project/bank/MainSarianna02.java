package project.bank;

public class MainSarianna02 {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        Account acc1 = new Account("101","Allie", 1500.25,"checking");
        Account acc2 = new Account("102","Rylind",  2700.00, "savings");
        Account acc3 = new Account("103","Xavi",  1700.75, "savings");

        myBank.addAccount(acc1);
        myBank.addAccount(acc2);
        myBank.addAccount(acc3);

        System.out.println("Number of accounts: " + myBank.getAccountCount());

        Account found = myBank.findAccountById("102");
        if (found != null) {
            System.out.println("Found account with ID 102: " + found.getOwnerName() + ", $" + found.getBalance());
        } else {
            System.out.println("Account not found.");
        }

        Account[] AllieAccounts = myBank.findAccountsByOwner("Allie");
        System.out.println("Allie has " + AllieAccounts.length + " accounts.");
        
    }

}
