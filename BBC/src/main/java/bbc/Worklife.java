package bbc;

import common.WebAPI;
import org.openqa.selenium.By;

import java.util.List;

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

    public void worklifeReadMore(){
        worklifeTab();
        clickByXpath(readMore);
    }

    public void termsOfUsePage(){
        windowsFullPageScrollDown();
        clickByXpath(termsOfUseLocator);
        windowHalfPageScroll();
        clickByXpath(accessingBBC);
        navigateBack();
        clickByXpath(joiningIn);
    }

    public void fullVersionOfBBCTermsOfUse(){
        windowTwoThirdPageScroll();
        clickByXpath(fullVersionOfRules);
        clickByXpath(downloadRulesAsPDF);
    }

    public void BBCAccessibilityHelpPage(){
        windowsFullPageScrollDown();
        clickByXpath(bbcAccessibility);
        clickByXpath(fAQS);
    }

    public void accessibilityIPlayerPage(){
        BBCAccessibilityHelpPage();
        typeByIdNEnter(searchBox,searchText);
    }

    public void searchResultsPage(){
        BBCAccessibilityHelpPage();
        clickByXpath(troubleShoot);
    }




}
