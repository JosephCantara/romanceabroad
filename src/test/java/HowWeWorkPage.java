import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeWorkPage extends BaseUI {

    String currentAdvertisingUrl;
    String currentEastEuropeWomanUrl;


    @Test

    public void testHowWeWorkPage() {
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']")).click();
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/advertising']")).click();
        currentAdvertisingUrl = driver.getCurrentUrl();
        System.out.println(currentAdvertisingUrl);
        Assert.assertEquals(currentAdvertisingUrl, Data.expectedAdvertisingUrl);

    }

    @Test

    public void testHowWeWorkPage2() {

        WebElement howItWorksLink = driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']"));
        howItWorksLink.click();

        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/advertising']")).click();
        //  .get(Data.indexAdLink).click();

        //When I write code with GET , its shown in "red" i dont understand why its show red

    }

    @Test

    public void testHowWeWorkPage3() {
        driver.findElement(Locators.LINK_HOWWEWORK).click();
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']")).click();
        driver.findElement(Locators.LINK_EEUWOMAN).click();
        currentEastEuropeWomanUrl = driver.getCurrentUrl();
        System.out.println(currentEastEuropeWomanUrl);
        Assert.assertEquals(currentEastEuropeWomanUrl, Data.expectedEastEuropeWomanUrl);


    }

}

