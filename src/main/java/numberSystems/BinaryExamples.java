package numberSystems;

public class BinaryExamples {
    public static void main(String[] args) {
        int q = 296;

        //перевод 10 -> 2
        System.out.println(296/2); //148
        System.out.println(296%2);     //0
        System.out.println(148/2);  //74
        System.out.println(148%2);     //0
        System.out.println(74/2);  //37
        System.out.println(74%2);     //0
        System.out.println(37/2);  //18
        System.out.println(37%2);     //1
        System.out.println(18/2);  //9
        System.out.println(18%2);     //0
        System.out.println(9/2);  //4
        System.out.println(9%2);     //1
        System.out.println(4/2);  //2
        System.out.println(4%2);     //0
        System.out.println(2/2);  //1
        System.out.println(2%2);     //0
        System.out.println(1/2);  //0 встречаем 0 и останавливаемся
        System.out.println(1%2);     //1


        //результат 100101000
          //          876543210
        //перевод числа из 2 -> 10 classic way
        System.out.println(1*Math.pow(2,8) + 0*Math.pow(2,7) + 0*Math.pow(2,6) + 1*Math.pow(2,5) + 0*Math.pow(2,4) + 1*Math.pow(2,3) + 0*Math.pow(2,2) + 0*Math.pow(2,1) + 0*Math.pow(2,0));
        System.out.println(1*Math.pow(2,8) + 1*Math.pow(2,5) + 1*Math.pow(2,3) ) ;

        //перевод числа 2->10 short way
        int q2 = 0b100101000;
        System.out.println(q2);

        System.out.println(Integer.toBinaryString(q));
    }
}
