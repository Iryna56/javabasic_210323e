package stringExample;

import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {

        // строка длиннее чем 5 символа
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls test string object: ");
        String line = sc.nextLine();

        sc.close();

        // leght() - длина строки
        System.out.println("Leght of string object is " + line.length());

        // charAt() - выбор символа исходя из позиции элемента (индекса)
        System.out.println("Symbol = " + line.charAt(0));
        System.out.println("Symbol = " + line.charAt(3));


        // substring() - создание более короткой строки на базе другой строки
        System.out.println("Substring = " + line.substring(1,4));
        System.out.println("Substring = " + line.substring(3));


        //toUpperCase() - превращает все в верхний регистр
        System.out.println("toUpperCase() = " + line.toUpperCase());

        // upLowerCase () - превращает все в нижний регистр
        System.out.println("toLowerCase() = " + line.toLowerCase());

        // contains() - проверка на вхождение
        System.out.println("contains (java) = " + line.contains("java"));




    }
}
