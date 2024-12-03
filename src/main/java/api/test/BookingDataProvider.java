package api.test;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;


import static io.restassured.http.ContentType.JSON;

public class BookingDataProvider {
    private static final String URI = "https://restful-booker.herokuapp.com";

    public BookingItem createBooking(BookingBody bookingBody) {
        return RestAssured.given()
                .when()
                .log().all()
                .baseUri(URI)
                .basePath("/booking")
                .contentType(JSON)
                .body(bookingBody)
                .post()
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .body()
                .as(BookingItem.class);
    }

    public BookingItem updateBooking(int bookingId, BookingBody updatedBooking, String token) {
        return RestAssured.given()
                .when()
                .log().all()
                .baseUri(URI)
                .basePath("/booking/{id}")
                .contentType(JSON)
                .header("Cookie", "token=" + token) // Передача токена в Cookie
                .pathParam("id", bookingId)
                .body(updatedBooking)
                .put()
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .body()
                .as(BookingItem.class);
    }

    public String getToken(UserBody body) {
        return RestAssured.given()
                .when()
                .baseUri(URI)
                .contentType(JSON)
                .body(body)
                .post("/auth")
                .then()
                .extract().body().jsonPath().getString("token");
    }

    public String getBookings() {
        return RestAssured.given()
                .when()
                .baseUri(URI)
                .basePath("/booking")
                .contentType(JSON)
                .get()
                .then()
                .extract()
                .body()
                .asString();
    }

    public String getBooking(String id) {
        return RestAssured.given()
                .when()
                .baseUri(URI)
                .basePath("/booking/{bookingId}")
                .contentType(JSON)
                .pathParam("bookingId", id)
                .get()
                .then()
                .extract()
                .body()
                .asString();
    }

}