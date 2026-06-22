import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Reservation> hotelList = new ArrayList<>();

        hotelList.add(new Reservation("R001", "301", "張小明"));
        hotelList.add(new Reservation("R002", "302", "王大同"));
        hotelList.add(new Reservation("R003", "303", "陳美麗"));

        System.out.println("===== 今日旅宿系統預約清單 =====");
        for (Reservation res : hotelList) {
            System.out.println(res.toString());
        }
    }
}