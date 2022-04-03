/*Въведете число от клавиатурата и определете дали е просто. Просто
число е това което се дели САМО на 1 и на себе си.*/

package Java.Homework2;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner number = new Scanner(System.in);
        int prosto = number.nextInt();

        int flag = 0;
        int m = prosto / 2;

        if (prosto == 0 || prosto == 1) {
            System.out.println(prosto + " is not prime number!");
        } else {
            for (int i = 2; i <= m; i++) {
                if (prosto % i == 0) {
                    System.out.println(prosto + " is not prime number!");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(prosto + " is prime number!");
            }
        }
    }
}
