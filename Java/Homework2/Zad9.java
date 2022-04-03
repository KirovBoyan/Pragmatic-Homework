/*Да се прочетат 2 числа от клавиатурата А и В. Да се изведат всички
числа от А до В на степен 2(разделени с запетая). Ако някое число е кратно на 3, да
се изведе съобщение че числото се пропуска „skip 3“. Ако сумата от всички
изведени числа (без пропуснатите) стане по-голяма от 200, да се прекрати
извеждането.*/

package Java.Homework2;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        System.out.println("Enter A number: ");
        Scanner number = new Scanner(System.in);
        int A = number.nextInt();
        System.out.println("Enter B number: ");
        int B = number.nextInt();

        for (int i = A; A <= B; A++) {
            if (i % 3 == 0) {
                System.out.println("skip " + i);
                i++;
                continue;
            }
            int sqr = i * i;
            int sum = sqr + sqr;
            if (sum > 200) {
                break;
            }
            System.out.println(sqr);
            i++;
        }
    }
}