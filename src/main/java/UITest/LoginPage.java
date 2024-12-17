package UITest;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

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

    public LoginPage clickLoginButton() {
        LoginButton.click();
        return this;
    }

    public LoginPage verifyErrorMessageIsDisplayed(String expectedMessage) {
        $x("//span[@id='message']")
                .shouldBe(visible)
                .shouldHave(text(expectedMessage));
        return this;
    }

//    public LoginPage verifyErrorMessageForInvalidCredentials(String expectedMessage) {
//        $x("//span[@id='message']")
//                .shouldBe(visible)
//                .shouldHave(text(expectedMessage));
//        return this;
//}
    }

