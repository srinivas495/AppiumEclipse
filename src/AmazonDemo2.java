import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonDemo2 {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "srinivas123");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\HS0013\\eclipse-workspace\\Appium\\src\\Amazon.apk");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("AndroidDriver<AndroidElement>"),cap); 
	
		
		
		
		

	}

}
