package com.testWalmart;

import com.walmart.CareerPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCareerPage extends WebAPI {
    CareerPage careerPage;
    @BeforeMethod
    private void pageFactorySetup(){
        careerPage= PageFactory.initElements(driver, CareerPage.class);
    }

    @Test(enabled = true)
    private void validateInsuranceBtn(){
        careerPage.checkIfInsuranceBtnIsClickable();
    }
    @Test(enabled = true)
    private void validateBusinessInsuranceBtnInEnabled(){
        careerPage.checkBusinessInsuranceBtnIsEnabled();
    }

    @Test(enabled = true)
    private void validateCustomerIsAbleToNavigateToGeneralLiabilityPage() throws InterruptedException {
        careerPage.verifyIfCustomerIsAbleToNavigateToGeneralLiabilityPage();
    }
    @Test
    private void validateBusinessInsuranceCalculator(){
        careerPage.verifyBusinessInsuranceCalculator();
    }
    @Test
    private void validateAllProductTypesLinkIsEnabledAndDisplayed(){
        careerPage.verifyLinkForAllBusinessProduct();
    }

    @Test
    private void validateAllProductTypesLinkIsClickalbe(){
        careerPage.verifyLinkForAllBusinessProductIsClickable();
    }

    @Test(enabled = true)
    private void validateCustomerIsAbleToNavigateToProfessionalLiabilityPage() throws InterruptedException {
        careerPage.verifyIfCustomerIsAbleToNavigateToProfessionalLiabilityPage();
    }

    @Test(enabled = true)
    private void validateCustomerIsAbleToNavigateToCyberLiabilityPage() throws InterruptedException {
        careerPage.verifyIfCustomerIsAbleToNavigateToCyberLiabilityPage();
    }

    @Test(enabled = true)
    private void validateCustomerIsAbleToNavigateToWorkerCompensationPage() throws InterruptedException {
        careerPage.verifyIfCustomerIsAbleToNavigateToWorkerCompensationPage();
    }

    @Test(enabled = true)
    private void validateCustomerIsAbleToNavigateToMedicalMalpracticePage() throws InterruptedException {
        careerPage.verifyIfCustomerIsAbleToNavigateToMedicalMalpracticePage();
    }

    @Test
    private void validateMedicalMalpracticeText() throws InterruptedException {
        careerPage.verifyMedicalMalpracticeText();
    }

    @Test(enabled = true)
    private void validateCustomerIsAbleToNavigateToCommercialAutoPage() throws InterruptedException {
        careerPage.verifyIfCustomerIsAbleToNavigateToCommercialAutoPage();
    }
    @Test(enabled = true)
    private void validateCustomerIsAbleToNavigateToRidesharePage() throws InterruptedException {
        careerPage.verifyIfCustomerIsAbleToNavigateToRidesharePage();
    }

}
