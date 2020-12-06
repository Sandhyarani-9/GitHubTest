public class Test {
    public static void main(String[] args) {

        SimpleCalculator calculator=new SimpleCalculator();

            calculator.setFirstNumber(5.0);
            calculator.setSecondNumber(4);
        System.out.println("Addition is : "+calculator.getAdditionResult());
        System.out.println("Subtraction is : "+calculator.getSubtractionResult());

            calculator.setFirstNumber(6);
            calculator.setSecondNumber(2);
        System.out.println("Multiplication is : "+calculator.getMultiplicationResult());
        System.out.println("Division is : " +calculator.getDivisionResult());

    }
}
