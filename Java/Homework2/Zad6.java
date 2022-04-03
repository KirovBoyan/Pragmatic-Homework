/*Да се прочете число от екрана(конзолата) и да се изведе сбора на всички числа между 1 и въведеното число.*/

package Java.Homework2;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner userNumber = new Scanner(System.in);
        int number = userNumber.nextInt();

        int sum = 0;

        for (int i = 0; i <= number; i++) {
            int a = sum;
            sum = a + i;
        }
        System.out.println(sum);
    }
}