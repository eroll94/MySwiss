import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    IOSDriver driver;

    public Base(IOSDriver iosDriver){
        PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
        driver = iosDriver;
    }
    public void waitForVisibility(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void clear(MobileElement element){
        waitForVisibility(element);
        element.clear();
    }

    public void click(MobileElement element){
        waitForVisibility(element);
        element.click();
    }

    public void sendText(MobileElement element, String text){
        waitForVisibility(element);
        element.sendKeys(text);
    }

}
