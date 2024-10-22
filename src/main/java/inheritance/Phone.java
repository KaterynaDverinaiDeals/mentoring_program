package inheritance;

//create Phone class with fields: number, model, weight
public class Phone extends Device {
    private String number;
    private String model;
    private String weight;

    public static PhoneBuilder builder() {
        return new PhoneBuilder();
    }

    // add getters/setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    //constructor with 2 params(model, weight)
    public Phone(String model, String weight) {
        super(model); //Call the Device constructor with the model parameter
        this.model = model;
        this.weight = weight;
    }

    //constructor with 3 params (number, model, weight). ??? (inside u call the constructor with 2 params)
    public Phone(String number, String model, String weight) {
        //Call the Device constructor with the model parameter ??? тут не розумію до кінця навіщо кожного разу викликати super(model)
        super(model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    //method with name 'receiveCall' with one param - name of a caller. Output in console: "Call from {name}"
    public void receiveCall(String callerName) throws InvalidCallerNameException {
        if (callerName.matches(".*\\d.*")) { // Method is used to check if the string contains digits
            throw new InvalidCallerNameException("Caller name contains digits: " + callerName);
        }
        System.out.println("Call from: " + "{" + callerName + "}");

    }

    //overloaded method 'receiveCall' with two params: callerName, callerNumber
    public void receiveCall(String callerName, String callerNumber) throws InvalidCallerNameException {
        if (callerName.matches(".*\\d.*")) {
            throw new InvalidCallerNameException("Caller name contains digits: " + callerName);
        }
        System.out.println("Call from: " + callerName + "(" + callerNumber + ")");
    }

    public void sendMessage(String receiverNumber, String message) {
        System.out.println("Message \"" + message + "\" was sent to phone number: " + receiverNumber);
    }

    //method getDeviceName() which will override super method
// === polymorphism ===
    @Override
    public String getDeviceName() {
        return "Phone model: " + model;
    }

}

