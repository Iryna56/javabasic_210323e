import com.auto.germany.Car;

public class First {

    //комментарий
    // main - создание стартовой точки
    // sout - команда для печати в консоль
    //Ctrl + d команда для создания копии строки
    // "\"" пример шаблона для вывода в консоль "
    public static void main(String[] args) {

        System.out.println("hello java");
        //сщздание экземпляра №1
       Car germanCar = new Car();
       //печать полей (переменных экземпляра класса)
        System.out.println(germanCar.model);
        System.out.println(germanCar.power);
        System.out.println(germanCar.year);
        germanCar.printCar();
        System.out.println("static" + Car.birthYear);
        Car.birthYear = 2000;
        System.out.println();
        //создание экземпляра №2
        Car anotherGermanCar = new Car();
        //изменяли поля в экземпляре №2
        anotherGermanCar.model = "bmw";
        anotherGermanCar.power = 190;
        anotherGermanCar.year = 2022;
        anotherGermanCar.printCar();
        //печать полей (переменных экземпляра класса)
        System.out.println(anotherGermanCar.model);
        System.out.println(anotherGermanCar.power);
        System.out.println(anotherGermanCar.year);

        System.out.println("static" + Car.birthYear);
    }



}
