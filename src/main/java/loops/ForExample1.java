package loops;

public class ForExample1 {
    public static void main(String[] args) {
example7();

    }

    public static void example1() {
        // самый простой пример цикла for
        for (int i = 0; i < 3; i++) {
            System.out.println("hello java " + i);

        }

    }

    public static void example2() {
        // можно вынести инициализацию переменной выше цикла for
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("hello java " + i);

        }
    }

    public static void example3() {
        // пример изменения стартовой переменной с шагом отличным от единицы
        for (int i = 1; i < 10; i += 2) { //i += 2 <=> i = i + 2
            System.out.println("hello java " + i);
        }

    }
    public static void example4() {
        // вывести все элементы массива в прямом и обратном направлении
        // indexes 0 1 2 3 4 5 6
         int[] q = {4, 3, 1, 7, 8, 4, 0};


         for (int i = 0; i < q.length; i++) { //i += 2 <=> i = i + 2
              System.out.print(q[i] + " ");
          }
         System.out.println();

          for (int i = q.length - 1; i >= 0 ; i--) {
              System.out.print(q[i] + " ");

         }



    }
    public static void example5() {
        // infinity loop
        for (byte i = 125; i < 130; i++) {
            System.out.println("hello java " + i);

        }
    }
    public static void example6() {
        for (double i = 0; i < 1; i += 0.1) {
            System.out.println("hello java " + i);

        }
    }
    public static void example7() {
        // indexes 0 1 2 3 4 5 6
        int[] q = {4, 3, 1, 7, 8, 4, 0};

        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i] + " ");

            System.out.println();

            for (int element : q)
                System.out.print(element + " ");


        }

    }
}
