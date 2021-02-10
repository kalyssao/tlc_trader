import java.lang.reflect.Array;

public class Account {
    int accountId;
    double totalValue;
    static Trade[] tradeList;

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public Account(int id, double value){
        this.accountId = id;
        this.totalValue = value;

    }

    public static void main(String[] args) {
        for (Trade t : tradeList){
            if (t.getPrice() < 10.00) {
                System.out.println(t);
            }
        }
    }
}
