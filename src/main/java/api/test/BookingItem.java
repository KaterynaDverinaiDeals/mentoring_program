package api.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingItem {
    private int bookingid;
    private BookingBody booking;
    private String firstname;
    private String lastname;
    private float totalprice;
    private boolean depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;
}

