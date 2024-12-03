
import api.test.*;
import org.testng.annotations.Test;
import api.test.BookingDataProvider;

public class ApiTest {
    private BookingDataProvider bookingDataProvider = new BookingDataProvider();
    private static final String AUTH_URI = "https://restful-booker.herokuapp.com";

    @Test
    public void testCreateBooking() {
        BookingDates dates = BookingDates.builder()
                .checkin("2024-11-22")
                .checkout("2024-11-25")
                .build();

        BookingBody booking = BookingBody.builder()
                .firstname("Ivan")
                .lastname("Chornyi")
                .totalprice(100.0f)
                .depositpaid(true)
                .bookingdates(dates)
                .additionalneeds("Breakfast")
                .build();

        var response = bookingDataProvider.createBooking(booking);
        System.out.println("Response: " + response);
    }

    @Test
    public void testUpdateBooking() {
        BookingDates dates = BookingDates.builder()
                .checkin("2024-11-22")
                .checkout("2024-11-25")
                .build();

        BookingBody booking = BookingBody.builder()
                .firstname("Ivan")
                .lastname("Brown")
                .totalprice(100.0f)
                .depositpaid(true)
                .bookingdates(dates)
                .additionalneeds("Breakfast")
                .build();


        var createdBooking = bookingDataProvider.createBooking(booking);
        System.out.println("Created Booking: " + createdBooking);

        UserBody user = new UserBody("admin", "password123");
        String token = bookingDataProvider.getToken(user);

        BookingBody updatedBookingItem = BookingBody.builder()
                .firstname("Iryna")
                .lastname("Brown")
                .totalprice(200.0f)
                .depositpaid(false)
                .bookingdates(dates)
                .additionalneeds("Lunch")
                .build();

        var response = bookingDataProvider.updateBooking(
                createdBooking.getBookingid(),
                updatedBookingItem,
                token
        );
        System.out.println("Updated Response: " + response);
    }
}