import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftPage extends BaseUI {

    String currentToursToUkraineUrl;

    @Test

    public void testGiftPage () {
        driver.findElement(Locators.LINK_GIFT).click();
        driver.findElement(By.xpath("//a[@href=\"https://romanceabroad.com/store/sweets/20-tour_to_ukraine\"]//*[contains(text(),\"TOURS TO UKRAINE\")]")).click();
        currentToursToUkraineUrl = driver.getCurrentUrl();
        System.out.println(currentToursToUkraineUrl);
        Assert.assertEquals(currentToursToUkraineUrl,Data.expectedToursToUkraineUrl);



    }@Test

    public void testGiftPage2 () {
        driver.findElement(Locators.LINK_GIFT).click();
        driver.findElement(By.xpath("//a[@href=\"https://romanceabroad.com/store/sweets/20-tour_to_ukraine\"]//*[contains(text(),\"TOURS TO UKRAINE\")]")).click();
        driver.findElement(Locators.LINK_PAYPAL).click();



    }
}
