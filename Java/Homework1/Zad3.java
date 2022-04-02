/*Въведете 2 различни числа от конзолата и разменте стойността им. Разпечатайте новите стойности*/

package Java.Homework1;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        int num1 = number2;
        int num2 = number1;

        System.out.println("Number 1: " + num1 + "\n" + "Number 2: " + num2);
    }
}