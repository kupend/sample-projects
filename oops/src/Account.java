public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public  Account() {
        this("56789", 25.5, "Default namme", "Default email", "Default number");
        System.out.println("Empty constructor called");
    }
    public Account(String number, double balance, String customerName, String email,
                   String phone) {
        System.out.println("Account constructor with parameters");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;

    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("9999", 100.55, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + "made.new balance is $" +
                this.balance);
    }

    public void withdrawFunds(double withdrawAmount) {

        if(balance - withdrawAmount < 0) {
            System.out.println("insufficient Funds! you have $" + balance + "in your account");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount +
                    " processed, Remaining balance = $" + balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
