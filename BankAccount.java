public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount () {
        this(56789,2.50,"Default Name","Default email","Default Phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount (int accountNumber, double balance, String customerName, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
        System.out.println("Bank account constructor with parameters called");
    }

    public BankAccount(String customerName, String email, String phone) {

        this(9999,100.55,customerName,email,phone);
//        this.customerName = customerName;
//        this.email = email;
//        this.phone = phone;
    }

    public void withdraw (double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient founds to withdraw " + amount + ". Balance remaining: " + balance);
        } else {
            balance -= amount;
            System.out.println("Amount " + amount + " have been withdraw from your account. New balance: " + balance);
        }
    }

    public void showAccount () {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phone);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit (double amount) {

        balance += amount;
        System.out.println("Amount " + amount + " have been added to your account. New balance: " + balance);
    }

}
