package SelfEmploy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Amazon {

	public static AndroidDriver<AndroidElement> main(String[] args) throws MalformedURLException 
	{
		AndroidDriver<AndroidElement>  driver;


		File appDir = new File("src");
		File app = new File(appDir, "Amazon.apk");
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "srinivas123");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//cap.setCapability(MobileCapabilityType., value);
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}
