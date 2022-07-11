import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SecondScenario extends TestBase{

    SecondScenarioPoM secondScenarioPoM;
    LoginPoM loginPoM;
    LogoutPoM logoutPoM;
    NavButtonsPoM navButtonsPoM;

    @Test
    public void addPayment() throws MalformedURLException, InterruptedException {
        //init everything
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);
        navButtonsPoM = new NavButtonsPoM(driver);
        secondScenarioPoM = new SecondScenarioPoM(driver);
//        //login and payment
        loginPoM.logIn("kwxhsixp@wkgtcoq.ch", "SixTest@12");
        logoutPoM.clickOnNav();
//       proveri klik na  dropdown
        secondScenarioPoM.addPayment();
        secondScenarioPoM.addCreditCardDetails("5200000000000007","06/25","123");

        //logout
        navButtonsPoM.panoramaBtnClick();
        logoutPoM.logOutMain();



    }

}
