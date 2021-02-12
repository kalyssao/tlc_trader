import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public  class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;
    private int value;
    LocalDate date;
    LocalTime time;
    Map<String, Trade> tradeRecord;

    //double calcDividend();
    class ValueCompare implements Comparator<Trade>{
        public int compare (Trade t1, Trade t2){
            if (t1.getValue() < t2.getValue()) { return -1; }
            if (t1.getValue() > t2.getValue()) { return 1; }
            else return 0;
        }
    }

    class VolumeCompare implements Comparator<Trade>{
        public int compare (Trade t1, Trade t2){
            if (t1.getQuantity() < t2.getQuantity()) { return -1; }
            if (t1.getQuantity() < t2.getQuantity()) { return 1; }
            else return 0;
        }
    }

    Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    public Trade(String id, String symbol, int quantity, MallonExchange exchange){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
        this.price = exchange.getPrice(symbol, quantity);
        System.out.println(this.id + this.symbol + this.quantity + this.price + exchange.getPrice("APPL", 100));
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

    public double getValue(){
        return price * quantity;
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
        List<Trade> trades = new ArrayList<>();
        Trade t1 = new Trade("T1", "AAPL", 200, 500.0);
        Trade t2 = new Trade("T2", "TSLA", 500, 100.0);

        trades.add(t1);
        trades.add(t2);

        System.out.println(trades);
        Collections.sort(trades, t1.new ValueCompare());

        System.out.println("***** Value Compare ********");
        System.out.println(trades);

        Collections.sort(trades, t1.new VolumeCompare());
        System.out.println("***** Volume Compare ********");
        System.out.println(trades);


    }
}
