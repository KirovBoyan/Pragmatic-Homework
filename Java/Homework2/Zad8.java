/*По зададено число n, да се изведе на екрана таблица по
следния начин:*/

package Java.Homework2;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        int m = number - 1;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j = j + 1) {
                System.out.print(m);
            }
            m = m + 2;
            System.out.println();
        }
    }
}