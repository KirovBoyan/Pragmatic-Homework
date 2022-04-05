/*Напишете програма, която създава колекция от тип Double и
инициализира всеки от елементите със стойност равна на индекса на
елемента умножен по 3. Да се изведат елементите на екрана.*/

package Java.Homework10;

import java.util.ArrayList;
import java.util.List;

public class Zad4 {
    public static void main(String[] args) {
        List<Double> arrayList = new ArrayList<Double>();
        int size = 10;

        for (int i = 0; i < size; i++) {
            arrayList.add(i * 3.0);
        }
        System.out.println("The ArrayList: " + arrayList);
    }
}