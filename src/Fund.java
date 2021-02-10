public class Fund extends Trade {
    private double dividend;
    private double percentage;

    public Fund(String id, String symbol, int quantity, int price, double percentage){
        super(id, symbol, quantity, price);
        this.percentage = percentage;
    }

    public double calcDividend(){
        this.dividend = (this.percentage / 100) * this.getPrice();
        return this.dividend;
    }
}
