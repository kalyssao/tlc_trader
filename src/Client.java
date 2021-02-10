import javax.print.DocFlavor;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Client {
    private String firstName;
    private String lastName;
    private int points;
    private int numberOfTrades;
    private int tradeValue;
    private int maxTradeValue = 10000;
    private MembershipType membershipType;
    private List<Trade> clientTrades;

    public Client(String fname, String lname){
        firstName = fname;
        lastName = lname;
        points = 0;
    }

    public void addTrade(Trade trade){
        // call canTrade - if it returns false, you can't add a trade
        if (canTrade()) {
            if (points == 0){
                //this.membershipType = MembershipEnum.Bronze;
            } else {
                increasePoints();
                increaseTrades();
            }
            clientTrades.add(trade);
        }

    }

    public boolean canTrade(){
        String mship = membershipType.getMembership();
        int limit = membershipType.getTradeLimit();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
        int currentHour = Integer.parseInt(LocalTime.now().format(formatter));

        if (mship.equals("Bronze")){
            if (currentHour > 10){
                System.out.println("Stuff");
            }
        }

        if (numberOfTrades < limit && tradeValue < maxTradeValue) {
            return true;
        }
        return false;
    }

    public void increaseTrades() {
        this.numberOfTrades++;
    }

    public void increasePoints() {
        this.points++;
    }

    public static void main(String[] args) {

    }
}
