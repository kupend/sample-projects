public class Main {
    public static void main(String[] args) {



//        Account buddiAccount = new Account("1234", 1000.00, "buddi ambati",
//                "myemail@buddi.com", "(203)-123-2587");
        Account buddiAccount = new Account();

        System.out.println(buddiAccount.getNumber());
        System.out.println(buddiAccount.getBalance());

//        buddiAccount.setNumber("123456");
//        buddiAccount.setBalance(1000.00);
//        buddiAccount.setCustomerName("Buddi Ambati");
//        buddiAccount.setCustomerEmail("myemail@buddi.com");
//        buddiAccount.setCustomerPhone("(203)-123-2587");

        buddiAccount.withdrawFunds(100.0);
        buddiAccount.depositFunds(250);
        buddiAccount.withdrawFunds(50);

        Account reddyAccount = new Account("reddy", "reddy@gmail.com", "123456");
        System.out.println("AccountNo: " + reddyAccount.getNumber() + "; name " + reddyAccount.getCustomerName());

    }
}
