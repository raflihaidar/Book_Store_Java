package book_purchases;

/**
 *
 * @author rafli
 */
public class Book extends Product implements Book_Information{
    private String author;
    private String bookCategory;
    private String publicationDate;
    private int numberOfPages;
    private String bookLanguage;
    
    public Book(int id, String name, String author, int stock, double price, String bookCategory, String publicationDate, int numberOfPages, String bookLanguage){
        super(id, name, stock, price);
        this.author = author;
        this.bookCategory = bookCategory;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages;
        this.bookLanguage = bookLanguage;
    }
    
    @Override
    public String getAuthor(){
        return this.author;
    }
    
    @Override
    public String geBookCategory(){
        return this.bookCategory;
    }
    
    @Override
    public String getPublicationDate(){
        return this.publicationDate;
    }
    
    @Override
    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    
    @Override
    public String getBookLanguage(){
        return this.bookLanguage;
    }
    
    @Override
    public void detailProduct(){
        System.out.println("Book Name\t\t: " + getName());
        System.out.println("   Author\t\t: " + getAuthor());
        System.out.println("   Price\t\t: " + getPrice());
        System.out.println("   Book Category\t: " + geBookCategory());
        System.out.println("   Publication Date\t: " + getPublicationDate());
        System.out.println("   Number of Page\t: " + getNumberOfPages());
        System.out.println("   Book Langauge\t: " + getBookLanguage());
        System.out.println("   Stock\t\t: " + getStock());
    }
}
