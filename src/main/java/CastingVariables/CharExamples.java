package CastingVariables;

public class CharExamples {
    public static void main(String[] args) {
       // '" ` типы кавычек
        char q = 'a';
        System.out.println(q);
        System.out.println((int) q);

        char w = 231;
        System.out.println(w);
        System.out.println((int) w);
        System.out.println((char) 231);

        char e = '\u03B2';
        System.out.println(e);
        System.out.println((int) e);

        //базовая арифметика над типом char
        System.out.println(q / q);
        System.out.println(q * q);
        System.out.println(q + q);
        System.out.println(q - q);
        System.out.println(q % q);


    }
}
