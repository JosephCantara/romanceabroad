import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HowWeWorkPage extends BaseUI {


    @Test

    public void testHowWeWorkPage () {
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']")).click();
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/advertising']")).click();
        Thread.sleep(2000);




    }

}

