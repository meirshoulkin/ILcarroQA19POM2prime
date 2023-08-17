import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class LoginTests extends BaseTest {

    @Test
    public void loginTestPositive() {
        String email = "john215autotest@hotmail.com";
        String password = "123456Aa$";
        searchPage = searchPage.switchToLoginPage().fillLoginForm(email, password);
        Assert.assertTrue(searchPage.validatePageTitleCorrect());
    }

}
