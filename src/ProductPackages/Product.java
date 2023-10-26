package ProductPackages;

/**
 *
 * @author rafli
 */
public class Product {
    private int id;
    private String name;
    private int stock;
    private double price;
    
    public Product(int id, String name, int stock, double price){
        this.id = id; 
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
    
//    constructor overloading
    public Product(){
    };
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getPrice(){
         return this.price;
    }
    
    public int getStock(){
         return this.stock;
    }
    
    public void detailProduct(){
         System.out.println("Product Name\t: " + getName());
         System.out.println("   Price\t: " + getPrice());
         System.out.println("   Stock\t: " + getStock());
    }
}
