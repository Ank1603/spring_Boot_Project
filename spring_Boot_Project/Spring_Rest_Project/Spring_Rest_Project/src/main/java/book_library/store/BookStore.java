package book_library.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import book_library.entity.Book;

public class BookStore {
private static Map<Integer,Book>  allBooks;
static {
allBooks =new HashMap<>();
Book b1 = new Book(101,"Java Complete Reference","Patrick Naughton",875.35f);
Book b2 = new Book(102,"let us C","Yashwant K",785.20f);
Book b3 = new Book(103,"let us C++","Rasmus Lerdorf",955.57f);
allBooks.put(b1.getBookId(), b1);
allBooks.put(b2.getBookId(), b2);
allBooks.put(b3.getBookId(), b3);
}
// A method to return all the books
public static  Collection<Book> getAllBooks(){
Collection<Book> allAvailableBooks = allBooks.values();
return  allAvailableBooks;
}

//All method to return one book against its ID

public static Book getOneBook(int bookId) {
	Book foundBook = allBooks.get(bookId);
	return foundBook;
}

//A method to add new book
public static void createNewBook(Book newBook) {
	allBooks.put(newBook.getBookId(), newBook);
}

}