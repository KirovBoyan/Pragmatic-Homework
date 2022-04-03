/*Започвайки от 3, да се изведат на екрана първите n числа които се делят
на 3. Числата да са разделени със запетая.*/

package Java.Homework2;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        System.out.println("Choose one number: ");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        for (int i = 3; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}