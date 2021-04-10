package verizonTest;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.xml.dom.ParentSetter;
import verizonHomepage.*;


public class SupportTest extends WebAPI {


       Support customerService;

       @BeforeMethod
       public void getInit() throws InterruptedException {
           customerService =PageFactory.initElements(driver, Support.class);
           String verizonUrl = "https://www.verizon.com/";
           driver.get(verizonUrl);
           sleepFor(1);

       }


       public void result(String expected,String actual){
        String expectedText =expected;
        String actualText = getTextByXpath(actual);
        Assert.assertEquals(actualText,expectedText,"Test Did Not Match");
    }


    @Test //1
    public void supportButtonTest() throws InterruptedException {

        customerService.supportButtonHover();
        result("Sign in","//a[@id='gnav20-Support-L2-5']");
       }
    //----------------------OVERVIEW-----------------
    @Test//2
    public void supportOverviewTest() throws InterruptedException {

        customerService.supportOverview();
        String expectedText = "Verizon Support";
        String actualText= getTextByXpath("//h1[text()='Verizon Support']");
        Assert.assertEquals(actualText,expectedText,"Text does not match");
    }
    //Support Overview-->verizonSupport-->secretQuestion
    @Test//7
    public void supportOverviewVerizonSupportTest() throws InterruptedException {

        customerService.supportOverviewVerizonSupport();
        String expectedText="Secret Question";
        String actualText=getTextByXpath("//*[@id=\"challengequestion\"]/div[1]/h3");
        Assert.assertEquals(actualText,expectedText,"Text Did not match");
    }

    @Test//8
    public void supportoverviewFindStoretest() throws InterruptedException {
        customerService.supportoverviewFindStore();
        String expectedText="Store search results";
        String actualText="//h1[text()='Store search results']";

    }
    @Test//4
    public void frequentlyAskedQuestions() throws InterruptedException {

        customerService.frequentlyAskedQuestions();
        result("Chat with us","//*[@id=\"app\"]/main/div/div/div[1]/div[1]/h2");

    }
    @Test//6
    public void troubleShootTest() throws InterruptedException {

        customerService.troubleShooting();
        String expectedText ="Routers";
        String actualText = getTextByXpath("//h2[normalize-space()='Routers']");
        Assert.assertEquals(actualText,expectedText,"Test Did Not Match");
    }

    //-----------------------MOBILE---------------------------------------

    //mobile tab with hover over
    @Test//3
    public void mobileHoverOverElementTest() throws InterruptedException {

        customerService.mobileHoverOverElement();
//        String expectedText= "Mobile";
//        String actualTest = "//div[@class='gnav20-submenu-column gnav20-L2 gnav20-featured-card-top-label gnav20-column-highlight']";
//        Assert.assertEquals(actualTest,expectedText,"Text Didn't Match");
   }
   @Test//4
   public void billingFilterTopicsTest() throws InterruptedException {
           customerService.billingFilterTopics();
           String expectedText="Check Your Bill";
           String actualText=getTextByXpath("//h2[normalize-space()='Check Your Bill']");
           Assert.assertEquals(actualText,expectedText,"Text doesn't match");


   }
    //  @Test//5
    public void deviceTest() throws InterruptedException {

        customerService.device();
        result("Apple iPhone 12 mini","//*[@id=\"dev14240059\"]/p");

    }
    @Test//7
    public void phoneUpgradeTest() throws InterruptedException {

        customerService.phoneUpgrades();
        // result();
    }
    @Test//8
    public void deviceSupport() throws InterruptedException {

        customerService.deviceSupport();
        String expectedText ="5G Smartphone";
        String actualText = getTextByXpath("//*[@id=\"brands-heading\"]");
        Assert.assertEquals(actualText,expectedText,"Test Did Not Match");
    }
    @Test//10
    public void visaBillTest() throws InterruptedException {


        customerService.visaBill();

        String expectedText ="Verizon Visa® Card FAQs – earn Verizon Dollars and get Verizon Up Rewards";
        String actualText = getTextByXpath("//div[@class='cmp-title']");
        Assert.assertEquals(actualText,expectedText,"Test Did Not Match");

    }

//-----------------HOME----------------

    //support-->Home-->hover
    @Test//5
    public void homeTabTest() throws InterruptedException {

           customerService.homeTab();
           String expectedText="LTE Home Internet";
           String actualText=getTextByXpath("//*[@id=\"gnav20-Support-L3-12\"]");
           Assert.assertEquals(actualText,expectedText,"Text Did not Match");

    }
    public void fiosInternetAndTVTest(){


    }
//---------------CONTACT US----------------

    //Support-->Contact Us Link
    @Test//6
    public void contactUsLink(){

           customerService.contactUsLink();
           String expectedText="Contact us" ;
           String actualText=getTextByXpath("//h1[text()='Contact us']");
           Assert.assertEquals(actualText,expectedText,"The Text doesn't match");
    }
    @Test
    public void contactUsChatBox() throws InterruptedException {

        customerService.contactUsChatBox();
        String expectedText="Chat with us";
        String actualText=getTextByXpath("//*[@id=\"app\"]/main/div/div/div[1]/div[1]/h2");
        Assert.assertEquals(actualText,expectedText,"Text does not match");
    }
    //--------------------SIGN IN------------------------------------------

    @Test//7
    public void signInTest(){
           customerService.signIn();
           String expectedText="Sign in" ;
           String actualText="//h1[text()='Sign in']";
    }

    @Test//8
    public void signInUsernameAndPasswordTest(){
           customerService.signInUsernameAndPassword();
           String expectedText="Secret Question";
           String actualText=getTextByXpath("//h3[text()='Secret Question']");
           Assert.assertEquals(actualText,expectedText,"Text doesn't match");

    }



























}
