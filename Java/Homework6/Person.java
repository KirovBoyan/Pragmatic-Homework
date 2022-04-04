/*Класът Person репрезентиращ човек да има следните Полета:
– name - име
– age - години
– isMan - поле, показващо пола
Коструктори:
– Единствен конструктор, с параметри за всичките полета на класа
Метод:
– Метод showPersonInfo, който показва информация за човека
(изписва на конзолата стойността на всичките му полета по
подходящ начин)*/

package Java.Homework6;

public class Person {
    String name;
    int age;
    boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    void showPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (isMan) {
            System.out.println("Person is male");
        } else {
            System.out.println("Person is female");
        }
    }
}