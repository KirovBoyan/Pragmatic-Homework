/*В рамките на main метода да се създадат няколко обекта от тип Computer (посредством някой от наличните конструктори).
Да се сравнят цените на някои от компютрите (посредством метода comparePrice) и да се изведе подходящо съобщение.*/

package Java.Homework4;

public class ComputerDemo {
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

        Computer Dell = new Computer(2019, 1500.00, 1000.00, 8000.00);

        Computer Mac = new Computer(2022, 4000.00, true, 100000.00, 64000.00, "Mac OS");

        Acer.useMemory(100.00);
        HP.changeOperationSystem("Windows");

        int compare1 = Dell.comparePrice(Mac);
        int compare2 = Acer.comparePrice(HP);

        switch (compare1) {
            case -1:
                System.out.println("Dell is more expensive than the Mac");
                break;
            case 1:
                System.out.println("Dell is cheaper than the Mac");
                break;
            case 0:
                System.out.println("The computers have equal prizes");
                break;
            default:
                System.out.println("Error!!!");
                break;
        }

        switch (compare2) {
            case -1:
                System.out.println("Acer is more expensive than the HP");
                break;
            case 1:
                System.out.println("Acer is cheaper than the HP");
                break;
            case 0:
                System.out.println("The computers have equal prizes");
                break;
            default:
                System.out.println("Error!!!");
                break;
        }

        System.out.println("HP: " + HP);
        System.out.println("Acer: " + Acer);
        System.out.println("Dell: " + Dell);
        System.out.println("Mac: " + Mac);
    }
}