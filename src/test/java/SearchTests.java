import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class SearchTests extends BaseTest {

    String city = "Tel Aviv";
    int dayFrom = 4;
    int dayTo = 10;
    int quantityNextMonth = 1;

    @Test
    public void testFillSearchForm() {
        searchResultPage = searchPage.fillSearchForm(city, quantityNextMonth, dayFrom, dayTo);
        Assert.assertTrue(searchResultPage.validateTitleDisplaysCorrect());
    }

}
