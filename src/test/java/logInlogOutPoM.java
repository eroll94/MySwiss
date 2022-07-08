import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class logInlogOutPoM extends TestBase {
    LoginPoM loginPoM;
    LogoutPoM logoutPoM;
    @Test
    public void iOSTest() throws MalformedURLException, InterruptedException {
        iOSsetup();
        System.out.println("Started app");
        loginPoM = new LoginPoM(driver);
        logoutPoM = new LogoutPoM(driver);

        loginPoM.logIn("ccqgseo56.48", "Tester@123");
        logoutPoM.logOutMain();
    }
}
