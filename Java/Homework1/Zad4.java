/*Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ ред.*/

package Java.Homework1;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        if (number1 < number2) {
            System.out.println(number1 + "\n" + number2);
        } else {
            System.out.println((number2 + "\n" + number1));
        }
    }
}