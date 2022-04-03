/*Да се въведат от потребителя 2 числа. И да се изведат на екрана всички числа от по-малкото до по-голямото.*/

package Java.Homework2;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        System.out.println("Enter 1st number: ");
        Scanner numbers = new Scanner(System.in);
        int number1 = numbers.nextInt();
        System.out.println("Enter 2nd number: ");
        int number2 = numbers.nextInt();

        if (number1 > number2) {
            while (number1 >= number2) {
                System.out.println(number2);
                number2++;
            }
        } else {
            while (number2 >= number1) {
                System.out.println(number1);
                number1++;
            }
        }
    }
}