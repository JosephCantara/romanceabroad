import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPage extends BaseUI {

    String currentUrlSearch;
    String actualSearchTittle;


    @Test

    public void testSearch() {
        driver.findElement(Locators.LINK_SEARCH).click();

        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);

    }

    @Test

    public void testSearch2() {
        driver.findElement(Locators.LINK_SEARCH).click();

        actualSearchTittle = driver.findElement(Locators.TITTLE_H1).getText();

        Assert.assertEquals(actualSearchTittle, Data.searchPageTitle);

    }

}