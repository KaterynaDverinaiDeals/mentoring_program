package Stream_2;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class UserTest {
    private List<User> users;

    @BeforeMethod
    public void beforeHook() {
        System.out.println("Before hook");

        users = new ArrayList<>();
        users.add(new User("Ilona", "password", "Company1"));
        users.add(new User("John", "password123", "Company1"));
        users.add(new User("Mike", "safePassword!", "Company1"));
        users.add(new User("Yevhen", "secretPassword", "Company1"));
    }

    @Test
    public void checkUserHaveALatter() {
        boolean containsA = users.stream()
                .anyMatch(user -> user.getUsername().contains("a"));
        Assert.assertTrue(containsA, "Users list doesn`t contain 'a' in user name");
    }

    @Test
    public void checkUsersWithoutSpecialCharacters() {
        List<User> noSpecialCharUsers = users.stream()
                .filter(user -> user.getPassword().matches("[a-zA-Z0-9]*"))
                .collect(Collectors.toList());

        boolean allNoSpecialChars = noSpecialCharUsers.stream()
                .allMatch(user -> user.getPassword().matches("[a-zA-Z0-9]*"));

        Assert.assertTrue(allNoSpecialChars, "Users list contains passwords with special characters");
    }


    @Test
    public void checkPasswordEndingWith123() {
        boolean endsWith123 = users.stream()
                .anyMatch(user -> user.getPassword().endsWith("123"));

        Assert.assertTrue(endsWith123, "Users list doesn't contain a password ending with '123'");
    }


    @Test
    public void checkNoSecretPassword() {
        boolean noSecretPassword = users.stream()
                .noneMatch(user -> user.getPassword().equals("secret"));

        Assert.assertTrue(noSecretPassword, "Users list contains a user with the password 'secret'");
    }


    @Test
    public void checkAllPasswordsContainLettersAndDigits() {
        boolean allPasswordsContainLettersAndDigits = users.stream()
                .allMatch(user -> user.getPassword().matches(".*[a-zA-Z].*") && user.getPassword().matches(".*[0-9].*"));

        Assert.assertTrue(allPasswordsContainLettersAndDigits, "Not all passwords contain both letters and digits");
    }


    @Test
    public void CheckFirstUserWithNameStartingWithS() {
        boolean existsUserWithNameStartingWithS = users.stream()
                .anyMatch(user -> user.getUsername().toLowerCase().startsWith("s"));

        Assert.assertTrue(existsUserWithNameStartingWithS, "No user found with name starting with 's'");
    }


    @Test
    public void heckUsersWithCompanyContainingA() {
        boolean companyContainsA = users.stream()
                .anyMatch(user -> user.getCompany().toLowerCase().contains("a"));

        Assert.assertTrue(companyContainsA, "No user has a company name containing 'a'");
    }

    @AfterMethod
    public void afterHook() {
        System.out.println("After hook");
    }

}
