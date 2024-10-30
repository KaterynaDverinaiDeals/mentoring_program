package Stream_2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {
    // Static Faker instance shared across all methods
    static Faker faker = Faker.instance();

    public static void main(String[] args) {
        List<User> users = generateUsers(6);

        // Call all tasks as separate methods
        printUsers(users);
        printUsersWithoutSpecialCharacters(users);
        printPasswordEndingWith123(users);
        printNoSecretPassword(users);
        printAllPasswordsContainLettersAndDigits(users);
        printFirstUserWithNameStartingWithS(users);
        printConcatenatedUsernamesAndPasswords(users);
        printCombinedUserLists(users);
        printUsersWithCompanyContainingA(users);
        printUsersWithLastNamesAdded(users);
    }

    // Generate list of users
    private static List<User> generateUsers(int count) {
        return IntStream.range(0,count)
                .mapToObj(i-> new User(faker.name().firstName(),faker.internet().password(),faker.company().name()))
                .collect(Collectors.toList());
    }

    //All users
    private static void printUsers(List<User> users) {
        users.forEach(System.out::println);
    }

    // Filter users whose passwords do not contain special characters
    private static void printUsersWithoutSpecialCharacters(List<User> users) {
        List<User> noSpecialCharUsers = filterUsersWithoutSpecialChars(users);
        System.out.println("Users without special characters in passwords:\n" +
                noSpecialCharUsers.stream()
                        .map(User::toString)
                        .collect(Collectors.joining("\n")));
    }

    // Filter users without special characters
    private static List<User> filterUsersWithoutSpecialChars(List<User> users) {
        return users.stream()
                .filter(user -> user.getPassword().matches("[a-zA-Z0-9]*"))
                .collect(Collectors.toList());
    }

    // Check if there is a user whose password ends with '123'
    public static void printPasswordEndingWith123(List<User> users) {
        boolean endsWith123 = users.stream()
                .anyMatch(user -> user.getPassword().endsWith("123"));

        var exists = endsWith123 ? "exists" : "doesn't exist";
        System.out.println("Password ending with '123': " + exists);
    }

    // Check if there is no password "secret"
    private static void printNoSecretPassword(List<User> users) {
        boolean noSecretPassword = users.stream()
                .noneMatch(user -> user.getPassword().equals("secret"));

        var message = noSecretPassword ? "is absent" : "is present";
        System.out.println("Password 'secret': " + message);
    }

    // Check if all passwords contain both: letters and digits
    private static void printAllPasswordsContainLettersAndDigits(List<User> users) {
        boolean allPasswordsContainLettersAndDigits = users.stream()
                .allMatch(user -> user.getPassword().matches(".*[a-zA-Z].*") && user.getPassword().matches(".*[0-9].*"));

        var message = allPasswordsContainLettersAndDigits ? "yes" : "no";
        System.out.println("All passwords contain letters and digits: " + message);
    }

    // Find the first user whose name starts with 's'
    private static void printFirstUserWithNameStartingWithS(List<User> users) {
        users.stream()
                .filter(user -> user.getUsername().startsWith("s"))
                .findFirst()
                .ifPresentOrElse(
                        user -> System.out.println("First user with a name starting with 's': " + user),
                        () -> System.out.println("No users found with a name starting with 's'")
                );
    }

    // Concatenate usernames and passwords
    private static void printConcatenatedUsernamesAndPasswords(List<User> users) {
        String concatenatedUsers = users.stream()
                .map(user -> user.getUsername() + "," + user.getPassword())
                .reduce((acc, userInfo) -> acc + ", " + userInfo)
                .orElse("");   // If list is empty, return an empty string
        System.out.println("Concatenated usernames and passwords: " + concatenatedUsers);
    }

    // Create and merge combined lists of users
    private static void printCombinedUserLists(List<User> users) {
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
        List<User> combinedUserList = listOfUserLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Combined user lists: " + combinedUserList);
    }

    // Print users whose company name contains the letter 'a'
    private static void printUsersWithCompanyContainingA(List<User> users) {
        System.out.println("Users with 'a' in company name:");
        users.stream()
                .filter(user -> user.getCompany().toLowerCase().contains("a")) // Filter users with 'a' in the company name
                .forEach(user -> System.out.println(user));
    }

    // Add a last name to each user's first name
    private static void printUsersWithLastNamesAdded(List<User> users) {
        System.out.println("Users with last names added:");
        users.stream()
                .map(user -> new User(
                        user.getUsername() + " " + faker.name().lastName(),  // Add last name to the username
                        user.getPassword(),
                        user.getCompany()))
                .forEach(user -> System.out.println(user));
    }
}

