public class variable {
    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestamount = calculateinterest(100.0,rate);
            if (interestamount > 8.5) {
                break;
            }
            System.out.println("$100 at " + rate + "% interest = " + interestamount);
        }
        }

    public static double calculateinterest(double amount,double interestrate) {
        return (amount * (interestrate / 100));
    }

    }

