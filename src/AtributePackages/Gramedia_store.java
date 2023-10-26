package AtributePackages;

import ProductPackages.Book;
import java.util.ArrayList;

/**
 *
 * @author rafli
 */
public class Gramedia_store implements store {
    private ArrayList<Book> bookList = new ArrayList();
  
    public Cart cart = new Cart();
    
    @Override
    public void setBookList(Book book){
        bookList.add(book);
    }
    
    @Override
    public ArrayList<Book> getBookList(){
        return bookList;
    }
    
    @Override
    public void showListBook(){
        System.out.println("Books available at Gramedia");
        bookList.forEach(item -> {
            int index = bookList.indexOf(item) + 1;
            System.out.print(index + ". ");
            item.detailProduct();
            System.out.println();
        });
    }
}
