package Maps;

public class User {
    private String nickname;
    private String password;

    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    // Getter to retrieve the nickname
    public String getNickname() {
        return nickname;
    }

    // Getter to retrieve the password
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User:" + "nickname = " + nickname + '\'' + ", password='" + password + '\'';
    }

    //Encrypts password by replacing all digits with '#'
    public String encryptPassword(String password) {
        StringBuilder encrypted = new StringBuilder();
        // Loop through each character in password
        for (char c : password.toCharArray()) {
            // Replace digits with '#', leave other characters unchanged
            extracted(c, encrypted);
        }
        // Return encrypted password as a string
        return encrypted.toString();
    }

    private static void extracted(char c, StringBuilder encrypted) {
        if (Character.isDigit(c)) {
            // If current character is digit, append  '#' symbol to StringBuilder
            encrypted.append('#');
        } else {
            encrypted.append(c);
        }
    }
}


