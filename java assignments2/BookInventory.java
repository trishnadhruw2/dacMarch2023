class Book {
    private String title ;
    private String author ;
    private String publisher ;
    private String isbn ;
    private int year ;
    private double price ;
    private int quantity ;
    Book( ) {
        this.title = null ;
        this.author = null ;
        this.publisher = null ;
        this.isbn = null ;
        this.year = 0 ;
        this.price = 0.0 ;
        this.quantity = 0 ;
    }
    public void setIncreaseQuantity(int add ) {
        this.quantity = this.quantity + add ;   
    }
    public void setDecreaseQuantity( int sub ) {
        this.quantity = this.quantity - sub ;
    } 
    public int getIncreaseQuantity( ) {
        return this.quantity;
    }
    public int getDecreaseQuantity( ) {
        return this.quantity;
    }
    public void setInventoryValue(int price ) {
        this.price = price * this.quantity ;
    }
    public double getInventoryValue( ) {
        return this.price;
    }  
}

class BookInventory {
    public static void main(String[] args) {
        Book book = new Book();
        book.setIncreaseQuantity(40);
        book.setDecreaseQuantity(30);
        book.setInventoryValue(1200);
        System.out.println( "Icrease Quantity = "+book.getIncreaseQuantity()); 
        System.out.println( "Decrease Quantity = "+book.getDecreaseQuantity()); 
        System.out.println("Inventory Value = "+book.getInventoryValue());

    }

}
