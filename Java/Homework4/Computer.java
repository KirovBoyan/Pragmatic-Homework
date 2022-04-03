/*Допълнете задачата от предишното домашно със следните неща: Класът Computer да има следните конструктори:
- конструктор по подразбиране Computer() който инициализира полето isNotebook със стойност false, и полето
operationSystem с „Win XP“.
- констуктор с параметри Computer(int year, double price, double hardDiskMemory, double freeMemory), който първо
извиква конструктора по подразбиране и после инициализира останалите полета със стойностите подадени като аргументи.
- конструктор с параметри Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
 String operationSystem), който инициализира всички полета със стойностите подадени като аргументи на конструктора.
- метод int comparePrice(Computer otherComp), който сравнява цените на 2 компютъра.
Ако цената на първия компютър (този, за който се вика метода) е по висока от тази на компютъра подаден като аргумент,
метода връща -1. Ако цената на компютъра подаден като аргумент е по-високата, се връща 1, а ако са равни,
метода връща стойност 0.*/

package Java.Homework4;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    Computer() {
        isNotebook = false;
        operationSystem = "Win XP";
    }

    Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

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

    int comparePrice(Computer otherComp) {
        if (price > otherComp.price) {
            return -1;
        }
        if (price < otherComp.price) {
            return 1;
        } //if the prices are equal
        return 0;
    }

    @Override
    public String toString() {
        return year + " " + price + " " + isNotebook + " " + hardDiskMemory + " " + freeMemory + " " + operationSystem;
    }
}