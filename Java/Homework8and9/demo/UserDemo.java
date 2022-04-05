/*Създайте Demo клас с main метод, в който:
o Създайте един AdminUser
o Създайте N на брой потребителя извиквайки метода за създаване на потребител на AdminUser(и админи и нормални потребители)
o Поиграйте си и с граничните стойности дали са покрити(т.е. да не може да създадете повече потребители от колкото са
заложени, и дали можете да изтриете потребител от празна база данни)*/

package Java.Homework8and9.demo;

import Java.Homework8and9.user.abstractions.AdminUser;
import Java.Homework8and9.users.implementations.AdminUserImpl;
import Java.Homework8and9.user.abstractions.User;

public class UserDemo {
    public static void main(String[] args) {
        AdminUser milen = new AdminUserImpl("Milen");
        System.out.println("----------------CREATIONS----------------");
        milen.createUser("Gosho",false);
        User ivan = milen.createUser("Ivan", false);
        ivan.login();
        milen.createUser("Maria", false);
        milen.createUser("Stefan", false);
        milen.createUser("Stefan1", false);
        milen.createUser("Stefan2", false);
        milen.createUser("Stefan3", false);
        milen.createUser("Stefan4", false);
        milen.createUser("Stefan5", false);
        milen.createUser("Stefan6", false);
        milen.createUser("Stefan7", false);
        milen.createUser("Stefan8", false);
        milen.createUser("Magda", true);
        milen.viewAllUsers();
        System.out.println("---------------DELETION-----------------");
        milen.deleteUser("Stefan3");
        milen.deleteUser("Stefan5");
        milen.createUser("Magda", true);
        milen.login();
        ivan.logout();
        milen.viewAllUsers();
    }
}
