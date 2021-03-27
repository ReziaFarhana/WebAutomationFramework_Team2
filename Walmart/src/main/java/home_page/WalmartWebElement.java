package home_page;


public class WalmartWebElement {


    public static final String walmartPlusLink= "//a[normalize-space()='Walmart+']";
    public static final String benefitsLink= "//a[contains(text(),'Benefits')]";
    public static final String allBenefitsOption="//span[normalize-space()='All benefits']";
    public static final String freeShippingInAllBenefits="div.BenefitsCard__Content-e2bsc1-2.gViDPY:nth-child(3) > h3";
    public static final String mobileScanAndGo="div.HeaderLink__DropdownLinkHolder-sc-12dkz73-3.iKbWdP:nth-child(5) > a.HeaderLink__MobileSubLink-sc-12dkz73-2.kkLRyt:nth-child(1) > span";

    public static final String groceryPickupAndDelivery="//a[@class='j_a hf-footer-link j_c'][normalize-space()='Grocery Pickup & Delivery']";

    public static final String MoneyCenter="MoneyCenter"; // link text
    public static final String hamburgerMenuInMoneyCenter ="button[id='header-Header-sparkButton'] span[class='g_b']";
    public static final String walmartCreditCardInhamburgerMenuInMoneyCenter ="div[class='b_a p_a p_az p_o p_f bw_c b_f'] a[title='Walmart Credit Card'] div[class='x_a x_i']";
    public static final String menuButtonInMoneyCenter="li[class='MainNavButton expander']";
    public static final String billPayInmenuButtonInMoneyCenter="li[class='MainNavButton expander active'] a:nth-child(1)";
    public static final String giftCardLink="li:nth-child(3) h2:nth-child(1) a:nth-child(1)";
    public static final String e_GiftCard="div[class='CategoryApp-topModules CategoryApp-topModules--no-top-padding'] li:nth-child(5)";
    public static final String walmartEGiftCard="//a[normalize-space()='Walmart gift cards']";

    public static final String giftCheckBox="#Gift-eligible-0-Gifting";
    public static final String occasionGraduation="#Congratulations-4-occasion";
    public static final String giftCardBrand="input[id*='Walmart-0-brand']";
    public static final String priceInGifrCard="input[id*='$0---$500-0-price']";
    public static final String sortByTopBrands="//button[normalize-space()='Top Brands']";
    public static final String sellecrSamsclaubAsBrand="//*[@id=\"search-util-bar-brand-1\"]";
    public static final String toVerifySamsClub="//button[.=\"Sam's Club\"]";
    public static final String clickToUnfreez="//*[@id=\"global-search-input\"]";

        // looking for texts or title for verification or validation of the page

    public static final String walmartPlusText="div[class='Hero__HeroWrapper-ouvz7s-0 tBboS'] span:nth-child(1)";
    public static final String allBenefitsText="//h1[normalize-space()='Explore all benefits']";
    public static final String freeShippingText="//h1[normalize-space()='Free shipping, no order minimum']";
    public static final String mobileScanAndGoText="//h1[normalize-space()='Mobile scan & go']";
    public static final String groceryPickupAndDeliveryText="span[class='styles__rebrandingGroceryText___2gE10']";
    public static final String billPayText="h1[class='Title-heading font-normal']";
    public static final String shopWalmartGiftCare="div[class='EditorialPanels-main-title text-center l-margin-top']";
    public static final String e_GiftCardText="h1[class='breadcrumb-leaf heading-a']";
    public static final String itemSelectedDisplayed="button[class*='item' ]";


    public static final String walmartPay = "//a[normalize-space()='Walmart Pay']";
    public static final String verifyWalmartPay = "div[class='Title']";
    public static final String walmartWeeklyAd = "//a[contains(text(),'Weekly Ad')]";
    public static final String verifyWalmartWeeklyAd = "//span[@class='breadcrumb-tab']";
    public static final String findAnotherWalmartStore = "//button[.='Find another store']";
    public static final String otherServicesOfWalmartFootPage = "//a[.='Other Services']";
    public static final String walmartHomeServices = "//li[3]//div[1]//button[1]";
    public static final String linkForHomeServices = "//a[@data-uid='OOzfrg_2']";
    public static final String filterByCustomerRating = "4---5-Stars-0-customer_rating";
    public static final String verify4AndUpSelected = "//button[normalize-space()='4 stars & up']";
    public static final String priceSelection = "//span[text()='Price']";
    public static final String enterMininumPrice = "input[placeholder='Min']";
    public static final String minimumPriceEntered = "//button[normalize-space()='$120+']";
    public static final String maximumPriceEntered = "//input[@placeholder='Max']";
    public static final String verifyMaxAndMinPrice = "//button[normalize-space()='$120 - $320']";
    public static final String usingSearchOption = "//input[@placeholder='Search my store']";
    public static final String footerGroceryAndPickUP = "//a[@data-section-title='Footer - Grocery Pickup & Delivery']";
    public static final String verifyProductSelection = "//span[.='Tomato']";
    public static final String addItemToCart = "//button[@aria-label='Add to cart Beefsteak Slicing Tomatoes, each']";
    public static final String verifySelectedItemAddedToCart = "div[data-automation-id='numberOfItems']";
    public static final String increasingItemCountInCart = "button[value='1']";
    public static final String increasingItemByOneCountInCart = "button[aria-label='add 1 item']";
//    public static final String walmartPay = "//li[.='Walmart Pay']";


}
