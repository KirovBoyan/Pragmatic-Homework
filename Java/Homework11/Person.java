/*Създайте клас репрезентиращ човек
Всеки човек има: име, години, ръст, тегло
Имате единствен конструктор, който сет-ва всичките параметри на веднъж
Имате getters & setters за всичките полета
Имплементирайте така класа, че ако има някакви неща от полетата, които НЕ е редно да приемат отрицателни стойности, да
имат свой собтвен exception навсякъде, където може да бъде set-вана стойност на тях.*/

package Java.Homework11;

import Java.Homework11.Exceptions.NoNegativeAgeException;
import Java.Homework11.Exceptions.NoNegativeHeightException;
import Java.Homework11.Exceptions.NoNegativeWeightException;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String setName, int setAge, double setHeight, double setWeight) throws NoNegativeAgeException, NoNegativeHeightException, NoNegativeWeightException {
        if (setAge < 0 ) {
            throw new NoNegativeAgeException("Only positive age!");
        }
        if (setHeight <= 0) {
            throw new NoNegativeHeightException("Only positive high!");
        }
        if (setWeight <= 0) {
            throw new NoNegativeWeightException("Only positive weight!");
        }
        this.name = setName;
        this.age = setAge;
        this.height = setHeight;
        this.weight = setWeight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return "Name: "+getName()+", age: "+getAge()+", height: "+getHeight()+", weight: "+getWeight();
    }
}
