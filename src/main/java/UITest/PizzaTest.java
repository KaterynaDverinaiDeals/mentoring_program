package UITest;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import static UITest.InvalidCredentials.*;
import static com.codeborne.selenide.Selenide.*;

public class PizzaTest {
    private String URL = "https://play1.automationcamp.ir/index.html";

    @BeforeMethod
    public void createSession() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        Configuration.browserCapabilities = options;
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "2108x1080";
        Configuration.headless = false;
        Selenide.open(URL);
        System.out.println("");
    }

    @Test
    public void verifyErrorMessageIsDisplayed() {
        page(PlaygroundPage.class)
                .clickButton();
        page(LoginPage.class)
                .enterUserName("admin")
                .enterPassword("adminnn")
                .clickLoginButton()
                .verifyErrorMessageIsDisplayed("Incorrect username or password. Try again!!");
    }

    @DataProvider(name = "invalidCredentialsProvider")
    public Object[][] InvalidCredentials() {
        return new Object[][]{
                {WRONG_PASSWORD},
                {WRONG_USERNAME},
                {BOTH_WRONG},
                {EMPTY_PASSWORD},
                {BOTH_EMPTY},
                {EMPTY_USERNAME},
        };
    }

    @Test(dataProvider = "invalidCredentialsProvider")
    public void verifyErrorMessageForInvalidCredentials(InvalidCredentials credentials) {
        System.out.println("Running test with credentials: " + credentials.name());
        page(PlaygroundPage.class)
                .clickButton();
        page(LoginPage.class)
                .enterUserName(credentials.getUsername())
                .enterPassword(credentials.getPassword())
                .clickLoginButton()
                .verifyErrorMessageIsDisplayed("Incorrect username or password. Try again!!");
    }

    @AfterMethod
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}


