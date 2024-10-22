package Maps;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Create 3 users with nicknames and passwords
        User user1 = new User("nmelnk", "Abcd1234");
        User user2 = new User("pkel", "Efgh5678");
        User user3 = new User("nonk", "Ijkl#!78");

        // Create a list of users and add the created users to it
        List<User> users = new ArrayList<>(Arrays.asList(user1, user2, user3));

        // Create a map to store the original nicknames and encrypted passwords
        Map<String, String> userCredentials = new HashMap<>();

        // Encrypt passwords and store them in the map
        for (User user : users) {
            // Retrieve original password
            String originalPassword = user.getPassword();
            // Encrypt password by replacing digits with "#"
            String encryptedPassword = user.encryptPassword(originalPassword);
            // Add to map: nickname - encrypted password
            userCredentials.put(user.getNickname(), encryptedPassword);
        }
        // Print map with encrypted passwords
        System.out.println("User Credentials (Encrypted Passwords):");
        for (Map.Entry<String, String> entry : userCredentials.entrySet()) {
            System.out.println("Nickname: " + entry.getKey() + ", Encrypted Password: " + entry.getValue());
        }
        System.out.println("User Credentials (Original Passwords):");
        for (User user : users) {
            System.out.println(user);
        }
    }
}

