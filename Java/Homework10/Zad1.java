/*Да се прочете колекция от екрана(Scanner) и да се намери най-малкото число кратно на 3 от колекцията. Ако няма такова
 число, да се изведе подходящо съобщение.*/

package Java.Homework10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Iterator;

public class Zad1 {
    public static void main(String[] args) {
        //Create scanner
        Scanner sc = new Scanner(System.in);
        //Create the array list
        List arrayList = new ArrayList<>();

        //Read the arraylist values from the console
        System.out.println("Put new values into the ArrayList(to stop write -> non-int value): ");
        while (sc.hasNextInt()) {
            System.out.println("Put new value into the ArrayList(to stop write -> non-int value): ");
            int i = sc.nextInt();
            arrayList.add(i);
        }
        System.out.println("The result is: " + arrayList);

        //find the minimum number multiple by 3
        Iterator itr = arrayList.iterator();
        int min = (int) arrayList.get(0);
        boolean hasNumberMultipleBy3 = false;

        while (itr.hasNext()) {
            int tmpInt = (int) itr.next();
            if (tmpInt % 3 == 0 && (min % 3 != 0 || tmpInt < min)) {
                hasNumberMultipleBy3 = true;
                min = tmpInt;
            }
        }

        if (!hasNumberMultipleBy3 && (min % 3 != 0)) {
            System.out.println("No number multiple by 3 in the array");
        } else {
            System.out.println("The minimum number multiple by 3 is " + min);
        }
    }
}