public class Bond extends Trade{
    private double dividend;
    public double calcDividend(){
        return this.dividend;
    }

    Bond(String id, String symbol, int quantity, double div){
        super(id, symbol, quantity);
        this.dividend = div;
    }
}
