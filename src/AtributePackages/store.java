package AtributePackages;

import ProductPackages.Book;
import java.util.ArrayList;

public interface store {
    void setBookList(Book book);
    ArrayList<Book> getBookList();
    void showListBook();
}
