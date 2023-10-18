package ifelseoperators;

public class Example2 {
    public static void main(String[] args) {
        // Например, если у нас будет хорошая погода, то мы поедем кататься на лодке
        // иначе мы пойдем в ресторан

        boolean goodWeather = true;

        if (goodWeather) {
            System.out.println("Поедем кататься на лодке");
        } else {
            System.out.println("Поход в ресторан");
        }
        System.out.println("end of file");

    }
}
