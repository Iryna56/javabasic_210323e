package arraysExamples;

import java.util.Arrays;
import java.util.Random;

public class Practice3 {
    public static void main(String[] args) {
        // создайте массив из 15 случайных чисел из отрезка [0;9]
        // подсчитайте сколько в массиве четных элементов и выведете это количество на экран
        // на отдельной строке

        int[] q = new int[15];
        example1(q);
        example2(q);
    }
    public static void example2(int[] q) {
        //  то же самое используя только один цикл
            Random r = new Random();
            int eventCount = 0;

            for (int i = 0; i < q.length; i++) {

                // генерация случайного числа
                int tmp = r.nextInt(0,10);
                // заполнение массива случайным числом
                q[i] = tmp;
                // проверка на четность
                if (q[i] % 2 == 0)
                    eventCount++;

            }





            System.out.println("original array = " + Arrays.toString(q));
            System.out.println("amount of even = " + eventCount);

        }
    public static void example1(int[] q) {

        Random r = new Random();


        for (int i = 0; i < q.length; i++) {


           q[i] = r.nextInt(0,10);

        }

        int eventCount = 0;

        for (int i = 0; i < q.length; i++) {
            if (q[i] % 2 == 0)
                eventCount++;

        }

        System.out.println("original array = " + Arrays.toString(q));
        System.out.println("amount of even = " + eventCount);

    }
}
