/**
 * Create class SimpleNotepad, which is object - notepad (has multiple pages - List, and is limited by generic to
 * contains only objects of type page.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Class SimpleNotepad that creates a Notepad Object and implements the Inotepad interface
 */
public class SimpleNotepad implements INotepad {
    private List<Page> pages;

    /**
     * Constructor that makes simple notepad
     */
    public SimpleNotepad() {
        this.pages = new ArrayList<>();
    }

    /**
     * Overridden method that creates new page
     * @param title the title of the new page
     * @param text the text on the new page
     */
    @Override
    public void createPage(String title, String text) {
        Page currentPage = new Page(title, text);
        pages.add(currentPage);
        currentPage.setPageNumber(this.pages.size());
    }

    /**
     * Overridden method that replaces text in chosen page
     * @param text the text on the new page
     * @param pageNumber the number of the chosen page
     */
    @Override
    public void replaceText(int pageNumber, String text) throws PageNotFoundException {
        Page foundPage = findPage(pageNumber);
        foundPage.deleteText();
        foundPage.addText(text);
    }

    /**
     * Method that returns searched page(current page)
     * @param pageNumber the number of the chosen page
     */
    private Page findPage(int pageNumber) throws PageNotFoundException {
        for (Page currentPage : pages) {
            if (currentPage.getPageNumber() == pageNumber) {
                return currentPage;
            }
        }
        throw new PageNotFoundException("There is no page with number " + pageNumber);
    }

    /**
     * Overridden method that deletes text
     * @param pageNumber the number of the chosen page
     */
    @Override
    public void deleteText(int pageNumber) throws PageNotFoundException {
        Page foundPage = findPage(pageNumber);
        foundPage.deleteText();
    }

    /**
     * Overridden method that previews all pages
     */
    @Override
    public void previewAllPages() {
        for (Page currentPages : pages) {
            System.out.println(currentPages.preview());
        }
    }
}
