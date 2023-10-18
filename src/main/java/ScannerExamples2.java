import java.util.Scanner;

public class ScannerExamples2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // считываеи слово
         System.out.print("Enter pls your name: ");
        String name = sc.next();
        System.out.println("Guten Abend " + name);
        System.out.println("First element of name = " + name.charAt(0));


        sc.nextLine();

        //считываем строку

        System.out.print("Enter pls some text: ");
        String text = sc.nextLine();
        System.out.println("You entered " + text);
        System.out.println("First element of text = " + text.charAt(0));



        sc.close();
    }
}
