import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import javax.annotation.OverridingMethodsMustInvokeSuper;

public class FirstScenarioPoM extends Base{

    public FirstScenarioPoM(IOSDriver iosDriver) {
        super(iosDriver);
    }
    //////////////////////////COMMON THINGS FOR FIRST SCENARIO////////////////////////////

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"All invoicing accounts\"]")
    MobileElement dropdownInv;
//    acesabilityid = All invoicing accounts

    /////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////SECOND SCENARIO////////////////////////////////////////////

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"079 000 26 06\"]")
    MobileElement choosePhoneNumForSecondTest;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"6.92\"]")
    MobileElement clickOnRunningCostForSecondTest;

    //class chain ---> **/XCUIElementTypeLink[`label == "Display details for June 2022"`]
    //predicate -----> label == "Display details for June 2022"
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Details of the runnings costs\"]")
    MobileElement detailsOfTheRunningCosts;

    //accessabilityid ---? Details of the runnings costs

    //connections -- ver
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F Telephony to mobile network Swisscom, whole week rate, Start Voice\"]")
    MobileElement telephonyToMobileNetwork;

    //accesId -->  Telephony to mobile network Swisscom, whole week rate, Start Voice

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F SMS national, whole week rate, Start SMS\"]")
    MobileElement smsNational;

    //accessId -->  SMS national, whole week rate, Start SMS

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F MMS national, Start MMS\"]")
    MobileElement mmsNational;

    //accessId -->  MMS national, Start MMS

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet usage, Lifeline Data\"])[1]")
    MobileElement packetUsageLifeline1;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet usage, Lifeline Data\"])[2]")
    MobileElement getPacketUsageLifeline2;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet, 3071\"])[1]")
    MobileElement packet3071;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet, Start Data\"])[1]")
    MobileElement startData;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F SMS, worldwide tariff, Start SMS\"]")
    MobileElement smsWWtarif;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F MMS outgoing abroad, Start MMS\"]")
    MobileElement mmsOutStartMms;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet, 3071\"])[2]")
    MobileElement packet2;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name=\"\uE00F Packet, Start Data\"])[2]")
    MobileElement startData2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"\uE00F MMS incoming abroad, Start MMS\"]")
    MobileElement mmsIncomingStartMms;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"6.92\"])[4]")
    MobileElement total;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Usage details\"]")
    MobileElement usageDetails;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Filter\"]")
    MobileElement filter;

    public void clickOnDropDown(){
        click(dropdownInv);
    }

    public void chooseNumFromDrop(){
        click(choosePhoneNumForSecondTest);
    }

    public void clickOnRunCostForSecondTest(){
        click(clickOnRunningCostForSecondTest);
    }
    public void clickOnUsageDetails(){
        click(usageDetails);
    }

    public void clickOnFilter(){
        click(filter);
    }

//    public void getTextUsage(){
//        getPacketUsageLifeline2.getText();
//    }


}
