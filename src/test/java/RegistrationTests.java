import config.AppiumConfig;
import dto.UserDTO;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.RandomUtils;

public class RegistrationTests extends BaseTest {

    @Test
    public void registrationPositiveTest() {
        String email = randomUtils.generateRandomEmail();
        System.out.println("email: ----------------- " + email);
        UserDTO userDto = UserDTO.builder()
                .name("autotest")
                .lastName("nfdgkini")
                .email(email)
                .password("123456Aa$")
                .build();
        searchPage = searchPage.switchToRegistrationPage().fillRegistrationForm(userDto);
        Assert.assertTrue(searchPage.validatePageTitleCorrect());
    }

}
