package book_purchases;

import java.util.ArrayList;

/**
 *
 * @author rafli
 */
public class Cart {
    private ArrayList<Book> cartList = new ArrayList();
    private ArrayList<Integer> quantityList = new ArrayList();
    
   public Cart(){}
   
   public ArrayList<Book> getCartList(){
       return cartList;
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
}
