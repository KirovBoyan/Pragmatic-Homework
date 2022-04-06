/*Направете Demo клас, в който си инстанциирайте един човек от този клас, и му извикайте въпросните
методи/конструктор и обработете евенуални exceptional събития ако настъпват.*/

package Java.Homework11;

import Java.Homework11.Exceptions.NoNegativeAgeException;
import Java.Homework11.Exceptions.NoNegativeHeightException;
import Java.Homework11.Exceptions.NoNegativeWeightException;

public class DemoPerson {
    public static void main(String[] args) throws NoNegativeAgeException, NoNegativeHeightException, NoNegativeWeightException {
        try {
            Person horhe = new Person("Georgi", -31, -168.00, -75.50);
            System.out.println(horhe.toString());
        } catch (NoNegativeAgeException e) {
            System.out.println("Invalid age! Person cannot be negative age!");
        }
        catch (NoNegativeWeightException e) {
            System.out.println("Invalid weight! Person cannot be negative weight!");
        }
        catch (NoNegativeHeightException e) {
            System.out.println("Invalid height! Person cannot be negative height!");
        } finally {
            Person horhe = new Person("Georgi", 31, 168.00, 75.50);
            System.out.println(horhe.toString());
        }
    }
}