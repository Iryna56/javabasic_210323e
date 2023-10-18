package loops;

public class DoWhileExample1 {
    public static void main(String[] args) {

        int[] q = {4,7,1,3,9};

    }
public static void example1() {
        int q = 0;
        do {
            System.out.println("hello, java " + q);
            q++;
        } while (q < 3);  // выполнится хотя бы 1 раз, даже если q < -1

    }
}
