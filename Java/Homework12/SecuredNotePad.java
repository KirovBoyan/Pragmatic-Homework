/*Създайте бележник SecuredNotepad, който е защитен бележник.
Всеки един такъв бележник има собствена парола, която се задава при създаването му.
Бележника може да прави същите неща, като нормален бележник (SimpleNotepad), но преди извършването на всяка операция
на бележника, се изисква от потребителя да въведе паролата на бележника. Само ако е въведена правилна парола операцията
се извършва, в противен случай операцията не се извършва.*/

package Java.Homework12;

import java.util.Scanner;

public class SecuredNotePad extends SimpleNotepad {
    private String password;

    public SecuredNotePad(String password) {
        this.password = password;
    }

    private boolean checkPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        String enteredPassword = sc.nextLine();
        if (enteredPassword.equals(this.password)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Wrong!");
        }
        return false;
    }

    @Override
    public void createPage(String title, String text) {
        if (checkPassword()) {
            super.createPage(title, text);
        } else {
            System.out.println("Operation createPage is DENIED!");
        }
    }

    @Override
    public void replaceText(int pageNumber, String text) throws PageNotFoundException {
        if (checkPassword()) {
            super.replaceText(pageNumber, text);
        } else {
            System.out.println("Operation replaceText is DENIED!");
        }
    }

    @Override
    public void deleteText(int pageNumber) throws PageNotFoundException {
        if (checkPassword()) {
            super.deleteText(pageNumber);
        } else {
            System.out.println("Operation deleteText is DENIED!");
        }
    }

    @Override
    public void previewAllPages() {
        if (checkPassword()) {
            super.previewAllPages();
        } else {
            System.out.println("Operation previewAllPages is DENIED!");
        }
    }
}