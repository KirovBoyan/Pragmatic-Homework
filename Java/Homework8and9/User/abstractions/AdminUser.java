/*Да се създаде интерфейс AdminUser, като той е и User – админ юзърите ще могат да правят всичко, което и нормалните,
но също така, ще могат и да –
o Изтриват юзър, който ще намират на базата на неговия username
o Ще могат да създават нови юзъри и от тях ще зависи дали те ще могат да са админи или не(метод, който приема два
параметъра, за username и дали е админ) и връща, като стойност създадения нов User.
o Ще могат да преглеждат всички потребители, метод който принтира цялата информация за всеки един потребител в
конзолата(без значение дали е админ или не)*/

package Java.Homework8and9.user.abstractions;

public interface AdminUser extends User{
    void deleteUser(String userName);
    User createUser(String userName, boolean isAdmin);
    void viewAllUsers();
}
