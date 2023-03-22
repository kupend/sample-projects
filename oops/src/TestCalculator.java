public class TestCalculator {
    public static void main(String[] args) {

        Calculator calcObj = new Calculator();// rhs object creation
        //lhs

        calcObj.firstNumber = 20;
        calcObj.secondNumber = 12;

        double result = calcObj.add();

        System.out.println("Add Result: "+calcObj.add());
        System.out.println("Add Result: "+calcObj.subtract());
        System.out.println("Add Result: "+calcObj.divide());
        System.out.println("Add Result: "+calcObj.multiply());

    }
}
