package randomValues;

public class Example2 {
    public static void main(String[] args) {
        // использование Math.random()

        double q = Math.random(); // [0; 1)

        //[0; 1) * 10 => [0; 10)
        // [0;10) - целевой желаемый диапазон
         double w = Math.random() * 10; //[0;10)

        //[0;1) * 3 => [0;3) + 4 => [4;7)
        //[4;7) - целевой желаемый диапазон
            double e = 4 + Math.random() * 3;

            // [min;max)
            // min + Math.random() * (max - min)

        System.out.println(e);
    }
}
