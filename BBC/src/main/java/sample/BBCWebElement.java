package sample;

import common.WebAPI;
import org.openqa.selenium.By;

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
 public static final String sport="div[id='orb-nav-links'] li[class='orb-nav-sport'] a"; //scc
 public static final String sportText="#u12318086082616708 > div > div > div > div > a.sp-c-global-header__logo";//ccd
 public static final String football="//*[@id=\"sp-nav-secondary\"]/li[1]/a";
 public static final String workLife="div[id='orb-nav-links'] li[class='orb-nav-worklife'] a ";
 public static final String workLifeText="Layer_1";
 public static final String reelLocator="//div[@class='css-1ojkkl5-Logo e14alb5n3']";
 public static final String bbcUrl="https://www.bbc.com";
 public static final String more1="a[class='istats-notrack']";
 public static final String music1="//div[@class='orb-panel-content b-g-p b-r orb-nav-sec']//a[normalize-space()='Music']";
 public static final String musicText1="//h2[normalize-space()='Music']";
 public static final String more2="//a[normalize-space()='More']";
 public static final String sounds="//*[@id=\"orb-panel-more\"]/div/ul/li[13]/a";
 public static final String soundsText="//body/div[@id='orb-modules']/div[@id='main']/div[1]/div[1]/nav[1]/div[1]/a[1]/*[1]";
 public static final String allSports="//button[@id='sp-nav-all-sport-button']";
 public static final String rugbyUnion="//*[@id=\"sp-nav-flyout\"]/div[1]/ul[2]/li[21]/a";//xpath
 public static final String allTeams="//a[normalize-space()='All Teams']";
 public static final String future="//*[@id=\"orb-nav-links\"]/ul/li[7]/a";
 public static final String bbcFuture = "//*[@id=\"nav-build-bar__links\"]/a[1]/p";
 public static final String news="div[id='orb-nav-links'] li[class='orb-nav-newsdotcom'] a";
 public static final String video="//*[@id=\"orb-modules\"]/header/div[2]/div/div[1]/nav/ul/li[3]/a/span";
 public static final String advertisement="//*[@id=\"bbccom_leaderboard\"]/a";
 public static final String termsOfUse="//a[@href='/usingthebbc/terms/'][normalize-space()='Terms of Use']";
 public static final String usingBBCContent="//*[@id=\"orb-modules\"]/nav[2]/div/div/div[2]/ul/li[3]/a";
 public static final String news1="div[id='orb-nav-links'] li[class='orb-nav-newsdotcom'] a";
 public static final String ukNews="//body[1]/div[7]/header[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]/span[1]";
 public static final String business="//*[@id=\"orb-modules\"]/header/div[2]/div[1]/div[1]/nav/ul/li[7]/a/span[1]";
 public static final String companies="//*[@id=\"orb-modules\"]/header/div[2]/div[2]/div[1]/nav/ul/li[4]/a/span";
 public static final String world="//*[@id=\"orb-modules\"]/header/div[2]/div[1]/div[1]/nav/ul/li[4]/a/span[1]";
 public static final String tech="//*[@id=\"orb-modules\"]/header/div[2]/div[1]/div[1]/nav/ul/li[8]/a/span[1]";
 public static final String science="//*[@id=\"orb-modules\"]/header/div[2]/div[1]/div[1]/nav/ul/li[9]/a/span[1]";
 public static final String latinAmerica="//*[@id=\"orb-modules\"]/header/div[2]/div[2]/div[1]/nav/ul/li[5]/a/span";
 public static final String stories="//body[1]/div[7]/header[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[10]/a[1]/span[1]";
 public static final String coronavirus="//*[@id=\"orb-modules\"]/header/div[2]/div[1]/div[1]/nav/ul/li[2]/a/span[1]";
 public static final String travel1 = "//div[@id='orb-nav-links']//a[.='Travel']";
 public static final String destinations = "//*[@id=\"nav-top\"]/div/ul/li[5]/a/div";
 public static final String destinationsText = "//*[@id=\"page-lining\"]/div[1]/div[1]/div/img";
 public static final String discovery = "body.amp-animate.amp-mode-touch:nth-child(2) div:nth-child(1) div:nth-child(1) a:nth-child(1) amp-img.img_ad.i-amphtml-layout-fixed.i-amphtml-layout-size-defined.i-amphtml-element.i-amphtml-built > img.i-amphtml-fill-content.i-amphtml-replaced-content";
 public static final String food ="//*[@id=\"nav-top\"]/div/ul/li[2]/a/div";
 public static final String asia ="//ul[@class='gs-o-list-ui--top-no-border nw-c-nav__secondary-sections']//span[.='Asia']";
 public static final String europe ="//*[@id=\"orb-modules\"]/header/div[2]/div[2]/div[1]/nav/ul/li[4]/a/span";
 public static final String golfSection ="//*[@id=\"u12318086082616708\"]/div/nav/div[1]/div/ul/li[7]/a";
 public static final String tennisSection ="//*[@id=\"u12318086082616708\"]/div/nav/div[1]/div/ul/li[6]/a";
 public static final String athleticsOption ="li[class='sp-c-sport-navigation__item sp-c-sport-navigation__item--primary-selected'] a[role='menuitem']";
 public static final String cyclingOption ="//*[@id=\"u12318086082616708\"]/div/nav/div[1]/div/ul/li[9]/a";
 public static final String formula1Option ="//*[@id=\"u12318086082616708\"]/div/nav/div[1]/div/ul/li[3]/a";
 public static final String selectCricket ="//*[@id=\"u12318086082616708\"]/div/nav/div[1]/div/ul/li[4]/a";
}
