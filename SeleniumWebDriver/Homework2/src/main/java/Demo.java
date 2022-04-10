/**
 * Main class that creates Simple notepad or secured notepad and makes stuff with them
 */
public class Demo {

    public static void main(String[] args) {
        /**
         * Making secured notepad and creating password for it
         */
        INotepad securedNotepad = new SecuredNotepad("12345");

        /**
         * Making bunch of pages
         */
        securedNotepad.createPage("Try", "First try");
        securedNotepad.createPage("No longer try", "Do, or do not, there is no try!");
        securedNotepad.createPage("Yoda", "Yoda is the best teacher in the galaxy!");
        securedNotepad.createPage("Grogu", "Grogu is the best 'baby' in the galaxy");
        securedNotepad.createPage("Delete me", "Page for deletion");

        /**
         * Catching errors
         */
        try {
            securedNotepad.replaceText(1, "are we still trying?");
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        try {
            securedNotepad.deleteText(5);
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * Previews all the pages
         */
        securedNotepad.previewAllPages();

        System.out.println("--------------------SimpleNotepad incoming---------------------");

        /**
         * Creating new simple notepad
         */
        INotepad myNotepad = new SimpleNotepad();

        /**
         * Creating bunch of pages
         */
        myNotepad.createPage("Title1", "Text1");
        myNotepad.createPage("Title2", "Text2");
        myNotepad.createPage("Title3", "Text3");

        /**
         * Catching errors
         */
        try {
            myNotepad.replaceText(3, "Go, go, power rangers!");
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        try {
            myNotepad.deleteText(6);
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * Previews all the pages
         */
        myNotepad.previewAllPages();
    }
}