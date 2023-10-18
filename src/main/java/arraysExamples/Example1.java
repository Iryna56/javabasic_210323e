package arraysExamples;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {

        // сортировка по возрастанию

        int[] q = new int[]{4,3,1,2,7,5,6,8};
        System.out.println(Arrays.toString(q));
        Arrays.sort(q);
        System.out.println(Arrays.toString(q));


    }
    public static void example5() {
        int[] q = new int[]{1,2,3,4,5,6,7,8};
        int[] w = Arrays.copyOf(q, 5);
        int[] e = Arrays.copyOf(q, 10);
        System.out.println("original = " + Arrays.toString(q));
        System.out.println("copyOf(5) = " + Arrays.toString(w));
        System.out.println("copyOf(10) = " + Arrays.toString(e));
        System.out.println("---------");
        int[] r = Arrays.copyOfRange(q, 3, 6);

        System.out.println("original = " + Arrays.toString(q));
        System.out.println("copyOf(5) = " + Arrays.toString(r));



    }
    public static void example4() {
        // создание массива обьектов
        Student[] team = {
                new Student("Bob", 20),
                new Student("Anna", 21)
        };
        System.out.println(Arrays.toString(team));

        for (int i = 0; i < team.length; i++) {
            Student tmp = team[i];
            System.out.println("Student: name=" + tmp.getName() + "; age=" + tmp.getAge());

        }
        System.out.println();
        for (Student element : team)
            System.out.println("Student: name=" + element.getName() + "; age=" + element.getAge());



        }

    public static void example2() {
        // создание пустых массивов
        // численные массивы
        int[] q = new int[3];
        for (int e : q)
            System.out.println(e);

        //  логические значения в мвссиве
        boolean[] w = new boolean[4];
        for (boolean e : w)
            System.out.println(e);

        // массивы обьектов

        String[] e = new String[2];
        for (String element : e)
            System.out.println(element);

    }
    public static void example1() {
        // создание массива различными способами

      // 1 (декларация + аллокация = иницифлизация)
        int[] q; // декларация

        //2
        byte[] w = new byte[10];

        // 3
        short[] e = {1,2,3,4,5};

        //4
        double[] r = new double[]{0.5, 1.5, 2.5, 2.7, 3.2};

        // java way vs C way
        int[] t = new int[3]; //java style
        int y[] = new int[3]; // C style
    }
}