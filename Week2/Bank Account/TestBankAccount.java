public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount farmerBankaAccount = new BankAccount();
        farmerBankaAccount.setAccountType("Savings");
        farmerBankaAccount.setAccountNumber(123);
        // System.out.println("New account No. -" + farmer getAccountNumber());
        System.out.println("New account No. " + farmerBankaAccount.getAccountNumber());
        farmerBankaAccount.depositMoney(25000.00, "checking");
        farmerBankaAccount.depositMoney(5000.00, "saving");
        farmerBankaAccount.moneyWithdraw(5000.00, "checking");
        farmerBankaAccount.moneyWithdraw(7000.00, "saving");
        farmerBankaAccount.displayAccountBalance();
        // farmerBankaAccount.displayAccountBalance();
        // System.out.println("Checking Account Balance: " +
        // farmerBankaAccount.getCheckingBalance());
        // System.out.println("Saving Account Balance: " +
        // farmerBankaAccount.getSavingBalance());

        BankAccount farmerSteveBankaAccount = new BankAccount();
        farmerSteveBankaAccount.depositMoney(200000.00, "checking");
        farmerSteveBankaAccount.depositMoney(50000.00, "saving");
        farmerSteveBankaAccount.moneyWithdraw(50000.00, "checking");
        farmerSteveBankaAccount.moneyWithdraw(49000.00, "saving");
        farmerSteveBankaAccount.displayAccountBalance();

    }

}
