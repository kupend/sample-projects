public class P {
    void methodP() {
        System.out.println("I am method p from class p");
    }
}
interface Q {
    void methodQ();


}
interface R {
    void methodR();

}
class S extends P implements Q,R {

    @Override
    public void methodQ() {
        System.out.println("I am method Q from class S");

    }

    @Override
    public void methodR() {
        System.out.println("I am method R from class S ");
    }
}

class AbsClass {

    public static void main(String ar[]) {
        S ob = new S();
        ob.methodP();
        ob.methodQ();
        ob.methodR();

    }
}
