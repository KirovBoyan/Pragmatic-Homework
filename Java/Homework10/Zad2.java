/*Да се въведе число от конзолата(Scanner), след което да се създаде колекция, в която като краен резултат да има
10 елемента по следния начин:
Първите 2 елемента на колекцията са въведеното число.
Всеки следващ елемент на колекцията е равен на сбора от
предишните 2 елемента в колекцията.
След това изведете колекцията на козолата.*/

package Java.Homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        List arrayList = new ArrayList<>();
        arrayList.add(n);
        arrayList.add(n);

        //Complete the array after the second element
        for (int i = 2; i < 10; i++) {
            arrayList.add(i, (int) arrayList.get(i - 2) + (int) arrayList.get(i - 1));
        }
        System.out.println("The result ArrayList is: " + arrayList);
    }
}