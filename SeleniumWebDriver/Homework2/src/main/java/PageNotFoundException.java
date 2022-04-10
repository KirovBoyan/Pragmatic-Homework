/**
 * Creating custom exception
 */
public class PageNotFoundException extends Exception {
    public PageNotFoundException() {
    }

    /**Constructor which creates custom exception
     * @param message  the message that gets printed when the exception is caught
     */
    public PageNotFoundException(String message) {
        super(message);
    }
}