package UITest;

public enum InvalidCredentials {
    WRONG_PASSWORD("admin", "wrongPassword"),
    WRONG_USERNAME("wrongUser", "admin"),
    BOTH_WRONG("ababahalamaga", "wrongPassword"),
    EMPTY_PASSWORD("admin", " "),
    BOTH_EMPTY(" ", " "),
    EMPTY_USERNAME(" ", "admin"),;

    private final String username;
    private final String password;

    InvalidCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
