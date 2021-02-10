public class Gold extends MembershipType {
    int tradeLimit = 20;
    int pointMin = 20;

    @Override
    public String getMembership() {
        return "Gold";
    }

    @Override
    public int getTradeLimit() {
        return tradeLimit;
    }
}
