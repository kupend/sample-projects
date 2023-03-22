public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("tim", "11/11/1995",  "01/01/2009");

        System.out.println(tim);
        System.out.println("age = " + tim.getAge());
        System.out.println("pay = " + tim.collectPay());

        Salariedemployee joe = new Salariedemployee("joe", "11/11/1996", "01/01/2010", 35000);
        System.out.println(joe);
        System.out.println("joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());

    }
}
