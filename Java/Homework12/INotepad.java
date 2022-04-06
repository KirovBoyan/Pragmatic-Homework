/*Създайте интерфейс за бележник INotepad. Всеки бележник може да:
– Извиква метод, който създава и пише върху току що създадената страница
– Добавя даден текст върху страница с определен номер (изтрива
предишния и записва новия)
– Да трие текста от дадена страница
– Да преглежда всички страници (да принтира на конзолата
заглавието и текста)*/

package Java.Homework12;

public interface INotepad {
    void createPage(String title, String text);
    void replaceText(int pageNumber, String text) throws PageNotFoundException;
    void deleteText(int pageNumber) throws PageNotFoundException;
    void previewAllPages();
}
