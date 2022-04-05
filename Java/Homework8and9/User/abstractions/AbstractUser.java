/*Да се създаде abstract-ен клас AbstractUser, който е User (помислете какво бихте изнесли в него, какво общо има
между потребителите и т.н.)*/

package Java.Homework8and9.user.abstractions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractUser implements User {
    private String userName;
    private String registrationDate;
    private boolean isLoggedIn;
    private boolean isAdmin;

    public AbstractUser(String userName) {
        DateFormat df = new SimpleDateFormat("dd:MM:yy HH:mm:ss");
        Date currentDate = new Date();

        this.userName = userName;
        this.isAdmin = false;
        this.registrationDate = df.format(currentDate);
    }

    public AbstractUser(String userName, boolean isAdmin) {
        DateFormat df = new SimpleDateFormat("dd:MM:yy HH:mm:ss");
        Date currentDate = new Date();

        this.userName = userName;
        this.isAdmin = isAdmin;
        this.registrationDate = df.format(currentDate);
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    protected void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    protected boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public void login() {
        System.out.println("User " + this.userName + " has logged in");
        this.isLoggedIn = true;
    }

    @Override
    public void logout() {
        System.out.println("User " + this.userName + " has logged out");
        this.isLoggedIn = false;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "[userName=" + userName + ", registrationDate=" + registrationDate + ", isAdmin=" + isAdmin + ", isLoggedIn=" + isLoggedIn + "]";
    }
}