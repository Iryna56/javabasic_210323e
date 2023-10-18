package arraysExamples;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слова через пробел: ");
        String words = sc.nextLine();
        int count = 0;

        if(words.length() != 0) {
            count++;
            for (int i = 0; i < words.length(); i++) {
                if (words.charAt(i) == ' ') {
                    count++;
                }

            }
        }
        System.out.println("Количество слов = " + count);
    }
}
