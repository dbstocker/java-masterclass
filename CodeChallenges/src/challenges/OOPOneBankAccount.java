package challenges;

public class OOPOneBankAccount {
    private String accountNumber;
    private double accountBalance = 0.0d;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void printDetails() {
        System.out.println(this.getCustomerName());
        System.out.println(this.getCustomerPhone());
        System.out.println(this.getCustomerEmail());
        System.out.println(this.getAccountNumber());
        System.out.println(this.getAccountBalance());
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public double deposit(double depositAmt) {
        return this.accountBalance = this.accountBalance + depositAmt;
    }

    public double withdrawal(double withdrawalAmt) {
        if (withdrawalAmt > this.accountBalance) {
            System.out.println("You don't have enough money");
            return this.accountBalance;
        } else {
            return this.accountBalance = this.accountBalance - withdrawalAmt;
        }
    }
}
