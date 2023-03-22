public class whileloop {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evencount = 0;
        int oddcount = 0;

        while(number <= finishNumber) {


            number++;
            if (!isEvenNumber(number)) {
                oddcount++;
                continue;
            }
            System.out.print("even number " + number);
            evencount++;
        }
        System.out.println("total odd numbers found = " + oddcount);
        System.out.println("total even numbers found = " + evencount);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
