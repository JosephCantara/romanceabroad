import org.openqa.selenium.By;

public class Locators {
    //its for media page
    public static final By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    public static final By LINK_HOWWEWORK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINK_TOUR = By.xpath("//a[contains(text(),'TOUR TO UKRAINE')]");
    public static final By LINK_GIFT = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    public static final By LINK_PAYPAL = By.xpath("//a[@href='https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=CNUP836ZN9G36']");
    //this is for search page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    //this is for sign in page
    public static final By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    //this is for registration button
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_USERNAME = By.cssSelector("input#nickname");
    public static final By TEXT_FIELD_PHONE = By.xpath("//input[@name='data[phone]']");
    public static final By CHECKBOX = By.cssSelector("input#confirmation");
    public static final By BEST_SELLER = By.xpath("//div[@class='contrasting-block row g-bestsellers-gallery']");
    public static final By FLOWER_BASKET_OPTION = By.xpath("//div[@class='panel panel-default pg-panel-default']");
    public static final By PAYMENT_OPTION = By.xpath("//a[@class='btn btn-primary btn-block']");




    //....
    public static final By LINK_EEUWOMAN = By.xpath("//a[@href='/content/view/eastern-european-women']");
    public static final By LINK_BUTTON_SIGN_IN = By.xpath("///button[@name='logbtn']");
    // TITLE
    public static final By TITTLE_H1 = By.xpath("//h1[@class='title']");
    public static final By TITTLE_H2_MAIN_PAGE = By.xpath("//h2[contains(text(),'LOVE starts here')]");
    public static final By TITTLE_H3_TOUR_PAGE = By.xpath("//h1[@class='title']");
    public static final By TITTLE_H3_EEWOMAN_PAGE = By.xpath("//h1[contains(text(),'Eastern European Girls')]");




}
