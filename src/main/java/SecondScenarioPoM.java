import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
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

    public void addCreditCardDetails(String cardnumber, String exp, String ccv){
        insertCardNum(cardnumber);
        insertExpiry(exp);
        insertCCV(ccv);
//        clickCnt();
    }

    public void successfullyAddedPayment(){
        getText(verPaymentAdded);
    }


}
