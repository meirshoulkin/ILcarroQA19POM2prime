import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SplashPage;

public class SplashScreenTests extends BaseTest {

    @Test
    public void textVersionText(){
        Assert.assertTrue(splashPage.validateVersionDisplaysCorrect());
    }

}
