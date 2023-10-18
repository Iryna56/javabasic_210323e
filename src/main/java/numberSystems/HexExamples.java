package numberSystems;

public class HexExamples {
    public static void main(String[] args) {
        //перевод из 10 в 16

        System.out.println(296/16); //18
        System.out.println(296%16);   //8
        System.out.println(18/16); //1
        System.out.println(18%16);   //2
        System.out.println(1/16); //0 <- встретили 0 и остановились
        System.out.println(1%16);    //1



        //128 - результат

        //перевод из 16 в 10 classic way
        System.out.println(1*Math.pow(16,2) + 2*Math.pow(16,1) + 8*Math.pow(16,0));

        int q16 = 0x128;
        System.out.println(q16);
    }
}
