import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Reservation> hotelList = new ArrayList<>();
        Room room1 = new Room(301, 2000.0);
        Room room2 = new Room(302, 2200.0);
        Room room3 = new Room(303, 2500.0);
        hotelList.add(new Reservation("R001", room1, "張小明"));
        hotelList.add(new Reservation("R002", room2, "王大同"));
        hotelList.add(new Reservation("R003", room3, "陳美麗"));

        System.out.println("===== 今日旅宿系統預約清單 =====");
        for (Reservation res : hotelList) {
            double price = res.getRoom().getPrice();
            System.out.println(res.toString() + " | 價格: $" + price);
        }
    }
}