import io.appium.java_client.FindsByIosNSPredicate;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class SecondScenarioPoM extends Base{


    public SecondScenarioPoM(IOSDriver iosDriver) {
        super(iosDriver);
    }

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Add means of payment\"")
    MobileElement AddPayment;
//    classchain
//    **/XCUIElementTypeLink[`label == "Add means of payment"`]

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSwitch[`value == \"0\"`]")
    MobileElement agreeWith;
//    ios predicate
//            checkInArrow
//    value == "0"

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Next\"`]")
    MobileElement nextBtn;


    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Select means of payment\"")
    MobileElement  clickOnDropDownMenu;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Mastercard\"")
    MobileElement choosePaymentMasterCard;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Visa\"")
    MobileElement choosePaymentVisaCard;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Twint\"")
    MobileElement choosePaymentTwint;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Card no (Mastercard)\"]")
//            (iOSNsPredicate = "label == \"Card no (Mastercard)\" AND name == \"Card no (Mastercard)\" AND value == \"Card no (Mastercard)\"")
//            (iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Card no (Mastercard)\"`]")
            //                  **/XCUIElementTypeStaticText[`label == "Card no (Mastercard)"`]


    MobileElement insertCreditCardNum;
//    ios chain
//        **/XCUIElementTypeStaticText[`label == "Card no (Mastercard)"`]

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Expiry\"]")
//                (tagName = "Expiry")
//            (iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Expiry\"`]")
//            (xpath = "//XCUIElementTypeStaticText[@name=\"Expiry\"]")
//            (iOSNsPredicate = "label == \"Expiry\" AND name == \"Expiry\" AND value == \"Expiry\"")
    MobileElement insertExperyDate;

//    ios chain
//            **/XCUIElementTypeStaticText[`label == "Expiry"`]

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"CVV\"]")
//            (iOSNsPredicate = "label == \"CVV\" AND name == \"CVV\" AND type == \"XCUIElementTypeOther\"")
    MobileElement addCCV;
//    ccv
//    chain
//    **/XCUIElementTypeOther[`label == "CVV"`]

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Continue\"]")
//            (iOSClassChain = "**/XCUIElementTypeButton[`label == \"Next\"`]")
                         //XCUIElementTypeButton[@name="Continue"]
//            (xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
//            (iOSNsPredicate = "label == \"Continue\" AND name == \"Continue\" AND type == \"XCUIElementTypeButton\"")
    MobileElement continueBtn;
//    cnt btn
//    chain
//    **/XCUIElementTypeButton[`label == "Next"`]

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"The new means of payment has been added and you can use it immediately.\"")
    MobileElement verPaymentAdded;

//    new means of payment added verification
//    chain
//    **/XCUIElementTypeStaticText[`label == "The new means of payment has been added and you can use it immediately."`]
    
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Close subpage and back to previous page.\"")
    MobileElement closePage;

    //xpath //XCUIElementTypeButton[@name="Close subpage and back to previous page."]

//    close page
//    chain
//    **/XCUIElementTypeButton[`label == "Close subpage and back to previous page."`]

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"main\"`]/XCUIElementTypeButton[3]")
    MobileElement deleteAddedPaymentPencil;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"I no longer wish to use this means of payment Delete means of payment\"")
    MobileElement clickToDeletePayment;

//    chain
//    **/XCUIElementTypeButton[`label == "I no longer wish to use this means of payment Delete means of payment"`]

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Confirm\"")
    MobileElement ConfirmDeleteCardBtn;
//    confirm deleted btn
//    chain
//    **/XCUIElementTypeButton[`label == "Confirm"`]

    @iOSXCUITFindBy(iOSClassChain = " **/XCUIElementTypeStaticText[`label == \"Your means of payment has been successfully deleted.\"`]")
    MobileElement VerPaymentHasDeleted;
//    successfuly deleted screen
//    predicate
//    label == "Your means of payment has been successfully deleted." AND name == "Your means of payment has been successfully deleted." AND value == "2" AND type == "XCUIElementTypeStaticText"


    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Invalid card number\"")
    MobileElement invalidCreditCardVerification;
//    invalid card number
//            chain
//      **/XCUIElementTypeStaticText[`label == "Invalid card number"`]
//    predicate

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back to previous page.\"]")
    MobileElement arrowBack;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"main\"`]/XCUIElementTypeOther[4]/XCUIElementTypeOther")
//            (xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[9]/XCUIElementTypeOther")
    MobileElement payableBy;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Pay online\"`]")
    MobileElement payOnline;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
    MobileElement payNextBtn;

    @iOSXCUITFindBy(accessibility = "How would you like to pay?")
    MobileElement verAccesability;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back to previous page.\"]")
    MobileElement backToPreviosPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Close subpage and back to previous page.\"]")
    MobileElement closeSubPageAndBackToPrevios;

    public void addPaymentClick(){
        click(AddPayment);
    }
    public void agreeWithTerms(){
        click(agreeWith);
    }
    public void clickNextBtn(){
        click(nextBtn);
    }
    public void clickOnDropDown(){
        click(clickOnDropDownMenu);
    }
    public void chooseCard(){
        click(choosePaymentMasterCard);
    }

    public void addPayment(){
        addPaymentClick();
        clickOnDropDown();
        chooseCard();
        agreeWithTerms();
        clickNextBtn();
    }

    public void insertCardNum(String cardNumber){
        click(insertCreditCardNum);
        sendText(insertCreditCardNum, cardNumber);
    }

    public void insertExpiry(String exp){
        click(insertExperyDate);
        sendText(insertExperyDate, exp);
    }
    public void insertCCV(String ccv){
        click(addCCV);
        sendText(addCCV, ccv);
    }
    public void clickCnt(){
        click(continueBtn);
    }
    public void arrBack(){
        click(arrowBack);
    }

    public void addCreditCardDetails(String cardnumber, String exp, String ccv) throws InterruptedException {
        insertCardNum(cardnumber);
        insertExpiry(exp);
        insertCCV(ccv);
        Thread.sleep(5000);
        TouchAction touchActionLogout = new TouchAction(driver);
        touchActionLogout.tap(PointOption.point(16, 332))
                .perform();
//        clickCnt();
    }

    public void successfullyAddedPayment(){
        getText(verPaymentAdded);
    }

    public void closePage(){
        click(closePage);
    }
    public void getTextFrominvalidCreditCardVerification(){
        getText(invalidCreditCardVerification);
    }

    public void payOnlineMain(){
        click(payOnline);
        click(payNextBtn);
    }
    public void payableByMain(){
        click(payableBy);
//        click(payNextBtn);
    }

    public void closePayOnline(){
        click(backToPreviosPage);
        click(closeSubPageAndBackToPrevios);
    }
    public void backToPreviosPageMain(){
        click(backToPreviosPage);
    }

}
