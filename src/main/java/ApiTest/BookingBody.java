package ApiTest;

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
    private BookingDates bookingDates;
    private String additionalneeds;

}
