/*Ще създадем класове репрезентиращи бележник. За целта, първо създайте клас репрезентиращ страница:
Всяка страница има:
– заглавие
– текст
– номер
Всяка страница ще има следната функционалност:
– към всяка страница може да се добавя текст
– текста на всяка станица може да бъде изтриван
– всяка страница ще може да се преглежда(т.е. метод, който връща
String със заглавието и текста на нов ред)*/

package Java.Homework12;

public class Page {
    private String title;
    private String text;
    private int pageNumber;

    public Page(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    void addText(String text) {
        this.text = this.text + text;
    }

    void deleteText() {
        this.text = "";
    }

    String preview() {
        return this.title + "\n" + this.text;
    }
}