package api.test;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BookingDates {
    private String checkin;
    private String checkout;

}
