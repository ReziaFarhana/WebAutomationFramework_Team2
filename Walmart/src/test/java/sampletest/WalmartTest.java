package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sample.WalmartHome;

import java.io.IOException;

public class WalmartTest extends WebAPI {

    //Test class
    WalmartHome walmart;

    @BeforeMethod
    public void getInit() {
        walmart = PageFactory.initElements(driver, WalmartHome.class);
    }

//
//    //this method to verify I am on Walmart home page
//    @Test
//    public void WalmartSearchBoxTest() {
//        walmart.searchBox();
//    }
//

    @Test
    public void brockenlinktest() throws IOException, IOException {

        walmart.brockenlink();

    }

}


//@Test
//public void dummymethod(){

//}




