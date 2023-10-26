
package book_purchases;

import AtributePackages.*;
import ProductPackages.Book;
import java.util.Scanner;

/**
 *
 * @author rafli
 */
public class Book_purchases {

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) { // Cetak 50 baris kosong
            System.out.println();
        }
    }

    public static void main(String[] args) {

        boolean stop = false;

        Book book1 = new Book(
                                1,
                                "Java Programming", 
                                "John Smith",  
                                20, 
                                29.99,
                                "Programming",
                                "23 October 2023",
                                150,
                                "English"
                              );
        
        Book book2 = new Book(
                                2,
                                "Python basics", 
                                "Alice Johnson", 
                                10,
                                19.99,
                                "Programming",
                                "10 Agust 1999",
                                200,
                                "English"
                               );
            
        Book book3 = new Book(
                                3,
                                "Clean Code", 
                                "Robert C.Martin", 
                                15, 
                                30,
                                "Programming",
                                "4 January 2004",
                                250,
                                "English"
                            );
        Book book4 = new Book(
                                4,
                                "Atomic Habbits", 
                                "James Clear", 
                                8, 
                                14.79,
                                "Self Improvement",
                                "20 Maret 2000",
                                300,
                                "Indonesia"
                             );

        // create object cart dari class Gramedia Store
        Gramedia_store store = new Gramedia_store();
        Cart cart = new Cart();

        // Tambah ke arrayList
        store.setBookList(book1);
        store.setBookList(book2);
        store.setBookList(book3);
        store.setBookList(book4);

        while (!stop) {
            Scanner dd = new Scanner(System.in);
            System.out.println("1. Show Book Catalog");
            System.out.println("2. Show cart");
            System.out.println("3. Checkout books");
            System.out.println("4. Exit");
            System.out.print("Enter Menu : ");
            String menuInput = dd.nextLine();
            int input = Integer.parseInt(menuInput);
            clearConsole();
            switch (input) {
                case 1 -> {
                    store.showListBook();
                    System.out.print("Enter book number : ");
                    String index = dd.nextLine();
                    input = Integer.parseInt(index);
                    System.out.print("Enter quantity : ");
                    String quantityInput = dd.nextLine();
                    int quantity = Integer.parseInt(quantityInput);
                    cart.setCartList(cart, store, input, quantity);
                }
                case 2 -> {
                    cart.showCart();
                    cart.getPaymentAmount();
                }
                case 3 -> cart.checkOut(cart);
                case 4 -> stop = true;
                default -> System.out.println("Input Error");
            }
        }
    }
}
