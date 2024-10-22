package inheritance;

public class Demo {

    public static void main(String[] args) throws InvalidCallerNameException {
        Phone phone1 = Phone.builder()
                .withNumber("(097)-555-55-55")
                .withModel("15 Pro")
                .withWeight("220")
                .build();

        Phone phone2 = Phone.builder()
                .withNumber("(093)-123-45-67")
                .withModel("24+")
                .withWeight("285")
                .build();

        Phone phone3 = Phone.builder()
                .withNumber("099-555-55-88")
                .build();

        phone1.sendMessage("(097)-555-55-10", "Hola Barcelona");
        phone2.sendMessage("0(800)-555-00-88", "Hvala Puno");
        phone3.sendMessage("099-555-55-88", "Ciao Ciao!");

        try {
            phone1.receiveCall("Diogo");
            // Питання: як тут зробити так, щоб код не "падав" на "Olga 48", а відпрацьовував далі і перевіряв наступний тел.?
            // Відповідь: обробляти кожен виклик receiveCall в окремому блоці try-catch
            phone2.receiveCall("Olga 48");
            phone1.receiveCall("Alibaba", "0800-212-2008");
            phone2.receiveCall("Spammer_555", "097-888-22-52");

        } catch (InvalidCallerNameException e) {

            System.err.println(e.getMessage());
        }

        System.out.println(phone1.getDeviceName());
        System.out.println(phone2.getDeviceName());
        phone1.setWeight("250");
        System.out.println("New phone weight: " + phone1.getWeight());
    }
}