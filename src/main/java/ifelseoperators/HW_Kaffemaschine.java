package ifelseoperators;

import java.util.Scanner;

public class HW_Kaffemaschine {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls which trink you want ( 1 = espresso; 2 = americano; 3 = cappuccino; 4 = tea): ");
        int trink = sc.nextInt();
        sc.close();

        if (trink == 1) {
            System.out.println("your coffee is getting ready");
        } else if (trink == 2) {
            System.out.println("americano");

        } else if (trink == 3) {
            System.out.println("cappuccino");

        } else if (trink == 4) {
            System.out.println("tea");

        }




    }
public String result1;
    public  void makeEspresso() {

        System.out.println("espresso");
    }
    public  void makeCappucino() {
        System.out.println("espresso with milk");
    }
    public  void makeAmericano() {
        System.out.println("espresso with water");

    }
}
