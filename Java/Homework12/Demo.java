/*Извикайте в Demо клас методите на два бележника – SimpleNotepad и SecuredNotepad*/

package Java.Homework12;

public class Demo {
    public static void main(String[] args) {
        INotepad securedNotepad = new SecuredNotePad("12345");

        securedNotepad.createPage("Try", "First try");
        securedNotepad.createPage("No longer try", "Do, or do not, there is no try!");
        securedNotepad.createPage("Yoda", "Yoda is the best teacher in the galaxy!");
        securedNotepad.createPage("Grogu", "Grogu is the best 'baby' in the galaxy");
        securedNotepad.createPage("Delete me", "Page for deletion");

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

        securedNotepad.previewAllPages();

        System.out.println("--------------------SimpleNotepad incoming---------------------");

        INotepad myNotepad = new SimpleNotepad();

        myNotepad.createPage("Title1", "Text1");
        myNotepad.createPage("Title2", "Text2");
        myNotepad.createPage("Title3", "Text3");

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

        myNotepad.previewAllPages();
    }
}