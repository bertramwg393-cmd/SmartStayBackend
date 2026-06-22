public class Reservation {
    private String reservationId;
    private String roomNumber;
    private String guestName;

    public Reservation(String reservationId, String roomNumber, String guestName) {
        this.reservationId = reservationId;
        this.roomNumber = roomNumber;
        this.guestName = guestName;
    }

    @Override
    public String toString() {
        return "訂單編號: " + reservationId + ", 房號:ㄕ " + roomNumber + ", 房客:" + guestName;
    }
}
