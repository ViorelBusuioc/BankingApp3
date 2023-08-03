public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount356934 = new BankAccount();

//        bankAccount356934.setAccountNumber(356934);
//        bankAccount356934.setBalance(0.00);
//        bankAccount356934.setCustomerName("Vasile George");
//        bankAccount356934.setEmail("vasilegeorge@gmail.com");
//        bankAccount356934.setPhone("0770615563");

        bankAccount356934.deposit(100.00);
        bankAccount356934.withdraw(150);
        bankAccount356934.withdraw(34.45);
        bankAccount356934.showAccount();

        BankAccount viorelAccount = new BankAccount("Viorel","viorelbusuioc@gmail.com","0740556633");
        System.out.println("Account NO: " + viorelAccount.getAccountNumber() +
                "; Name: " + viorelAccount.getCustomerName());
    }
}
