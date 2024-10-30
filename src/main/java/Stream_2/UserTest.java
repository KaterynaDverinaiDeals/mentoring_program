package Stream_2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class UserTest {
    private final List<User> users = List.of(
            new User("Ilona", "password", "Company1"),
            new User("John", "password", "Company1"),
            new User("Mike", "password", "Company1"));

    @Test
    public void checkUserHaveALatter() {
        boolean containsA = users.stream()
                .anyMatch(user -> user.getUsername().contains("a"));
        Assert.assertTrue("Users list doesn`t contain 'a' in user name", containsA);
    }
}
