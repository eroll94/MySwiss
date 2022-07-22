import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FirstScenario extends TestBase {

    SecondScenarioPoM secondScenarioPoM;
    LoginPoM loginPoM;
    LogoutPoM logoutPoM;
    NavButtonsPoM navButtonsPoM;

    FirstScenarioPoM firstScenarioPoM;

    @Test
    public void tc1() throws MalformedURLException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        firstScenarioPoM = new FirstScenarioPoM(driver);
        //login and payment
        loginPoM.logIn("tfmaogqevw@jcxkkvp.com", "SixTest@12");
        navButtonsPoM.billsBtnClick();
    }
    @Test
    public void tc2() throws MalformedURLException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        firstScenarioPoM = new FirstScenarioPoM(driver);
        //login and payment
//        loginPoM.logIn("adriandezember.blgtests1", "Tester@1234");
//
//        navButtonsPoM.billsBtnClick();
//        firstScenarioPoM.clickOnDropDown();
//        firstScenarioPoM.chooseNumFromDrop();
//        firstScenarioPoM.clickOnRunCostForSecondTest();
        Assert.assertEquals("\uE00F Telephony to mobile network Swisscom, whole week rate, Start Voice", firstScenarioPoM.telephonyToMobileNetwork.getText(), "failed");
        Assert.assertEquals("x", firstScenarioPoM.smsNational.getText(), "failed");
        Assert.assertEquals("x", firstScenarioPoM.mmsNational.getText(), "failed");
        Assert.assertEquals("x", firstScenarioPoM.packetUsageLifeline1.getText(), "failed");
        Assert.assertEquals("x", firstScenarioPoM.getPacketUsageLifeline2.getText(), "failed");
        Assert.assertEquals("x", firstScenarioPoM.packet3071.getText(), "failed");
        Assert.assertEquals("x", firstScenarioPoM.startData.getText(), "failed");
        Assert.assertEquals("x", firstScenarioPoM.smsWWtarif.getText(), "failed");
        Assert.assertEquals("x", firstScenarioPoM.mmsOutStartMms.getText(), "failed");
        Assert.assertEquals("x", firstScenarioPoM.startData2.getText(), "failed");
        Assert.assertEquals("x", firstScenarioPoM.mmsIncomingStartMms.getText(), "failed");
        Assert.assertEquals("6.92", firstScenarioPoM.total.getText(), "failed");
        Assert.assertEquals("", firstScenarioPoM.telephonyToMobileNetwork.getText(), "failed");
        Assert.assertEquals("", firstScenarioPoM.telephonyToMobileNetwork.getText(), "failed");
        Assert.assertEquals("", firstScenarioPoM.telephonyToMobileNetwork.getText(), "failed");

//        firstScenarioPoM.clickOnUsageDetails(); - allow later

//        firstScenarioPoM.clickOnFilter(); -- nok



    }
    @Test
    public void tc3() throws MalformedURLException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        //login and payment
        loginPoM.logIn("rfshscye.ftcbhyxviv", "SixTest@12");

    }
    @Test
    public void tc4() throws MalformedURLException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
        //login and payment
        loginPoM.logIn("vlrhpos", "SixTest@1");

    }




}
