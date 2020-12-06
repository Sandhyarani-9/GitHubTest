public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    private double additionResult;
    private double subtractionResult;
    private double multiplicationResult;
    private double divisionResult;


    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
public double getAdditionResult(){
    return additionResult=firstNumber+secondNumber;
}
public double getSubtractionResult(){
        return subtractionResult=firstNumber-secondNumber;
}
public double getMultiplicationResult(){
        return multiplicationResult=firstNumber*secondNumber;
}
public double getDivisionResult(){
        return divisionResult=(firstNumber/secondNumber);
}

}
