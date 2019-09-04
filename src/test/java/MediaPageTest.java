import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaPageTest extends BaseUI {

    String currentUrlMedia;



    @Test

    public void testMediaPage () {
        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia,Data.expectedUrlMedia);

    }
    @Test

    public void testMediaPage2 () {
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/media/index']")).click();
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/media/photo']")).click();
        driver.findElement(By.xpath("//img[@src='https://romanceabroad.com/uploads/gallery_image/0/0/3/311/big-2c82b983fa.jpg'")).click();
        driver.findElement(By.xpath("//input[@type='button'][@value='Add to favourites']")).click();


    }



}
