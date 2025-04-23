import java.util.Date;

public class App {
    public static void main(String[] args) {
        Guest guest = new Guest(
            "Muhammad Edgar Nadhif",
            "1234567890",
            "08123456789",
            "edgar@example.com",
            "Laki-laki"
        );

        BookingInfo booking = new BookingInfo(
            "Deluxe",
            3,
            2,
            500000,
            new Date(),
            new Date(),
            true,
            "DISC50",
            true
        );

        HotelRoomBooking bookingSystem = new HotelRoomBooking(guest, booking);
        bookingSystem.cetakDetailPemesanan();
    }
}
