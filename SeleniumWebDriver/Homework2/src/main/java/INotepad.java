/**
 * Create Interface for notepad - INotepad. Every notepad can do:
 * - Calling method, which creates and writes on the newly created page
 * - Rewrites some text on the chosen page
 * - Deletes the text from the chosen page
 * - Preview all the pages (prints the title and the text)
 */
public interface INotepad {

    /**
     * Method that creates new pages
     * @param title the title of the new page
     * @param text the text on the new page
     */
    void createPage(String title, String text);

    /**
     * Method that replaces text in selected page
     * @param text new text that should replace the old one
     * @param pageNumber the number of the page, that we want to edit
     */
    void replaceText(int pageNumber, String text) throws PageNotFoundException;

    /**
     * Method that deletes text in selected page
     * @param pageNumber the number of the page, that we want to edit
     */
    void deleteText(int pageNumber) throws PageNotFoundException;

    /**
     * Method that previews all the existing pages
     */
    void previewAllPages();
}