package ifelseoperators;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        //Например, если будет плохая погода - останемся дома, будем смотреть фильм.
        //Иначе если погода будет просто отличная - купим билеты и уедем в другой город на ярмарку.
        //Но если погода будет неопределенная, тогда встретимся с друзьями в нашем доме.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls what weather you have (-1 = bad; 0 = underfined; 1 = good):  ");
        int weather = sc.nextInt();
        sc.close();

        // variable = (condition) ? statement_positive : statement_negative

        String final1 = "останемся дома, будем смотреть фильм";
        String final2 = "купим билеты и уедем в другой город на ярмарку";
        String final3 = "встретимся с друзьями в нашем доме";

        String result = (weather == -1) ? final1 : (weather == 1) ? final2 : final3;

        System.out.println(result);
    }
}
