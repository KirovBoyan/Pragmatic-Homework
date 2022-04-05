/*Да се прочете колекция от екрана(Scanner) и да се провери дали е огледална.*/

package Java.Homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        //Create scanner
        Scanner sc = new Scanner(System.in);
        //Create the array
        System.out.println("Enter size for the array: ");
        int size = sc.nextInt();
        //init the array
        List arrayList = new ArrayList<>();

        for (int i=0;i<size; i++){
            System.out.println("Enter value for the index [" +i+ "]: ");
            arrayList.add(sc.nextInt());
        }

        //check if it's mirror
        boolean isMirror = true;
        for (int i=0; i<size/2;i++) {
            if (arrayList.get(i) != arrayList.get(size-1-i)){
                isMirror = false;
                break;
            }
        }
        if(isMirror){
            System.out.println("The array is MIRROR!");
        } else {
            System.out.println("The array is NOT mirror");
        }
    }
}