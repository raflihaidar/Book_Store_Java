package AtributePackages;

import ProductPackages.Book;
import java.util.ArrayList;

/**
 *
 * @author rafli
 */
public class Cart {
    private ArrayList<Book> cartList = new ArrayList();
    private ArrayList<Integer> quantityList = new ArrayList();
   
   public ArrayList<Book> getCartList(){
       return cartList;
   }
   
   public void setCartList(Cart cart, Gramedia_store store, int index, int quantity){
        boolean status = false;
        
        //cek isi keranjang
        for(Book item : cart.getCartList()){
            int cartIndex = cart.getCartList().indexOf(item);
            int bookIndex = store.getBookList().indexOf(item);
            int currStock = store.getBookList().get(bookIndex).getStock() - quantity;
            boolean checkCondition = item.getId() == index && quantity <= item.getStock() ;
            if(checkCondition){
                store.getBookList().get(bookIndex).setStock(currStock);
                int dataQuantity = cart.getQuantityList().get(cartIndex);
                cart.getQuantityList().set(cartIndex, dataQuantity + quantity);
                System.out.println("\n\nSuccess Add to Cart\n");
                status = true;
                break;
            }
        }
        
        //cek isi bookList
        if(!status){
            for(Book book : store.getBookList()) {
                boolean checkCondition = book.getId() == index && quantity <= book.getStock();
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
   
   public ArrayList<Integer> getQuantityList(){
       return quantityList;
   }
    
   public void getPaymentAmount() {
       double amount = 0;
       for(int i = 0; i < cartList.size(); i++){
           amount += (cartList.get(i).getPrice() * quantityList.get(i));
       }
       System.out.println("Total Payment : " + "$" + amount);
    }
   
   public void showCart(){
       System.out.println("Cart");
       if(cartList.isEmpty()){
           System.out.println("Cart Is Empty!");
       }else{
           for(int i = 0; i < cartList.size(); i++){
               System.out.print("Name : " + cartList.get(i).getName() + " | ");
               System.out.print("Author : " + cartList.get(i).getAuthor() + " | ");
               System.out.print("Price : " + "$" + cartList.get(i).getPrice() + " | ");
               System.out.println("Quantity : " + quantityList.get(i) + " |");
           }
       }
   }
   
    public void checkOut(Cart cart){
        if(!cart.getCartList().isEmpty()){
            cart.getCartList().clear();
            System.out.println("\n\nSuccess Buy Books\n");   
        }else{
            System.out.println("\n\nNo Books in The Cart\n");
        }
    }
}
