package book_purchases;

public interface store {
    void addBook(Book book);
    void showListBook();
    void addToCart(int index, int quantity);
    void buyBookFromCart();
}
