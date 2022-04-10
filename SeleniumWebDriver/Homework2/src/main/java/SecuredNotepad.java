/**
 * Create a notepad object - SecuredNotepad, that will be password protected. The password will be set when new object
 * is created.
 * The SecuredNotepad can do the same things as the SimpleNotepad, but before every operation it'll demand for the password.
 * If the entered password from the user is the same as the set one, the operation gets done, if not, the operation gets denied.
 */

import java.util.Scanner;
/**
 * Class SecuredNotepad that creates a Notepad Object and extends the SimpleNotepad class
 */
public class SecuredNotepad extends SimpleNotepad {
    private String password;

    /**
     * Constructor that creates object - SecuredNotepad
     * @param password set the password for the new SecuredNotepad
     */
    public SecuredNotepad(String password) {
        this.password = password;
    }

    /**
     * Method that checks if the given password is the correct one
     */
    private boolean checkPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        String enteredPassword = sc.nextLine();
        if (enteredPassword.equals(this.password)) {
            System.out.println("Correct!");
            /**
             * @return true that means the entered password is the correct one
             */
            return true;
        } else {
            System.out.println("Wrong!");
        }
        /**
         * @return false that means the entered password is NOT the correct one
         */
        return false;
    }

    /**
     * Overridden method that creates page only if the given password is correct
     * @param title the title of the new page
     * @param text the text on the new page
     */
    @Override
    public void createPage(String title, String text) {
        if (checkPassword()) {
            super.createPage(title, text);
        } else {
            System.out.println("Operation createPage is DENIED!");
        }
    }

    /**
     * Overridden method that replaces text in chosen page only if the password is correct
     * @param text the text on the new page
     * @param pageNumber the number of the chosen page
     */
    @Override
    public void replaceText(int pageNumber, String text) throws PageNotFoundException {
        if (checkPassword()) {
            super.replaceText(pageNumber, text);
        } else {
            System.out.println("Operation replaceText is DENIED!");
        }
    }

    /**
     * Overridden method that deletes text only in the password is correct
     * @param pageNumber the number of the chosen page
     */
    @Override
    public void deleteText(int pageNumber) throws PageNotFoundException {
        if (checkPassword()) {
            super.deleteText(pageNumber);
        } else {
            System.out.println("Operation deleteText is DENIED!");
        }
    }

    /**
     * Overridden method that previews all pages only if the password is correct
     */
    @Override
    public void previewAllPages() {
        if (checkPassword()) {
            super.previewAllPages();
        } else {
            System.out.println("Operation previewAllPages is DENIED!");
        }
    }
}