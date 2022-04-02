/*Въведете 2 различни целочислени числа от конзолата. Запишете тяхната сума, разлика, произведение, остатък от деление
и целочислено деление в отделни променливи и разпечатайте тези резултати в конзолата. Опитайте същото с числа с плаваща
запетая.*/

package Java.Homework1;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();

        int sum = (number1 + number2);
        int sub = (number1 - number2);
        int mul = (number1 * number2);
        int div = (number1 / number2);
        int mod = (number1 % number2);

        System.out.println(number1 + " + " + number2 + " = " + (sum));
        System.out.println(number1 + " - " + number2 + " = " + (sub));
        System.out.println(number1 + " * " + number2 + " = " + (mul));
        System.out.println(number1 + " / " + number2 + " = " + (div));
        System.out.println(number1 + " % " + number2 + " = " + (mod));
    }
}