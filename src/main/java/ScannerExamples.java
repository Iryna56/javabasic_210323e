import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pls number of day in month: ");
        int day = sc.nextInt();
        System.out.println("You've entered " + day);

        System.out.print("Enter pls number of month in year: ");
        short month = sc.nextShort();
        System.out.println("You've entered " + month);

        System.out.print("Enter pls your wether temperature outside (double) : ");
        double t = sc.nextDouble();
        System.out.println("Your temperature is " + t);



        sc.close();
    }
}
