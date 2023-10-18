package youtubeExample;

public class ForI {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4};
//        for (int i = 0; i < 3; i++) {
//            System.out.println(numbers[i]);

        //Распечатать все четные числа
        int[] number2 = {3, 2, 10, 5, 8};
        for (int number : number2) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            
        }

        System.out.println("________________");
        for (int i = 0; i < number2.length; i++) {
            if (i % 2 == 0) {
                System.out.println(number2[i]);
            }
            
        }
                

    }
}
