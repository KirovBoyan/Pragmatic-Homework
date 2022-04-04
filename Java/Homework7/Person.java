/*Хванете решението на домашното от предишната лекция и я преправете да е енкапсулирана
(с други думи да не можем да достъпваме където каквото си искаме, а да има ограничена видимост особено, като говорим
на полетата).*/

package Java.Homework7;

public class Person {
    private String name;
    private int age;
    final boolean isMan;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    protected Person(String setName, int setAge, boolean isMan) {
        this.name = setName;
        this.age = setAge;
        this.isMan = isMan;
    }

    protected void showPersonInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        if (isMan) {
            System.out.println("Person is male");
        } else {
            System.out.println("Person is female");
        }
    }
}