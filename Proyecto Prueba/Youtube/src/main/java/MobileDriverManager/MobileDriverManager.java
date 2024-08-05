package MobileDriverManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MobileDriverManager {

    private  static AppiumDriver<MobileElement> appiumDriver;

    public  static  void createAppiumDriver() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Motorla");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID,"ZY22HGWSGP");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
        desiredCapabilities.setCapability("appActivity","com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
        desiredCapabilities.setCapability("appPackage","com.google.android.youtube");
    //    desiredCapabilities.setCapability("appActivity","com.spotify.music.MainActivity");
     //   desiredCapabilities.setCapability("appPackage","com.spotify.music");
        Logger.getGlobal().log(Level.INFO,"Capabilities---> {0} ",desiredCapabilities);
        appiumDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);

        appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Logger.getGlobal().log(Level.INFO,"Iniciando");

    }

    public static AppiumDriver<MobileElement> getAppiumDriver(){
        return appiumDriver;
    }
    public static void stopAppiumDriver(){
        appiumDriver.quit();

    }
}
