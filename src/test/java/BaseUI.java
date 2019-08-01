import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseUI {

    WebDriver driver;
    String mainUrl = "https://romanceabroad.com/";
    String howWeWork = "https://romanceabroad.com/content/view/how-it-works";







    @BeforeMethod
    public void setUp() {
        System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod

    public void afterAction () {

        //driver.quit();
    }


}
