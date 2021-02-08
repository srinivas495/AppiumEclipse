import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;
import pageObjects.PreferencePage;

public class Test1 extends base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage h = new HomePage(driver);
		PreferencePage p = new PreferencePage(driver);
		
		h.Preference.click();
		p.dependencies.click();
		p.Checkbox.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.Setting.click();
		p.EditBox.sendKeys("Srinivas");
		p.button.get(1).click();
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		//driver.findElementById("android:id/checkbox").click();
		//driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		//driver.findElementByClassName("android.widget.EditText").sendKeys("Srinivas");
		//driver.findElementsByClassName("android.widget.Button").get(1).click();
	
		// App Permission code
		
		//driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		
	}

}
