/*Да се изведат на екрана всички нечетни числа от -10 до 10*/

package Java.Homework2;

public class Zad3 {
    public static void main(String[] args) {
        int i = -10;
        while (i <= 10) {
            if (i % 2 != 0)  {
                System.out.println(i);
            }
            i++;
        }
    }
}
