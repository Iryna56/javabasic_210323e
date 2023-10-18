package arraysExamples;

public class Practice1 {
    public static void main(String[] args) {
        // Найти максимальный по значению элемент (внутри массива)

//        int[] q = {4,1,5,2,8,9,10};

 //       int[] q = {1,2,3,20,4,5};
        int[] q = {1,2,3, Integer.MAX_VALUE, 0};


        System.out.println(getMax(q));


    }

    public static int getMax(int[] input) {

        int max = input[0];

//        for (int e : input) {
//            System.out.println(e);
//        }

        for (int i = 1; i < input.length; i++) {
            if (input[i] > max)
                max = input[i];

        }




        return max;
    }
}
