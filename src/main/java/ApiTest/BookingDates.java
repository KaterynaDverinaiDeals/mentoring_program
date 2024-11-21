package ApiTest;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BookingDates {
    private String checkin;
    private String checkout;

//    public Builder checkin(String checkin) {
//        this.checkin = checkin;
//        return (Builder) this;
//    }
//
//    public Builder checkout(String checkout) {
//        this.checkout = checkout;
//        return (Builder) this;
//    }
//
//    public BookingDates build() {
//        BookingDates dates = new BookingDates();
//        dates.checkin = this.checkin;
//        dates.checkout = this.checkout;
//        return dates;
//    }
}
