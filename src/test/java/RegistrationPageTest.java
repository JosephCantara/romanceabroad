import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationPageTest extends BaseUI {

    @Test
    public void testRegistrationPage() {

        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();


    }


}
