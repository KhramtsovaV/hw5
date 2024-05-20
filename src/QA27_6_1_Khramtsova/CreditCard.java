package QA27_6_1_Khramtsova;

class CreditCard {
     int id;
     String accountNumber;
     double balance;

    public CreditCard(int id, String accountNumber, double initialBalance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("On card " + accountNumber + " accrued: " + amount);
        } else {
            System.out.println("Error: The amount to be calculated must be positive.");
        }
    }

    public void withDraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("On card " + accountNumber + " withdraw: " + amount);
            } else {
                System.out.println("Error:There are not enough funds in the account to withdraw " + amount);
            }
        } else {
            System.out.println("Error: The amount to be calculated must be positive.");
        }
    }

    public void printInfo() {
        System.out.println("Credit card " + accountNumber);
        System.out.println("ID: " + id);
        System.out.println("Current amount in the account: " + balance);
    }
}
