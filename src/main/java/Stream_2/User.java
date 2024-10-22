package Stream_2;

class User {
    private String username;
    private String password;
    private String company;

    public User(String username, String password, String company) {
        this.username = username;
        this.password = password;
        this.company = company;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCompany() {
        return company;
    }

    // toString method for displaying user information
    @Override
    public String toString() {
        return "Stream_2.User{username='" + username + "', password='" + password + "', company='" + company + "'}";
    }
}


