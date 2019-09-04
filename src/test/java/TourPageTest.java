import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TourPageTest extends BaseUI {

String currentTourPageUrl;
String actualTourPageTitle;


    @Test
    public void testTourPage1 () {

        driver.findElement(Locators.LINK_TOUR).click();
        currentTourPageUrl = driver.getCurrentUrl();
        System.out.println(currentTourPageUrl);
        Assert.assertEquals(currentTourPageUrl,Data.expectedToursToUkraineUrl);
        actualTourPageTitle = driver.findElement(Locators.TITTLE_H3_TOUR_PAGE).getText();
        Assert.assertEquals(actualTourPageTitle,Data.tourPageTitle);




    }

}
