/*Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.*/

package Java.Homework1;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
        System.out.println("Enter third number: ");
        int number3 = input.nextInt();

        if ((number1 > number2) && (number1 > number3)){
            if (number2 > number3) {
                System.out.println(number1 + "\n" + number2 + "\n" + number3);
            } else {
                System.out.println(number1 + "\n" + number3 + "\n" + number2); }
        } else if ((number2 > number3) && (number2 > number1)){
            if (number3 > number1) {
                System.out.println(number2 + "\n" + number3 + "\n" + number1);
            } else {
                System.out.println(number2 + "\n" + number1 + "\n" + number3);
            }
        } else {
            if ((number3 > number1) && (number3 > number2)){
                if (number1 > number2) {
                    System.out.println(number3 + "\n" + number1 + "\n" + number2);
                } else {
                    System.out.println(number3 + "\n" + number2 + "\n" + number1);
                }
            }
        }
    }
}