package arraysExamples;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        int[] q = new int[8];
        Random r = new Random();

        for (int i = 0; i < q.length; i++) {
            q[i] = r.nextInt(1, 11);
        }
        System.out.println(Arrays.toString(q));

        System.out.println("----------");

        for (int i = 0; i < q.length; i++) {
            if (i % 2 == 1) {
                q[i] = 0;

                System.out.println(Arrays.toString(q));

            }


        }
    }

}

