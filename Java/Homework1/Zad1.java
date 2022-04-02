/*Да се изведат съобщения към потребителя и да се прочетат 2 числа от клавиатурата A и B
(може да са с плаваща запетая – double). После да се прочете 3-то число C и да се провери дали то е м/у A и B.
Да се изведе подходящо съобщение за това дали C е между A и B.*/

package Java.Homework1;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.println("Enter second number: ");
        double number2 = input.nextDouble();
        System.out.println("Enter third number: ");
        double number3 = input.nextDouble();
        if (number1 < number3 && number3 < number2) {
            System.out.println(number3 + " is between " + number1 + " and " + number2);
        } else if (number1 > number3 && number3 > number2) {
            System.out.println(number3 + " is between " + number1 + " and " + number2);
        } else {
            System.out.println(number3 + " is NOT between " + number1 + " and " + number2);
        }
    }
}