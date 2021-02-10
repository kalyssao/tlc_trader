public class Trader {
    String name;
    Account accountToAssign;

    public double addTrade(Account a, double price, int quantity){
        accountToAssign = a;
        double currentValue = accountToAssign.getTotalValue();
        double tradeValue = price * quantity;
        accountToAssign.setTotalValue(currentValue + tradeValue);

        return currentValue + tradeValue;
    }

    public void findTrade(String tradeId){

    }
}
