package project.bank;

public class Account {

    private String accountId;
    private String ownerName;
    private double balance;
    private String accountType;

    // reformat long line for readability
    public Account(
        String accountId, 
        String ownerName, 
        double balance, String
         accountType
    ){
        // TODO data validation
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getAccountId(){
        return accountId;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountType(){
        return accountType;
    }



}
