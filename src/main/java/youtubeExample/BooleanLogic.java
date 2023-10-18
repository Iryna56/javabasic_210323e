package youtubeExample;

public class BooleanLogic {
    public static void main(String[] args) {
        // сынок, купил хлеб
        boolean isBoughtBread = true;
        // сынок купил молоко
        boolean isBoughtMilk = true;

        //And - логическое И, если два значения true, то тогда true, иначе false
         boolean isBoughtMilkAndBread = isBoughtBread && isBoughtMilk;

        if (isBoughtBread && isBoughtBread) {
            System.out.println("Купил хлеб и молоко");
        } else if (isBoughtBread) {
            System.out.println("хотя бы купил хлеб");

        } else if (isBoughtMilk) {
            System.out.println("хотя бы купил молоко");

        } else {
            System.out.println("хлеба нет и молока нет");
        }

        // Логическое или, если хотя бы одно значение true, то тогда true,
        // если все значения false, то тогда все значения  false

        boolean isBoughtMilkOrBread = true || true;
//        boolean isBoughtMilkOrBread = true || true -> true
//        boolean isBoughtMilkOrBread = true || false -> true
//        boolean isBoughtMilkOrBread = false || false -> false
//        boolean isBoughtMilkOrBread = false
        // NOT - логическое нет, которое переворачивает значение  true на false  и наоборот
        // Купил сладости или нет
        boolean isBoughtCandy = false;
        if (!isBoughtCandy) {
            System.out.println("Мама хвалит сына");
        }

    }
}
