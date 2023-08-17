package pages;

import config.AppiumConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(AppiumConfig.getDriver()), this);
    }

    public String getText(MobileElement element) {
        wait(element, 15);
        return element.getText().trim().toUpperCase();
    }

    public void typeText(String text, MobileElement element) {
        wait(element, 15);
        element.click();
        element.clear();
        element.sendKeys(text);
        AppiumConfig.getDriver().hideKeyboard();// driver.hideKeyboard()
    }

    public void click(MobileElement element) {
        wait(element, 15);
        element.click();
    }

    private void wait(MobileElement element, int seconds) {
        new WebDriverWait(AppiumConfig.getDriver(), seconds)
                .until(ExpectedConditions.visibilityOf(element));
    }

}
