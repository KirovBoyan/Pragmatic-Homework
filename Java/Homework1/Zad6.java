/*Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите им така, че
а1 да има стойността на а2, а2 да има стойността на а3, а а3 да има старата
стойност на а1.*/

package Java.Homework1;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a1 = input.nextInt();
        System.out.println("Enter second number: ");
        int a2 = input.nextInt();
        System.out.println("Enter third number: ");
        int a3 = input.nextInt();

        int an1 = a2;
        int an2 = a3;
        int an3 = a1;

        System.out.println(an1 + "\n" + an2 + "\n" + an3);
    }
}