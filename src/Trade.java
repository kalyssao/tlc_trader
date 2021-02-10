import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public  class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;
    LocalDate date;
    LocalTime time;
    Map<String, Trade> tradeRecord;

    //double calcDividend();

    Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    public Trade(String id, String symbol, int quantity){
        MallonExchange exchange = mock(MallonExchange.class);
        when(exchange.getPrice("APPL",100 )).thenReturn(400.0);

        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
        this.price = exchange.getPrice("APPL", 100);
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

    public String getId(){
        return id;
    }

    public Map<String, Trade> recordTrade(Trade t){
        tradeRecord.put(t.getId(), t);
        return tradeRecord;
    }
    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
        System.out.println(LocalTime.now().format(formatter));
    }
}
