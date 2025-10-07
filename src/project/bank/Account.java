package project.bank;

public class Account {

    private String accountId;
    private String ownerName;
    private double balcance;
    private String accountType;

    public Account(String accountId, String ownerName, double balcance, String accountType){
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.balcance = balcance;
        this.accountType = accountType;
    }

    public String getAccountId(){
        return accountId;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public double getBalance(){
        return balcance;
    }

    public String getAccountType(){
        return accountType;
    }



}
