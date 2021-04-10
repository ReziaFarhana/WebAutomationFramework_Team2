package geicoHomePage;

import common.WebAPI;
import org.openqa.selenium.By;

public class WebElement extends WebAPI {




  public static final String myPolicybuttonXpath="//label[@for='policy']";
  public static final String claimsButtonXpath="//label[@class='radio' and @for='claims']";

 public static final String quotesButtonXpath="//label[@class='radio' and @for='quotes']";
   public static final String paymentsButtonXpath="//label[@class='radio' and @for='payments']";
   public static final String rdSideAssistButtonXpath="//label[@class='radio' and @for='roadside_assistance']";
   public static final String somethingElseButtonXpath="//label[@class='radio' and @for='something_else']";
   public static final String continueButton="btn_continue";
   public static final String updatePolicyButton="//label[@class='radio' and @for='update_policy']";
   public static final String policyTopicContinue="//span[@id='btn_continue' and @class='btn btn--primary btn--full-mobile pull-right' and  text()='Continue']";
    public static final String updateVehicleButton= "//label[@class='radio' and @for='update_vehicle']";
  public static final String policyUpdateContinue="//span[@id='btn_continue' and @class='btn btn--primary btn--full-mobile pull-right' and text()='Continue']";

public static final String insurance="//a[text()='Insurance']";
public static final String propertyInsurance="(//span[text()='Property Insurance'])[1]";
public static final String businessOwner="(//span[text()='Business Owners'])[1]";
public static final String businessOwnerTitle="Business Owners Policy - Get a BOP Insurance Quote | GEICO";
public static final String ownerFirstName="(//input[@id='ContentPlaceHolder1_txtFirstName'])[1]";
public static final String ownerLastName="(//input[@id='ContentPlaceHolder1_txtLastName'])[1]";
public static final String ownerEmail="(//input[@id='ContentPlaceHolder1_txtMailingAddress'])[1]";
public static final String aptNumber="(//input[@id='ContentPlaceHolder1_txtApartment'])[1]";
public static final String cityName="(//input[@id='ContentPlaceHolder1_txtCity'])[1]";
public static final String stateDD="(//select[@id='ContentPlaceHolder1_ddlStateData'])[1]";
public static final String policyholderYESradioButton="(//label[@class='radio'][text()='Yes'])[2]";
public static final String businessOwnershipTypeDD="//select[@id='ContentPlaceHolder1_ddlBusinessType']";
public static final String businessName="//input[@id='ContentPlaceHolder1_txtCompanyName']";






}
