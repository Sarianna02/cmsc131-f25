package project.bank;

public class Bank {

    private Account [] accounts;
    private int count;

    public Bank(){
        accounts = new Account[100];
        count = 0;
    }

    public void addAccount(Account account) { // TODO should return boolean
        // TODO data validation
        if (count < accounts.length) {
            accounts[count] = account;
            count++;
        }
    }

    public int getAccountCount(){
        return count;
    }

    public Account findAccountById(String id){ // TODO should return int
        // TODO data validation
        for(int i = 0; i < count; i++) {
            if (accounts[i].getAccountId().equals(id)) {
                return accounts[i];
            }
        }
        return null;
    
    }

    public Account[] findAccountsByOwner(String name) {
        int matches = 0;

        for(int i = 0; i < count; i++) {
            if (accounts[i].getOwnerName().equals(name)) {
                matches++;
            }
        }

        Account[] result = new Account[matches];
        int index = 0;

        for (int i = 0; i < count; i++) {
            if (accounts[i].getOwnerName().equals(name)){
                result[index] = accounts[i];
                index++;
            }
        }
        return result;
    }
}
