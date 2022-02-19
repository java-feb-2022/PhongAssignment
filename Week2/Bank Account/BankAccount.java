public class BankAccount {

    public static int numAccounts = 0;
    public static double totalAmtAvail = 0;

    private double checkingBalance;
    private double savingBalance;
    private int accountNumber;
    private String accountType;

    public BankAccount() {
        BankAccount.numAccounts += 1;
        this.checkingBalance = 0;
        this.totalAmtAvail = 0;

    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;

    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingBalance() {
        return this.savingBalance;
    }

    public void setAccountNumber(int x) {
        this.accountNumber = x;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void depositMoney(double amount, String account) {
        if (account == "saving")
            this.savingBalance += amount;
        else if (account == "checking")
            this.checkingBalance += amount;
        BankAccount.totalAmtAvail += amount;

    }

    public void moneyWithdraw(double amount, String account) {
        boolean success = false;
        if (account.equals("saving")) {
            if (this.savingBalance - amount >= 0) {
                success = true;
                this.savingBalance -= amount;
            }
        }

        else if (account.equals("checking")) {
            if (this.checkingBalance - amount >= 0) {
                success = true;
                this.checkingBalance -= amount;
            }
        }
        if (success) {
            BankAccount.totalAmtAvail -= amount;
        } else {
            // add
            System.err.printf("No enough Money in %s account :( ", this.accountType);
        }
    }

    public void displayAccountBalance() {
        // System.out.println("Account type" + this.accountType);
        System.out.println("account # " + this.accountNumber);
        System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingBalance, this.checkingBalance));

    }
}
