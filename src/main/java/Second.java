import com.auto.finland.Car;

public class Second {
    public static void main(String[] args) {

        int i = 1;
        int j = 10;
        do {
            if (i++ > --j) {
                continue;
            }
        } while (i < 5);
        System.out.println("i = " + i + " and j = " + j);

    }
}






