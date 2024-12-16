package UITest;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    public static final String loginInputFieldXpaths = "";

    @FindBy(id = "user")
    SelenideElement loginInput;

    @FindBy(id = "password")
    SelenideElement passwordInput;

    @FindBy(id = "login")
    SelenideElement LoginButton;


    public LoginPage enterUserName(String userName) {
        loginInput.setValue(userName);
        return this;
    }

    public LoginPage enterPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    public LoginPage clickLoginButton (){
        LoginButton.click();
        return this;
    }

}
