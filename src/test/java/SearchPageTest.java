import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchPageTest extends BaseUI {

    String currentUrlSearch;
    String actualSearchTittle;


    @Test

    public void testSearch() {

        searchPage.searchPage1();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);

        if (driver.findElement(By.xpath("//div[@class='search-form']")).isDisplayed()){
            System.out.println("Ages chart displayed");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*WebElement dropDownListMinAge = driver.findElement(By.xpath("//div[@class='col-xs-5 no-padding-left']//select"));
        getDropDownListByIndex(dropDownListMinAge,index:4);
        WebElement dropDownListMaxAge = driver.findElement(By.xpath("//div[@class='col-xs-5 no-padding-right']//select"));
        getDropDownListByIndex(dropDownListMaxAge,index:52);*/

        Select dropDownListMinAge = new Select (driver.findElement(By.xpath("//div[@class='col-xs-5 no-padding-left']//select")));
        dropDownListMinAge.selectByIndex(3);
        Select dropDownListMaxAge = new Select (driver.findElement(By.xpath("//div[@class='col-xs-5 no-padding-right']//select")));
        dropDownListMaxAge.selectByIndex(39);

        if (driver.findElement(By.xpath("//div[@id='main_users_results']")).isDisplayed()){
            System.out.println("photos chart displayed");
        }

        Select sortByIndex = new Select (driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        sortByIndex.selectByIndex(3);

        Select sortByValue = new Select (driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        sortByValue.selectByValue("views_count");

        Select sortByName = new Select (driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        sortByName.selectByVisibleText("Name");





    }

    @Test

    public void testSearch2() {

        searchPage.searchPage1();

        actualSearchTittle = driver.findElement(Locators.TITTLE_H1).getText();

        Assert.assertEquals(actualSearchTittle, Data.searchPageTitle);

    }


}