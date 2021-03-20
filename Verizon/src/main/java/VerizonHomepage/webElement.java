package VerizonHomepage;

import common.WebAPI;

public class webElement<What> extends WebAPI {


    public static final String supportButton = "//button[@class='gnav20-menu-label gnav20-menu-label-button gnav20-haschild gnav20-hide-on-mobile' and text()='Support']";

    public static final String supportOverviewButton = "//*[@id=\"gnav20-Support-L2-1\"]";
    public static final String myVerizonButton = "//button[@aria-label=\"We're here. And we're ready.\"]";
    public static final String signInSubmitButton = "/label[@class='checkbox-inline checkbox-position']";
    public static final String rememberMeCheckBox = "//*[@id=\"login-submit\"]";
    public static final String secretQuestionError = "//*[@id=\"bannererror\"]/text()[1]";
    public static final String expectedTextSecretError = "The information you entered does not match the information we have on file.";
    public static final String actualTextSecretError = "//*[@id=\"bannererror\"]/text()[1]";
    public static final String secretQuestion = "//*[@id=\"IDToken1\"]";
    public static final String secretQuestionAnswer = "don't know";
    public static final String frequentlyAskedQuestionTab = "//*[@id=\"supportTileSection\"]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/a/button";
    public static final String frequebtlyAskedQuestionExpected = "COVID-19 (Coronavirus) FAQs";
    public static final String frequentlyAskedQuestionActual = "//*[@id=\"scrollBarlevel\"]/div/div/div[2]/h1/div";
    // public static final String custServiceHours="//a[@id='itemqid589b5cb0df1c']//span[@class='oneDRd_video_expand_icon']";
}