package pageobjects;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ActionUtilities;
import utilities.ConfigUtilities;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ChooseModemPage extends BasePage {

    public ChooseModemPage(MobileDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    //    ================ REFACTORED SECTION =====================

    @Step("Step: Policy Checkbox")
    public void clickCheckBox() throws IOException {
        log.info("Step: Click Policy Checkbox");
        action.takeSnapShot("User clicked the checkbox");
        action.click("policyCheckbox");
    }

    @Step("Step: Verify if user is in Get Started Page")
    public boolean verifyIfGetStartedPage() throws Exception {
        log.info("Step: Verify if user is in Get Started Page");
        Assert.assertTrue(action.waitForElementToBeVisible("btnGetStarted", ConfigUtilities.Timers.slow));
        action.takeSnapShot("User is in Get Started Page");
        return action.isDisplayed("btnGetStarted");
    }

    @Step("Step: Verify Get Started Pages")
    public void verifyChooseModemOne() throws Exception {
        log.info("Step: Verify Get Started Pages");
        verifyIfGetStartedPage();
        assertEquals(excel.getTestdata("text1"), action.getText("txtGetStartedTitle"));
        action.takeSnapShot(excel.getTestdata("text1"));
        verifyIfGetStartedPage();
        action.click("txtGetStartedTitle");
        action.sendKeys("txtMobileNumber",excel.getTestdata("mobileNumber"));
    }

    //   ================= END OF REFACTORED SECTION =============

    // This object is displayed after entering your nickname

    /*
      TERMS AND AGREEMENT CHECKBOX SECTION
     */
//    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='ph.com.globe.mybusiness:id/cb_kyc_consent_promo_updates']")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement policyCheckbox;
//
//    @Step("Step: Policy Checkbox")
//    public void clickCheckBox() {
//        log.info("Step: Click Policy Checkbox");
//        action.click(policyCheckbox);
//    }

    /*
    This is for Let's Go button in Term Agreement
     */

//    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='ph.com.globe.mybusiness:id/btn_next']")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement letsGoBtn;
//
//    @Step("Step: Policy Let's Go Button")
//    public void clickLetsGoBtn() {
//        log.info("Step: Step: Click Policy Let's Go Button");
//        action.click(letsGoBtn);
//    }

    /*
    This is for Skip link button
     */

//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='ph.com.globe.mybusiness:id/tv_skip']")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement skipBtn;
//
//    @Step("Step: Skip Button in Profile Details")
//    public void clickSkipBtn() {
//        log.info("Step: Click Skip Button in Profile Details");
//        action.click(skipBtn);
//    }

    /*
    This is for Modal Close Button
     */

//    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='ph.com.globe.mybusiness:id/rl_dialog_button_container']")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement closeModalBtn;
//
//    @Step("Step: Close Modal Button")
//    public void clickCloseModalBtn() {
//        log.info("Step: Click Close Modal Button");
//        action.click(closeModalBtn);
//    }

    /*
    This is for the First Modem Selection
     */

//    @AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement modemOneBtn;
//
//    @Step("Step: Modem1 ")
//    public void clickModemOneBtn() {
//        log.info("Step: Click Modem 1");
//        action.click(modemOneBtn);
//    }

    /*
    This is for the Second Modem Selection
     */

//    @AndroidFindBy(xpath = "//android.widget.ImageView)[2]")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement modemTwoBtn;
//
//    @Step("Step: Modem2 ")
//    public void clickModemTwoBtn() {
//        log.info("Step: Click Modem 2");
//        action.click(modemTwoBtn);
//    }

    /*
    This is for the Third Modem Selection
     */

//    @AndroidFindBy(xpath = "//android.widget.ImageView)[3]")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement modemThreeBtn;
//
//    @Step("Step: Modem 3 ")
//    public void clickModemThreeBtn() {
//        log.info("Step: Click Modem 3");
//        action.click(modemThreeBtn);
//    }

    /*
    This is for the Third Modem Selection
     */

//    @AndroidFindBy(xpath = "//android.widget.ImageView)[4]")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement modemFourBtn;
//
//    @Step("Step: Modem 4 ")
//    public void clickModemFourBtn() {
//        log.info("Step: Click Modem 4");
//        action.click(modemFourBtn);
//    }




}