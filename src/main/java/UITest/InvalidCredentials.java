package UITest;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum InvalidCredentials {
    WRONG_PASSWORD("admin", "wrongPassword"),
    WRONG_USERNAME("wrongUser", "admin"),
    BOTH_WRONG("ababahalamaga", "wrongPassword"),
    EMPTY_PASSWORD("admin", " "),
    BOTH_EMPTY(" ", " "),
    EMPTY_USERNAME(" ", "admin"),;

    private final String username;
    private final String password;

}
