import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GiftPageTest extends BaseUI {

    String currentGiftPageUrl;



    @Test

    public void testGiftPage2 () {
        driver.findElement(Locators.LINK_GIFT).click();
        currentGiftPageUrl = driver.getCurrentUrl();
        System.out.println(currentGiftPageUrl);
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        Assert.assertEquals(currentGiftPageUrl,Data.expectedGiftPageUrl);
        WebElement bestsellerchart = driver.findElement(Locators.BEST_SELLER);
        boolean checkBestSellerChart = bestsellerchart.isDisplayed();
        if (checkBestSellerChart == true) {
            driver.findElement(By.xpath("//div[@class='text-overflow'][contains(text(),'Flower basket')]")).click();
        }
        WebElement flowerBasketOptions = driver.findElement(Locators.FLOWER_BASKET_OPTION);
        boolean checkFlowerBasket = flowerBasketOptions.isDisplayed();
        if (checkFlowerBasket == true){
            driver.findElement(By.xpath("//img[@src='https://romanceabroad.com/uploads/store/0/0/0/12/great-8837694dae.jpg']")).click();

        System.out.println("Its ready for payment");
        }
        driver.findElement(Locators.PAYMENT_OPTION).isDisplayed();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(mainUrl);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }
    @Test

    public void testGiftPage3 () {
        driver.findElement(Locators.LINK_GIFT).click();
        driver.findElement(By.xpath("//a[@href=\"https://romanceabroad.com/store/sweets/20-tour_to_ukraine\"]//*[contains(text(),\"TOURS TO UKRAINE\")]")).click();
        driver.findElement(Locators.LINK_PAYPAL).click();



    }
}
