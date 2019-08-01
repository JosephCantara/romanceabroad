import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage extends BaseUI {


    @Test

    public void testVideo () throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']"));
        driver.switchTo().frame(ele);
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();

    }

    

}
