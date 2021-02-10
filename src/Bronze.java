public class Bronze extends MembershipType{
    int tradeLimit = 5;
    int pointMin = 1;
    int pointMax = 9;

    @Override
    public String getMembership() {
        return "Bronze";
    }

    @Override
    public int getTradeLimit() {
        return tradeLimit;
    }
}
