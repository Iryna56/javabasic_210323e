package loops;

import java.util.Scanner;

public class whileExample1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.println("Algorithm calculated final sum");
        System.out.print("Enter pls number: ");
        while (sc.hasNextInt()) {
            System.out.print("Enter pls number ");
            int value = sc.nextInt();
            System.out.println();
            sum += value;
            System.out.println("tmp sum = " + sum);
        }

            System.out.println("Sum = " + sum);

            sc.close();


        }

        public static void example2 () {

            int[] q = {4, 7, 1, 3, 9};

            int w = 0;
            while (w < q.length) {
                System.out.print(q[w] + " ");
                w++;
            }
            System.out.println();

            int e = q.length - 1;
            while (e >= 0) {
                System.out.print(q[e] + " ");
                e--;
            }

        }







        public static void example1 () {
            int w = 0;
            while (w < 3) {
                System.out.println("hello, java " + w);
                w++;

            }
        }
    }



