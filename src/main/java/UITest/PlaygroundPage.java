package UITest;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class PlaygroundPage {
    private static final String BUTTON_XPATH = "//h5[contains(text(),'Sample Pages')]/ancestor::div[contains(@class,'card')]//a";
    @Step
    public void clickButton() {
        $(By.xpath(BUTTON_XPATH)).click();
    }
}

