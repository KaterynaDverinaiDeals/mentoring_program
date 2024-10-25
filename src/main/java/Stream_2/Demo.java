package Stream_2;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    Faker faker = Faker.instance(); // Create one Faker object

    public static void main(String[] args) {
        Faker faker = Faker.instance(); // Create a Faker instance

        List<User> users = List.of(
                new User(faker.name().firstName(), faker.internet().password(), faker.company().name()),
                new User(faker.name().firstName(), faker.internet().password(), faker.company().name()),
                new User(faker.name().firstName(), faker.internet().password(), faker.company().name()),
                new User(faker.name().firstName(), faker.internet().password(), faker.company().name()),
                new User(faker.name().firstName(), faker.internet().password(), faker.company().name()),
                new User(faker.name().firstName(), faker.internet().password(), faker.company().name()),
                new User(faker.name().firstName(), faker.internet().password(), faker.company().name()),
                new User(faker.name().firstName(), faker.internet().password(), faker.company().name()),
                new User(faker.name().firstName(), faker.internet().password(), faker.company().name())
        );


        // Filter users whose passwords do not contain special characters
        List<User> noSpecialCharUsers = users.stream()
                .filter(user -> user.getPassword().matches("[a-zA-Z0-9]*"))
                .collect(Collectors.toList());

        System.out.println("Users without special characters in passwords:\n" +
                noSpecialCharUsers.stream()
                        .map(User::toString)
                        .collect(Collectors.joining("\n")));  // Join all users on new lines

        // Check if there is a user whose password ends with '123'
        boolean endsWith123 = users.stream()
                .anyMatch(user -> user.getPassword().endsWith("123"));
        System.out.println("Password ending with '123': " + endsWith123);

        // Check if there is no password "secret"
        boolean noSecretPassword = users.stream()
                .noneMatch(user -> user.getPassword().equals("secret"));
        System.out.println("Password 'secret' is absent: " + noSecretPassword);

        // Check if all passwords contain both: letters and digits
        boolean allPasswordsContainLettersAndDigits = users.stream()
                .allMatch(user -> user.getPassword().matches(".*[a-zA-Z].*") && user.getPassword().matches(".*[0-9].*"));
        System.out.println("All passwords contain letters and digits: " + allPasswordsContainLettersAndDigits);

        // Find the first user whose name starts with 's'
        users.stream().filter(user -> user.getUsername().startsWith("s")).findFirst().ifPresentOrElse(
                user -> System.out.println("First user with a name starting with 's': " + user),
                () -> System.out.println("No users found with a name starting with 's'")
        );


        // Concatenate usernames and passwords
        String concatenatedUsers = users.stream()
                .map(user -> user.getUsername() + "," + user.getPassword())
                .reduce((acc, userInfo) -> acc + ", " + userInfo)
                .orElse("");   // If list is empty, return an empty string
        System.out.println("Concatenated usernames and passwords: " + concatenatedUsers);

        // Create a list of lists of users
        List<List<User>> listOfUserLists = List.of(
                List.of(
                        new User(faker.name().firstName(), faker.internet().password(), faker.company().name()),
                        new User(faker.name().firstName(), faker.internet().password(), faker.company().name())
                ),
                List.of(
                        new User(faker.name().firstName(), faker.internet().password(), faker.company().name()),
                        new User(faker.name().firstName(), faker.internet().password(), faker.company().name())
                ),
                users
        );

        // Merge all lists of users into one list
        List<User> combinedUserList = listOfUserLists.stream()
                .flatMap(List::stream)  // Flatten the list of lists
                .collect(Collectors.toList());
        System.out.println("Combined user lists: " + combinedUserList);


        // Print users whose company name contains the letter 'a'
        System.out.println("Users with 'a' in company name:");
        users.stream()
                .filter(user -> user.getCompany().toLowerCase().contains("a"))  // Filter users by company name containing 'a'
                .forEach(user -> System.out.println(user));

        // Add a last name to each user's first name
        System.out.println("Users with last names added:");
        users.stream()
                .map(user -> new User(
                        user.getUsername() + " " + faker.name().lastName(),  // Add last name to the username
                        user.getPassword(),
                        user.getCompany()))
                .forEach(user -> System.out.println(user));
    }
}