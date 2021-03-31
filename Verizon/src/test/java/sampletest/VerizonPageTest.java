package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import sample.VerizonHomePage;

import java.io.IOException;

public class VerizonPageTest extends WebAPI {


    //Test class
    VerizonHomePage verizon;

    @BeforeMethod
    public void getInit() throws IOException {
        verizon = PageFactory.initElements(driver, VerizonHomePage.class);
   }
//
//    @Test@Ignore
//    public void searchBoxTest() throws InterruptedException {
//        verizon.searchBox();
//    }


        @Test
        public void brokenLinkTest()throws IOException {
            verizon.brokenLink();
        }

    @Test
    public void productSectionTest() throws InterruptedException {
        verizon.productSection();
    }


    @Test
    public void planSectionTest() throws InterruptedException {
        verizon.planSection();

    }
    @Test
    public void solutionsSectionTest() throws InterruptedException {
        verizon.solutionsSection();
    }
    @Test
    public void resourcesSectionTest() throws InterruptedException {
        verizon.resourcesSection();
    }

    @Ignore
    @Test
    public void contactUsSectionTest() throws InterruptedException {
        verizon.contactUsSection();
    }

    @Test
    public void clickOnHealthCreTest(){
        verizon.clickOnHealthCareSection();
    }

    @Test
    public void tabletsSectionTest() throws InterruptedException {
        verizon.tabletsSection();
    }
    @Test
    public void storesSectionTest() throws InterruptedException {
        verizon.storesSection();
    }









//
//        //this method to verify I am on Walmart home page
//    @Test
//    public void WalmartSearchBoxTest() {
//        getInit();
//        //verizon.searchBox();
    }











