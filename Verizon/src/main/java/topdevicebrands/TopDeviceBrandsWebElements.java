package topdevicebrands;

public class TopDeviceBrandsWebElements {

    //public static final String topAccessoryBrandsList = "div[class='gnav20-footer-level-one'] div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(2) ul:nth-child(1)";
    //public static final String topAccessoryBrandsList = "div[class='gnav20-footer-level-one'] div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(2)";
    //public static final String topAccessoryBrandsList = "div[class='gnav20-footer-level-one'] div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(2) ul:nth-child(1) li:nth-child(1)";
    public static final String topAccessoryBrandsList = "//*[@class='gnav20-footer-list']";
    public static final String samsungLocator = "Samsung";
    //public static final String buyButton = "//a[@aria-label='Pre-order Samsung Galaxy S21+ 5g']";
    public static final String saveOnTheLatestButton ="//body/div/div/main[contains(@role,'main')]/div/div/section/div/div/div[contains(@aria-label,'carousel with 4 slides')]/div/div/div[contains(@aria-label,'Slide 1 of 4')]/div/div/div/div/a[1]";
    public static final String addFilterButton = "//button[normalize-space()='Add filters']";
    public static final String brandButton = "//button[normalize-space()='Brand']"; //xpath
    public static final String brandOption = "label[for='Brand0']"; //css
    public static final String colorButton = "//button[normalize-space()='Color']"; //xpath
    public static final String colorOption = "label[for='d_Color3']"; //css
    public static final String closeFilterButton = "//button[normalize-space()='Close filter']";
    public static final String pricingDropdown = "paymentOptions"; //id
    public static final String paymentOption = "//option[@value='.two-year-price']"; //xpath
    public static final String sortByDropdown = "sortOptions"; //id
    public static final String sortByOptions = "//option[@value='Featured']"; //css
    public static final String hoverFirstItemImage = "//body/div[@role='main']/div/div[@aria-labelledby='devices-content']/div[@class='devices-container positionRelative border_topGray']/div[@class='infinite-scroll-component__outerdiv']/div[@class='infinite-scroll-component gw-products-list']/div[1]/div[1]";
    public static final String firstItemAddToCompareButton = "//button[@title='Samsung Galaxy S21 5G']";
    public static final String hoverSecondItemImage = "//*[@data-track='{\"type\":\"panel\",\"name\":\"panel click\",\"title\":\"Samsung Galaxy S21+ 5G\",\"position\":\"2\"}']";
    public static final String secondItemAddToCompareButton = "//button[@title='Samsung Galaxy S21+ 5G']";
    public static final String compareButton = "//a[normalize-space()='Compare']";
    public static final String quickViewButton ="div[class='infinite-scroll-component gw-products-list'] div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(3) button:nth-child(2)";
    public static final String closeButton = "//button[@title='devices comparison']";
    public static final String appleLocator = "Apple";
    public static final String buyButton = "//a[@aria-label='Buy iPhone 12 Pro Max']";
    public static final String monthFinance = "body > div:nth-child(34) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > button:nth-child(1)";
    public static final String termFinance = "//body/div[@data-event='load']/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[@role='radiogroup']/div[2]";
    public static final String reviewsLocator = "//*[@id=\"page\"]/div/div[5]/div[1]/div/div[1]/div/div[1]/div/div[1]/div[3]/div[1]/a/span/div[1]";
    public static final String sortByRatingOptionDropdown = "//select[@role='combobox']";
    public static final String reviewsType = "//option[normalize-space()='Most helpful']";
    public static final String compareTab = "//a[normalize-space()='Compare']";
    public static final String compareOptions = "//a[contains(@href,'/wireless-devices/tablets/ipad-compare/')]";
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String

    //test class webelements

    //public static final String buyPageVerify = "//h1[normalize-space()='Shop Samsung Galaxy S21 Series Phones']";
    public static final String saveOnSamsungPageHeader = "//h1[normalize-space()='Save on Samsung Galaxy Phones | Shop Today']";
    public static final String brandOptionDisplayed = "//div[normalize-space()='Samsung']";
    public static final String colorOptionDisplayed = "//div[normalize-space()='Purple']";
    public static final String comparePage = "//h1[normalize-space()='Compare Phones & Devices']";
    public static final String quickViewText = "//span[normalize-space()='Galaxy S21 5G']";
    public static final String firstItemCompareText = "//strong[normalize-space()='Not available with 2-Year Contract']";
    public static final String getMoreLocator = "section[id='get-more']";
    public static final String reviews = "//span[normalize-space()='Reviews']";
    public static final String phoneTitle = "//span[contains(text(),'Apple iPhone 12 Pro Max')]";
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String
    //public static final String

}
