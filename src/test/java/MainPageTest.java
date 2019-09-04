import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest extends BaseUI {


    String actualMainPageTitle;


    @Test

    public void testVideo() {
        WebElement ele = driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']"));
        driver.switchTo().frame(ele);
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();

    }

    @Test

    public void testHeader() {
        driver.get(mainUrl);

        actualMainPageTitle = driver.findElement(Locators.TITTLE_H2_MAIN_PAGE).getText();
        Assert.assertEquals(actualMainPageTitle, Data.mainPageTitle);


    }


}
