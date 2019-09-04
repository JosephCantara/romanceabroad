import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public  MainPage(WebDriver driver, WebDriverWait wait) {

        super(driver,wait);

    }

    public void clickJoinButton () {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();

    }

    public void completeFirstPartOfRegistration () {

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
    }
    public void completeSecondPartOfRegistration () {

        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-lg'][@data-action='next-page'][text()='Next']")).click();
        driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(Data.username);
        driver.findElement(By.cssSelector("#daySelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectDay']//a[text()='2']")).click();
        driver.findElement(By.cssSelector("#monthSelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectMonth']//a[text()='May']")).click();
        driver.findElement(By.cssSelector("#yearSelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectYear']//a[text()='1991']")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        //driver.findElement(By.xpath("//input[@placeholder='Type your location']")).sendKeys("Los Angeles");
        driver.findElement(Locators.CHECKBOX).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-lg'][@data-page='3']")).click();

    }

}
