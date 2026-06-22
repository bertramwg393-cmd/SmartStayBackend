public class Reservation {
    private String reservationId;
    private Room room;
    private String guestName;

    public Reservation(String reservationId, Room room, String guestName) {
        this.reservationId = reservationId;
        this.room = room;
        this.guestName = guestName;
    }

    @Override
    public String toString() {
        return "訂單ID: " + reservationId + ", 房號: " + room.getRoomNumber() + ", 房客:" + guestName;
    }
}
