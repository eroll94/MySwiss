import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;

public class LogoutPoM extends Base{


    public LogoutPoM(IOSDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"navigation\"])[1]/XCUIElementTypeOther/XCUIElementTypeButton")
    MobileElement navigationBtn;
    //(iOSClassChain = "**/XCUIElementTypeOther[`label == \"navigation\"`][1]/XCUIElementTypeOther/XCUIElementTypeButton")


    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Log out\"`]")
    MobileElement logOutBtn;

    public void clickOnNav(){
        click(navigationBtn);
    }

    public void logOut(){
        click(logOutBtn);
//        Thread.sleep(1500);

    }

    public void logOutMain() throws InterruptedException {
        clickOnNav();
//        logOut();
        Thread.sleep(3000);
        WebElement logoutBtn = driver.findElementByIosClassChain("**/XCUIElementTypeButton[`label == \"Log out\"`]");
        logoutBtn.click();
        Thread.sleep(1000);
        TouchAction touchActionLogout = new TouchAction(driver);
        touchActionLogout.tap(PointOption.point(12, 698))
                .perform();
    }
}
