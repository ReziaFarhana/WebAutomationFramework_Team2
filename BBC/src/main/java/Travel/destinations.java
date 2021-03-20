package Travel;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;


public class destinations extends WebAPI {

    public void adBlocker(){

        System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
        ChromeOptions options  = new ChromeOptions();
        //options.addArguments("incognito");
        options.addArguments("--disable-popup-blocking");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
    }

    public void  destinationsPage() throws InterruptedException {
        //click on Travel
        driver.findElement(By.linkText("Travel")).click();

        sleepFor(1);
        //click on destinations
        driver.findElement(By.xpath("//*[@id=\"nav-top\"]/div/ul/li[5]/a/div")).click();
        //scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");

    }

    public void australiaAndPacific() throws InterruptedException {

        destinationsPage();
        //isPopUpWindowDisplayed(driver,"iframe id=\"frame_619c7a20893c11eb9a4047e9812c91d7_0_0\" src=\"https://creative-p.undertone.com/2075/68375-1576767966/m67-0.html\"");


        //click on
                driver.findElement((By.xpath("//*[text()='Future of Travel'] ")));
                sleepFor(3);

    }
    public void australiaFood() throws InterruptedException {

        destinationsPage();
        clickByXpath("//*[text()='The baking traditions making a comeback'] ");


    }



    public static void scrollDown(int height) {

        //scrolling method
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,height)");
    }
}