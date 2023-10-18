package com.auto.germany;

public class Car {
    //поля (fields), либо переменные экземпляра класса
    public String model = "audi";
    public int power = 170;
    public int year = 2023;
    //статические переменные
    public static int birthYear = 1980;
    public void printCar () {
        String type = "sedan";
        System.out.println(type);
    }

}
