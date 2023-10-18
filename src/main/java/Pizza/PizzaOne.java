package Pizza;

public class PizzaOne {
    // Square = 3.14 * r^2 ( r = d / 2 )
    // диаметр первой пиццы 24 см ( r1 = 12 ), диаметр второй пиццы 28 см ( r2 = 14 )
    //
   public double square1, square2, kalorien1, kalorien2, result;

    public PizzaOne(int r1, int r2) {
        met1(r1);
        met2(r2);
        met3();
        met3();
        met4();
        met5();
        printResult();
    }

    int a = 40; // количество калорий в 1 см^2

    public void met1(int r1) {
       square1 = Math.PI * Math.pow(r1, 2);
   }
   public void met2(int r2) {
       square2 = Math.PI * Math.pow(r2, 2);
   }
   public void met3() {
       kalorien1 = square1 * a;  // количество калорий в пицце 24 см

   }
   public void met4() {
       kalorien2 = square2 * a;
   } // количество калорий в пицце 28 см
   public void met5() {
       result = kalorien2 - kalorien1;
   } // разница в калориях
   public void printResult() {
       System.out.println("Если съесть пиццу 28 см вместо пиццы 24 см, то лишних калорий будет = " + result);

   }





}
