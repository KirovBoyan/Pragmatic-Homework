/**
 *Every page has:
 * - Title
 * - Text
 * - Number
 * Every page will have this functionalities:
 * - Text can be added to every page
 * - Text can be deleted from every page
 * - Every page can be previewed
 */

/**
 * Class Page that creates object page with 3 parameters: title, text and pageNumber
 */
public class Page {
    private String title;
    private String text;
    private int pageNumber;

    /**
     * Constructor which creates a page with title and text
     * @param title the title of the new page
     * @param text the text on the new page
     */
    public Page(String title, String text) {
        this.title = title;
        this.text = text;
    }

    /**
     * Method that returns the current page number
     * @return pageNumber returns the current page number
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Method that sets the current page number
     * @param pageNumber enters the number of the chosen page
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Method that adds text to a page
     * @param text adds this text to page
     */
    void addText(String text) {
        this.text = this.text + text;
    }

    /**
     * Method that deletes text from a page
     */
    void deleteText() {
        this.text = "";
    }

    /**
     * Method that previews the text on the page
     */
    String preview() {
        return this.title + "\n" + this.text;
    }
}