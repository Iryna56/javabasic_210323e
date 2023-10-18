import java.util.Scanner;

public class HomeworkScanner {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);

        System.out.print("Enter pls your age: ");
        int age = ad.nextInt();
        System.out.println("You've entered " + age );
        System.out.println("Your age in Binary System: " + Integer.toBinaryString(age));

        System.out.print("Enter pls your day of birth: ");
        int day = ad.nextInt();
        System.out.println("You've entered " + day );
        System.out.println("Your day of birth in Binary System: " + Integer.toBinaryString(day));

        System.out.print("Enter pls your month of birth: ");
        int month = ad.nextInt();
        System.out.println("You've entered " + month);
        System.out.println("Your month of birth in Binary System: " + Integer.toBinaryString(month));

        System.out.print("Enter pls your year of birth: ");
        int year = ad.nextInt();
        System.out.println("You've entered " + year);
        System.out.println("Your year of birth in Binary System: " + Integer.toBinaryString(year));




        ad.close();
    }
}
