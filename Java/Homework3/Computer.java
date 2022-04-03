/*Създайте клас Computer, който представя компютър.
Класът да има следните полета:
year – числова стойност показваща година на производство на компютъра
price – числова стойност (не е задължително да е цяло число) показваща
цената на компютъра
isNotebook – булева стойност – дали компютъра е преносим или не
hardDiskMemory – числова стойност за размера на хардиска
freeMemory – числова стойност показваща размера на свободната памет
operationSystem – текстово поле за операционната система на компютъра
Класът да дефинира следните методи:
-метод void changeOperationSystem(String newOperationSystem), който сменя
стойността на полето operationSystem със стойността подадена като
параметър.
-метод void useMemory(double memory), който намалява свободната памет
(freeMemory) със стойността подадена като аргумент.
Ако стойността на аргумента е по-голяма от свободната памет, извеждa съобщение "Not enough free memory!"
Да се изведат на екрана всичките полета на двата компютъра.*/

package Java.Homework3;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
        System.out.println("Your new operation system is: " + newOperationSystem);
    }

    void useMemory(double memory) {
        if (memory > freeMemory) {
            System.out.println("Not enough memory!");
        } else {
            freeMemory = freeMemory - memory;
            System.out.println("Your free memory is now: " + freeMemory);
        }
    }

    @Override
    public String toString() {
        return year + " " + price + " " + isNotebook + " " + hardDiskMemory + " " + freeMemory + " " + operationSystem;
    }
}