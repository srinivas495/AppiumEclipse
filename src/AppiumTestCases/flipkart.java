import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
 
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
 
public class flipkart {
 
	static AppiumDriver<WebElement> driver;
 
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		File f = new File("src");
		File fs = new File(f, "flipkart.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.VERSION, "9.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
		
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("noReset", "false");
		cap.setCapability("fullReset", "true");
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		((FindsByAndroidUIAutomator<WebElement>) driver).findElementByAndroidUIAutomator("text(\"English\")").click();
		((FindsByAndroidUIAutomator<WebElement>) driver).findElementByAndroidUIAutomator("text(\"CONTINUE\")").click();
		//NONE OF THE ABOVE
		((FindsByAndroidUIAutomator<WebElement>) driver).findElementByAndroidUIAutomator("text(\"NONE OF THE ABOVE\")").click();
		//
		//Close Button
		driver.findElementById("com.flipkart.android:id/custom_back_icon").click();
		// Tap Search button
		driver.findElement(By.id("com.flipkart.android:id/search_widget_textbox")).click();
		// Search Laptop
		driver.findElement(By.id("com.flipkart.android:id/search_autoCompleteTextView")).sendKeys("Laptop");
		((FindsByAndroidUIAutomator<WebElement>) driver).findElementByAndroidUIAutomator("text(\"in Laptops\")").click();
		//Click one 1 one
		((FindsByAndroidUIAutomator<WebElement>) driver).findElementByAndroidUIAutomator("text(\"Acer One 14 Pentium Gold - (4 GB/1 TB HDD/Windows 10 Home) Z2-485 Thin and Light Laptop\")").click();
		// Tap Add to Cart
		driver.findElement(By.xpath("//*[@text='ADD TO CART']")).click();
		// SKIP 
		driver.findElement(By.xpath("//*[@text='SKIP & GO TO CART']")).click();
		//Place Order
		driver.findElement(By.xpath("//*[@text='Place Order ']")).click();
		//Navigate to Login Page
		((FindsByAndroidUIAutomator<WebElement>) driver).findElementByAndroidUIAutomator("text(\"NONE OF THE ABOVE\")").click();
		//Enter Mobile Number
		driver.findElement(By.id("com.flipkart.android:id/phone_input")).sendKeys("7011068390");
		
		
		
		
		
	}
}