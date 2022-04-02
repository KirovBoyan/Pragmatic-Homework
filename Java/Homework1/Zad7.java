/*Въведете 3 променливи от клавиатурата – час (целочислен тип), сума пари (число
с плаваща запетая), дали съм здрав – булев тип. Съставете програма, която
взема решения на базата на тези данни по следния начин:
- ако съм болен няма да излизам
- ако имам пари ще си купя лекарства
- ако нямам – ще стоя вкъщи и ще пия чай
- ако съм здрав
- ако имам по-малко от 10 лв ще отида на кафе и т.н
Полученото решение покажете като съобщение в конзолата.*/

package Java.Homework1;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Колко е часът? ");
        int hour = input.nextInt();
        System.out.println("Колко пари имам? ");
        double money = input.nextDouble();
        System.out.println("Бплен ли съм? ");
        boolean sick = input.nextBoolean();

        if (sick) {
            if ((hour >= 8 ) && (hour <= 17)) {
                System.out.println("Ще отида на лекар!");
                if (money > 10) {
                    System.out.println("Ще си купя лекарства!");
                } else{
                    System.out.println("Ще се моля да ми мине само!");
                }
            } else {
                if (money > 10) {
                    System.out.println("Ще си купя сам лекарства!");
                } else {
                    System.out.println("Ще се моля да не е сериозно и да ми мине само!");
                }
            }
        } else {
            if ((hour >= 10) && (hour <= 23)) {
                if (money >= 10) {
                    System.out.println("Ше отида на кино!");
                } else {
                    System.out.println("Ще изляза на разходка в парка!");
                }
            } else {
                if (money >= 10) {
                    System.out.println("Ще отида на дискотека!");
                } else {
                    System.out.println("Ще играя компютърни игри вкъщи!");
                }
            }
        }
    }
}