package bbcHomePage;

import common.WebAPI;
import org.openqa.selenium.By;

public class AboutUs extends WebAPI {

    public void travelPage() throws InterruptedException {
        //click on Travel
        driver.findElement(By.linkText("Travel")).click();

        sleepFor(1);

    }



    public void aboutUs() throws InterruptedException {
        travelPage();
        clickByXpath("//div[@id='orb-modules']//li[7]");
        navigateBack();
    }
    public void series() throws InterruptedException {

        travelPage();
        clickByXpath("//a[@href='/travel/columns/']//div[@class='line1']");

    }

    public void seriesAdventure() throws InterruptedException {

        series();
        clickByXpath("//h3[@class='promo-unit-title' and text()='Adventure & Experience']");
    }

    public void seriesBBCTravel2019() throws InterruptedException {

        series();
        clickByXpath("//h3[@class='promo-unit-title' and text()='Best of BBC Travel - 2019']");
        //animal resistent to cancer -Mexico
        clickByXpath("//h3[@class='promo-unit-title' and text()='The animal resistant to cancer']");


    }

    public void experiences() throws InterruptedException {

        seriesBBCTravel2019();
        clickByLinkText("Experiences");
        //goBackToHomeWindow();
    }




}