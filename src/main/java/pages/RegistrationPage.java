package pages;

import dto.UserDTO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/editRegName']")
    MobileElement inputName;

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/editRegLastName']")
    MobileElement inputLastName;

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/editRegEmail']")
    MobileElement inputEmail;

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/editRegPassword']")
    MobileElement inputPassword;

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/checkBoxAgree']")
    MobileElement checkBox;

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/regBtn']")
    MobileElement btnYalla;

    public pages.SearchPage fillRegistrationForm(UserDTO userDto) {
        typeText(userDto.getName(), inputName);
        typeText(userDto.getLastName(), inputLastName);
        typeText(userDto.getEmail(), inputEmail);
        typeText(userDto.getPassword(), inputPassword);
        click(checkBox);
        click(btnYalla);
        return new pages.SearchPage();
    }

}
