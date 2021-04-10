package verizonHomepage;



public class WebElement  {


    public static final String supportButton = "//*[@id=\"gnav20-Support-L1\"]";

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
    //Support-->Home-->
    public static final String HomeSupportOverviewTab="//a[@id='gnav20-Support-L3-9' and @class='gnav20-subanchor gnav20-hide-on-mobile']";

    //mobile
    public static final String hoverOverMobile1="//*[@id=\"gnav20-Support-L3-1\"]";
    public static final String hoverOverMobile2="//*[@id=\"gnav20-Support-L3-8\"]";
    public static final String hoverDownloadVerizonAPP= "//*[@id=\"gnav20-Support-L3-8\"]";




}