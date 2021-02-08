import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridBase {
	public static  AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException
	{
		AndroidDriver<AndroidElement>  driver;


		File appDir = new File("src");
		File app = new File(appDir, "EduCards.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		if(device.equals("real")) {
			
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}
			
		else if (device.equals("emulator")) {
			
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "srinivas123");
		}
			
		//  capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}