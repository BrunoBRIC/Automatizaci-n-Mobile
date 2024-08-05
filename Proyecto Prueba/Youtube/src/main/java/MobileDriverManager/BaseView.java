package MobileDriverManager;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BaseView {
    public BaseView(){
        PageFactory.initElements(new AppiumFieldDecorator(MobileDriverManager.getAppiumDriver(), Duration.ofSeconds(10)),this);
    }
}
