package sigmoid;

public class SigmoidTwo {
    // пример использования методов отличных от типа void
    // S(x) = 1 / (1+ e^(-x))

    // neg, pow, sum, div


    public SigmoidTwo(double x) {
      // самый простой сценарий с созданием промежуточных переменных
        //double result1 = neg(x);
        //double result2 = pow(result1);
        //double result3 = sum(result2);
        //double result4 = div(result3);


        // S(x) = 1 / (1+ e^(-x))
        double result4 =
                div(sum(pow(neg(x))));

        printResult(result4);
    }

    private double neg(double x) {
        return x * (-1);
    }

    private double pow(double q) {
        return  Math.pow(Math.E, q);
    }

    private   double sum(double w) {
    return 1 + w;
    }

    private double div(double e) {
        return 1 / e;
    }

    public void printResult(double t) {
        System.out.println("SigmoidTwoResult = " + t);

    }

}
