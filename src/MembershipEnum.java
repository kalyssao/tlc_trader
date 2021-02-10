import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public enum MembershipEnum {
    //Bronze(5),
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
//        public int getTradeLimit(){
//            return 5;
//        }
//        public boolean canTrade(){
//            int currentHour = Integer.parseInt(LocalTime.now().format(formatter));
//            if (currentHour < 10){
//                return false;
//            }
//            return true;
//        }

    Silver(10), Gold(20);

    private int tradeLimit;

    private MembershipEnum (int l){
        tradeLimit = l;
    }
    private MembershipEnum ( ){
        this(0);
    }
    public int getTradeLimit(){
        return tradeLimit;
    }
}
