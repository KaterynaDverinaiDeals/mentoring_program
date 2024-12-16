package UITest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class PizzaTest {
    private String URL = "https://play1.automationcamp.ir/index.html";

    @BeforeMethod
    public void createSession(){
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
    public void verifyPizzaAddedToTheCart() {
        page(PlaygroundPage.class)
                .clickButton();
        page(LoginPage.class)
                .enterUserName("admin")
                .enterPassword("adminnn")
                .clickLoginButton();
        $x("//span[@id='message']")
                .shouldBe(visible)
                .shouldHave(text("Incorrect username or password. Try again!!"));
    }

    @AfterMethod
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}

