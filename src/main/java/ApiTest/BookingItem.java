package ApiTest;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BookingItem {
    private int bookingid;
    private BookingBody booking;
}
