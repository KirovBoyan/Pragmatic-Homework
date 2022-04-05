/*Да се създаде клас DataBase, който съдържа в себе си масив от User[]-и
o Има конструктор, който приема колко голям да е масива
o Има гетър, който ви дава възможност да вземете всички потребители*/

package Java.Homework8and9.database;

import Java.Homework8and9.user.abstractions.User;

public class DataBase {
    private User[] dataBase;

    public DataBase(int userLimitCount) {
        this.dataBase = new User[userLimitCount];
    }

    public User[] getDataBase() {
        return dataBase;
    }
}