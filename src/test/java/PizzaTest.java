import UITest.InvalidCredentials;
import UITest.LoginPage;
import UITest.PlaygroundPage;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import java.io.ByteArrayInputStream;
import java.util.Objects;

import static UITest.InvalidCredentials.*;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.ITestResult.FAILURE;

public class PizzaTest {
    private String URL = "https://play1.automationcamp.ir/index.html";

    private static final String EXPECTED_ERROR_MESSAGE = "Incorrect username or password. Try again!!";

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
    }

    @Test
    public void verifyErrorMessageIsDisplayed() {
        page(PlaygroundPage.class)
                .clickButton();
        page(LoginPage.class)
                .enterUserName("admin")
                .enterPassword("admin")
                .clickLoginButton()
                .verifyErrorMessageIsDisplayed(EXPECTED_ERROR_MESSAGE);
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
                .verifyErrorMessageIsDisplayed(EXPECTED_ERROR_MESSAGE);
    }

    @AfterMethod
    public void addScreenshot(ITestResult result) {
        if (result.getStatus() == FAILURE) {
            var pngBytes = Selenide.screenshot(OutputType.BYTES);
            var bais = new ByteArrayInputStream(Objects.requireNonNull(pngBytes));
            Allure.attachment("Screenshot", bais);
        }
    }

    @AfterMethod
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}


