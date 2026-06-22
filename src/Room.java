public class Room {
    private  int roomNumber;
    private  double price;
    private  boolean isBooked;

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("房號" + roomNumber + "訂房成功!");
        } else {
            System.out.println("房號" + roomNumber + "已經被訂走了");
        }
    }
}
