package api.test;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class BookingBody {
    private String firstname;
    private String lastname;
    private Float totalprice;
    private boolean depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;

}
