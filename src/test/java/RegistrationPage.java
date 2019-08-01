import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationPage extends BaseUI {

    @Test
    public void testRegistrationPage() {

        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-lg'][@data-action='next-page'][text()='Next']")).click();
        driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(Data.username);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@placeholder='Type your location']")).sendKeys("Los Angeles");
        driver.findElement(Locators.CHECKBOX).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-lg'][@data-page='3']")).click();


    }


}
