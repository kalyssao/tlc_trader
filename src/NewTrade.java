import java.time.LocalDate;
import java.time.LocalTime;

public abstract class NewTrade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();


    abstract double calcDividend();

    NewTrade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public NewTrade(String id, String symbol, int quantity){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public double setPrice(double price) {
        if ( price > 0 ) {
            this.price = price;
        }
        else {
            throw new IllegalArgumentException("Price cannot be negative!");
        }
        return price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "New Trade{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
