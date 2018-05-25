package net.sw.bookmanger.service;

import net.sw.bookmanger.model.Book;

import java.util.List;

/**
 * Created by BELSHINA on 13.11.2017.
 */
public interface BookService {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    /**
     * Получение книги по ID
     */
    public Book getBoolById(int id);

    /**
     * Вывод всех наших книг из таблицы
     */
    public List<Book> listBooks();
}
