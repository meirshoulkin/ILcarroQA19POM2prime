package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SplashPage extends BasePage {

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/versionText']")
    MobileElement androidWidgetTextView;

    public boolean validateVersionDisplaysCorrect() {
        String actualResult = getText(androidWidgetTextView);
        String expectedResult = "Version 1.0.0".toUpperCase();
        if(actualResult.equals(expectedResult)) {
            return true;
        } else {
            System.out.println("Expected result: " + expectedResult +
                    " Actual result: " + actualResult);
            return false;
        }
    }

}
