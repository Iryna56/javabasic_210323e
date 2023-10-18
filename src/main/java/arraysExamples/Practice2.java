package arraysExamples;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        // создать массив типа String  с размером 7. Записать в него значения дней недели.
        // Вывести на консоль значение последнего элемента

        String[] week = new String[7];
        week[0] = "Mo";
        week[1] = "TU";
        week[2] = "WE";
        week[3] = "TH";
        week[4] = "FR";
        week[5] = "SA";
        week[6] = "SU";

        String[] week2 = {"Mo", "TU","WE","TH","FR","SA","SU"};
        String[] week3 = new String[] {"Mo", "TU","WE","TH","FR","SA","SU"};

        System.out.println(Arrays.toString(week));
        System.out.println(Arrays.toString(week2));
        System.out.println(Arrays.toString(week3));

        System.out.println("Last element is = " + week[week.length - 1]);
        System.out.println("Last element is = " + week2[week2.length - 1]);
        System.out.println("Last element is = " + week3[week3.length - 1]);

    }
}
