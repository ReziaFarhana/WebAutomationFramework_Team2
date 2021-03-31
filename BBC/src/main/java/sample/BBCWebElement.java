package sample;

import common.WebAPI;

public class BBCWebElement {

 public static final String more = "//a[normalize-space()='More']";
 public static final String music = "//div[@class='orb-panel-content b-g-p b-r orb-nav-sec']//a[normalize-space()='Music']";
 public static final String musicText = "//h2[normalize-space()='Music']";

 public static final String tv = "//div[@class='orb-panel-content b-g-p b-r orb-nav-sec']//a[contains(text(),'TV')]";
 public static final String WordNews = "//a[normalize-space()='BBC World News']";

 public static final String weather = "//div[@class='orb-panel-content b-g-p b-r orb-nav-sec']//a[normalize-space()='Weather']";
 public static final String weatherText = "//body/div[@id='orb-modules']/div[@id='site-container']/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]/*[1]";

 public static final String travel = "//div[@id='orb-nav-links']//a[.='Travel']";
 public static final String culture = "//a[@href='/travel/columns/culture-identity']//div[@class='line1']";
 public static final String cultureAndIdentity = "//img[@title='India (Credit: Credit: Daniele Romeo/Alamy)']";

 public static final String searchBoxLocator = "//input[@id='orb-search-q']";
 public static final String searchButtonLocator = "//button[@id='orb-search-button']";
 public static final String productName = "Coronavirus";
 public static final String sport="//div[@id='orb-nav-links']//a[normalize-space()='Sport']";
 public static final String sportText="a[class='sp-c-global-header__logo']";

}
