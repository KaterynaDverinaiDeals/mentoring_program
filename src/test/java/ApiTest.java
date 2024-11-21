

import org.testng.annotations.Test;

import static io.restassured.http.ContentType.JSON;

public class ApiTest {
    private static final String URI = "https://restful-booker.herokuapp.com";


    public String getBookings() {
        return RestAssured.given()
                .when()
                .baseUri(URI)
                .basePath("/booking")
                .contentType(JSON)
                .when()
                .get()
                .then()
                .extract().body().asString();
    }

    public String getBooking(String id) {
        return RestAssured.given()
                .when()
                .baseUri(URI)
                .basePath("/booking {bookingId}")
                .contentType(JSON)
                .pathParam("bookingId", id)
                .when()
                .get(id)
                .then()
                .extract().body().asString();
    }
        public String createBooking (BookingBody bookingBody){
            return RestAssured.given()
                    .when()
                    .baseUri(URI)
                    .basePath("/booking")
                    .contentType(JSON)
                    .body(bookingBody)
                    .post()
                    .then()
                    .extract().body().asString();
        }
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
                .bookingDates(dates)
                .additionalneeds("Breakfast")
                .build();

        String response = createBooking(booking);
        System.out.println("Response: " + response);
    }
}
