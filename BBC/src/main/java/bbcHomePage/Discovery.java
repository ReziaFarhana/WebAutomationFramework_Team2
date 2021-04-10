package bbcHomePage;

import common.WebAPI;
import org.openqa.selenium.By;

public class Discovery extends WebAPI {

    public void  destinationsPage() throws InterruptedException {
        //click on Travel
        driver.findElement(By.linkText("Travel")).click();

        sleepFor(1);


    }
    //discoveryPage
    public void discovery() throws InterruptedException {

        destinationsPage();

        clickByCss("div[id='nav-branding-wrapper'] li:nth-child(3) a:nth-child(1)");

    }
    //an article on an animal
    public void animalDiscovery() throws InterruptedException {

        discovery();

        clickByXpath("//h3[normalize-space()=\"Australia's remarkable animal discovery\"]");



    }
    //click on link to vision tours from animal discovery of Australian gliders
    public void visionWalkTours() throws InterruptedException {

        animalDiscovery();
        clickByLinkText("Vision Walks Eco-Tours");
    }

    //A fish's Epic
    public void aFishsEpic() throws InterruptedException {

        discovery();
        clickByXpath("//h3[normalize-space()=\"A fish's epic 300m climb\"]");


    }

    public void partOfEarth() throws InterruptedException {

        discovery();
        clickByXpath("//h3[ text()='A part of the Earth few ever see']");
    }

    public void earthsSoul() throws InterruptedException {

        partOfEarth();
        clickByXpath("//div[@id='story-content']//div[2]//div[1]//span[1]//i[1]");
    }
}
