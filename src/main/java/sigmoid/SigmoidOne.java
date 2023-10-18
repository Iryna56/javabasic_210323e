package sigmoid;

public class SigmoidOne {
    // пример использования методов типа void
    // S(x) = 1 / (1+ e^(-x))
    // neg, pow, sum, div
    private double result1, result2, result3, result4;
    public SigmoidOne(double x) {
        neg(x);
        pow();
        sum();
        div();
        printResult();
    }
    private void neg(double x) {
        result1 = x * (-1);
    }
    private void pow() {
        result2 = Math.pow(Math.E, result1);
    }
    private void sum() {
        result3 = 1 + result2;
    }
    private void div(){
        result4 = 1 / result3;
    }
    private void printResult() {
        System.out.println("SigmoidOneResult = "
                + result4);
    }
}
