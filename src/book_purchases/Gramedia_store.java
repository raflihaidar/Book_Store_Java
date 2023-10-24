package book_purchases;

import java.util.ArrayList;

/**
 *
 * @author rafli
 */
public class Gramedia_store implements store {
    private ArrayList<Book> bookList = new ArrayList();
  
    Cart cart = new Cart();
    
    @Override
    public void addBook(Book book){
        bookList.add(book);
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
    
    @Override
    public void addToCart(int index, int quantity){
        boolean status = false;
        for(Book item : cart.getCartList()){
            int cartIndex = cart.getCartList().indexOf(item);
            int indexBook = bookList.indexOf(item);
            int currStock = bookList.get(indexBook).getStock() - quantity;
            boolean checkCondition = item.getId() == index;
            if(checkCondition){
                bookList.get(indexBook).setStock(currStock);
                int dataQuantity = cart.getQuantityList().get(cartIndex);
                cart.getQuantityList().set(cartIndex, dataQuantity + quantity);
                System.out.println("\n\nSuccess Add to Cart\n");
                status = true;
            }
        }
        
        if(!status){
            for(Book book : bookList) {
                boolean checkCondition = book.getId() == index;
                int currStock = book.getStock() - quantity;
                if(checkCondition){
                    book.setStock(currStock);
                    cart.getCartList().add(book);
                    cart.getQuantityList().add(quantity);
                    status = true;
                    System.out.println("\n\nSuccess Add to Cart");
                    System.out.println();
                    break;
                }
            }
        }
        
        if(!status) System.out.println("\n\nAdd to Cart Error\n");
    }
    
    @Override
    public void buyBookFromCart(){
        if(!cart.getCartList().isEmpty()){
            cart.getCartList().clear();
            System.out.println("\n\nSuccess Buy Books\n");   
        }else{
            System.out.println("\n\nNo Books in The Cart\n");
        }
    }
    
}
