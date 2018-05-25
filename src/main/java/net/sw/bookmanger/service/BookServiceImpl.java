package net.sw.bookmanger.service;

import net.sw.bookmanger.dao.BookDao;
import net.sw.bookmanger.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BELSHINA on 13.11.2017.
 */

@Service
public class BookServiceImpl implements BookService{
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    @Transactional
    public void addBook(Book book) {
        this.bookDao.addBook(book);

    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        bookDao.updateBook(book);

    }

    @Override
    @Transactional
    public void removeBook(int id) {
        this.bookDao.removeBook(id);
    }

    @Override
    @Transactional
    public Book getBoolById(int id) {
        return this.bookDao.getBoolById(id);
    }

    @Override
    @Transactional
    public List<Book> listBooks() {
        return this.bookDao.listBooks();
    }
}
