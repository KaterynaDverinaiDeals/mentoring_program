package inheritance;

// Separate class PhoneBuilder
public class PhoneBuilder {
    private String number;
    private String model;
    private String weight;

    // Method to setting phone number
    public PhoneBuilder withNumber(String number) {
        this.number = number;
        return this;
    }

    // Method for setting the phone model
    public PhoneBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    // Method to setting phone weight
    public PhoneBuilder withWeight(String weight) {
        this.weight = weight;
        return this;
    }

    // Method to create Phone object
    public Phone build() {
        return new Phone(number, model, weight);
    }
}
