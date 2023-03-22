class ticketbooking {

    boolean booked = false;
    public synchronized void bookTicket (String name) {

        if (booked==false){
            System.out.println(name + " selected the seat");

            System.out.println(name + " completed the payment");

            System.out.println(name + " get the ticket");

            booked=true;
        }else {
            System.out.println("sorry "+name+", the ticket has already booked");
        }

    }
}
    class threadclass extends Thread {
        ticketbooking tkt;
        String name;

        threadclass(ticketbooking obj,String s) {
            tkt=obj;
            name=s;
        }
        public void run() {
            tkt.bookTicket(name);

        }
    }
    public class SyncEx {
        public static void main(String[] args) {
            ticketbooking seat7 = new ticketbooking();
            threadclass santosh = new threadclass(seat7,"santosh");
            Thread san = new Thread(santosh);
            san.start();


            threadclass suresh = new threadclass(seat7,"suresh");
            Thread suh = new Thread(suresh);
            suh.start();
        }
    }


