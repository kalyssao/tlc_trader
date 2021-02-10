public class Silver extends MembershipType {
    int tradeLimit = 10;
    int pointMin = 10;
    int pointMax = 19;

    @Override
    public String getMembership() {
        return "Silver";
    }

    @Override
    public int getTradeLimit() {
        return tradeLimit;
    }
}
