package CastingVariables;

public class HomeworkChar {
    public static void main(String[] args) {
        // способ 1
        char a = '0';
        int a1 = (int) a;
        System.out.println((int) a);

        // способ 2
        char b = '0';
        int b2 = Integer.parseInt(String.valueOf(b));
        System.out.println(b2);

        // способ 3
        char c = '0';
        int c3 = Character.getNumericValue(c);
        System.out.println(c3);




    }
}

