package UITest;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    public static final String loginInputFieldXpaths = "";
    private static final String ERROR_MESSAGE_XPATH = "//span[@id='message']";

    @FindBy(id = "user")
    SelenideElement loginInput;

    @FindBy(id = "password")
    SelenideElement passwordInput;

    @FindBy(id = "login")
    SelenideElement LoginButton;

    @Step
    public LoginPage enterUserName(String userName) {
        loginInput.setValue(userName);
        return this;
    }
    @Step
    public LoginPage enterPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }
    @Step
    public LoginPage clickLoginButton() {
        LoginButton.click();
        return this;
    }

    public LoginPage verifyErrorMessageIsDisplayed(String expectedMessage) {
        $x(ERROR_MESSAGE_XPATH)
                .shouldBe(visible)
                .shouldHave(text(expectedMessage));
        return this;
    }
}

