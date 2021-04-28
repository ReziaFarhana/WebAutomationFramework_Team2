package homePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends WebAPI {

    @FindBy(xpath = "//link") public WebElement pageLinks;
    @FindBy(xpath = "//ul[@class='gnav20-dropdown']/li/a") public WebElement dropDownList;
    @FindBy (xpath = "//*[@id=\"vz-gh20\"]/div/div/div/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/a/img")
    public WebElement verizonLogo;

    public void dropDownList(){
        List<WebElement> dropDownList = driver.findElements(By.xpath("//ul[@class='gnav20-dropdown']/li/a"));
        for (WebElement webElement : dropDownList) {
           String data =  webElement.getText();
            System.out.println(data);
        }
    }

    public void findLinkElements(){
        String data = pageLinks.getText();
        System.out.println(data);
        List<WebElement> links = driver.findElements(By.xpath("//link"));
        for (WebElement webElement : links) {
            String linkData = webElement.getText();
            System.out.println(linkData);
        }

    }

    public void verizonLogo(){
        if (verizonLogo.isDisplayed()){
            System.out.println(verizonLogo.getText());
        }
        else{
            System.out.println("Logo is not displayed");
        }

    }

    public void setVerizonLogo(){
        if (verizonLogo.isEnabled()){
            System.out.println("verizon logo is enabled");
            verizonLogo.click();
        }
        else {
            System.out.println("logo button is not enabled");
        }
    }



}
