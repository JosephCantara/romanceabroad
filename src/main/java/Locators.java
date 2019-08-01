import org.openqa.selenium.By;

public class Locators {
    //its for media page
    public static final By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']";
    //this is for search page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']";
    //this is for sign in page
    public static final By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    //this is for registration button
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_USERNAME = By.cssSelector("input#nickname");
    public static final By TEXT_FIELD_PHONE = By.xpath("//input[@name='data[phone]']");
    public static final By CHECKBOX = By.ByCssSelector("input#confirmation");


}
