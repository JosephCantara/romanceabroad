import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogPage extends BaseUI {

    String currentEastEuropeWomanUrl;
    String actualEuWomanTitle;

    @Test
    public void testBlogPage() {

        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']")).click();
        driver.findElement(Locators.LINK_EEUWOMAN).click();
        currentEastEuropeWomanUrl = driver.getCurrentUrl();
        System.out.println(currentEastEuropeWomanUrl);
        Assert.assertEquals(currentEastEuropeWomanUrl, Data.expectedEastEuropeWomanUrl);
        actualEuWomanTitle = driver.findElement(Locators.TITTLE_H3_EEWOMAN_PAGE).getText();
        Assert.assertEquals(actualEuWomanTitle,Data.euWomanPageTitle);


    }

}
