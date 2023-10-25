package book_purchases;

public interface store {
    void setBookList(Book book);
    void showListBook();
    void addToCart(int index, int quantity);
    void buyBookFromCart();
}
