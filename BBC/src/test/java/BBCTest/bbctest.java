package BBCTest;


import Travel.destinations;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Travel.*;
public class
bbctest extends WebAPI {

    destinations explore;
    @BeforeMethod
    public void getinit() throws InterruptedException {
        explore= PageFactory.initElements(driver, destinations.class);



    String bbcUrl = "https://www.bbc.com/";
        this.driver.get(bbcUrl);
        sleepFor(1);
    }
    @Test//1
    public void destinationsPageTest() throws InterruptedException {

    explore.destinationsPage();


    }
@Test//2
public void australiaAndPacific() throws InterruptedException {

        explore.australiaAndPacific();

}






    }






