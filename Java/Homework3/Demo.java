/*Да се създаде клас ComputerDemo, с main метод. В рамките на main метода да се създадат 2 обекта от тип Computer.
Да се зададат стойности на всеки от компютрите за year, price, hardDiskMemory, freeMemory, operationSystem.
Нека единият компютър да е лаптоп. На единия от двата компютъра да се задели памет 100 (чрез метода useMemory),
а на другия, да се смени операционната система (чрез метода changeOperationSystem),*/

package Java.Homework3;

public class Demo {
    public static void main(String[] args) {
        Computer HP = new Computer();
        HP.year = 2020;
        HP.price = 1800.00;
        HP.isNotebook = true;
        HP.hardDiskMemory = 1000.00;
        HP.freeMemory = 16000.00;
        HP.operationSystem = "Linux";

        Computer Acer = new Computer();
        Acer.year = 2022;
        Acer.price = 3000.00;
        Acer.isNotebook = false;
        Acer.hardDiskMemory = 5000.00;
        Acer.freeMemory = 32000;
        Acer.operationSystem = "Windows";

        Acer.useMemory(100.00);
        HP.changeOperationSystem("Windows");

        System.out.println(HP);
        System.out.println(Acer);
    }
}