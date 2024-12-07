package book_library.repository;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import book_library.entity.Book;
import book_library.store.BookStore;
@Repository // Marks this class as a repository and it  is managed by spring
public class BookRepository {
public static  Collection<Book> getAllBooks(){
Collection<Book> allAvailableBooks = BookStore.getAllBooks();
return allAvailableBooks;
}
public Book getOneBook(int bookId) {
	Book foundBook = BookStore.getOneBook(bookId);
	return foundBook;
}
public static void createNewBook(Book newBook) {
	BookStore.createNewBook(newBook);
}
}