package youtubeExample;

public class Switch {
    public static void main(String[] args) {
        // 1 - понедельник ..... 7 - воскресенье
        int numberDay = 3;

        switch (numberDay) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Данного дня не существует");



        }


    }
}
