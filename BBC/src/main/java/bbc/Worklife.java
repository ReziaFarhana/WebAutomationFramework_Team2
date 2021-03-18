package bbc;

import common.WebAPI;
import org.openqa.selenium.By;

import static bbc.bbcWebelements.*;

public class Worklife extends WebAPI {

    public void worklifeTab(){
        clickByXpath(workLifeLocator);
    }

    public void whatIsWorklifeTab(){
        worklifeTab();
        clickByXpath(whatIsWorkLife);
    }

    public void howWeWorkTab(){
        worklifeTab();
        clickByXpath(howWEWork);
    }

    public void howWeLiveTab(){
        worklifeTab();
        clickByXpath(howWeLive);
    }

    public void howWeThinkTab(){
        worklifeTab();
        clickByXpath(hamburgerMenu);
        clickByXpath(howWeThink);
    }

    public void equalityMattersTab(){
        worklifeTab();
        clickByXpath(equalityMatters);
    }

    public void remoteControlTab(){
        worklifeTab();
        clickByXpath(remoteControl);
    }

    public void workLifeReadMore(){
        worklifeTab();
        clickByXpath(readMore);
    }

    public void termsOfUse(){
        windowsFullPageScrollDown();
        clickByXpath(termsOfUseLocator);
    }

    public void click(){
        clickByXpath(registrationIcon);
        clickByXpath(registerNowLink);
        waitUntilClickAble(By.xpath("//a[@data-bbc-result='/register/details/age']"));

        clickByXpath("//a[@data-bbc-result='/register/details/age']");
    }



}
