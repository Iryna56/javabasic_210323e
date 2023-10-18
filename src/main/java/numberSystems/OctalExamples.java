package numberSystems;

public class OctalExamples {
     public static void main(String[] args) {
       //перевод из десятичной в восьмеричную  систему(10 -> 8)
        int q = 296;

        System.out.println(296 / 8); //37
        System.out.println(296 % 8); //0


        System.out.println(37 / 8); //4
        System.out.println(37 % 8); //5

        System.out.println(4 / 8); //0 <- встречаем ноль и останавливаемся
        System.out.println(4 % 8); //4
        // 450 450 значение в восьмеричной системе
        int q8 = 0450;

        //перевод из восьмеричной в десятичную (8 -> 10)

        System.out.println(4*Math.pow(8,2) + 5*Math.pow(8,1) + 0*Math.pow(8,0));
        System.out.println(q8);
        System.out.println(Integer.toOctalString(q));





    }
}
