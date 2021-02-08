package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PreferencePage {
	
	public PreferencePage(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement dependencies;
	
	@AndroidFindBy(id = "android:id/checkbox")
	public WebElement Checkbox;
	
	@AndroidFindBy(xpath = "(//android.widget.RelativeLayout)[2]")
	public WebElement Setting;
		
	@AndroidFindBy(className = "android.widget.EditText")
	public WebElement EditBox;


	@AndroidFindBy(className= "android.widget.Button")
	public List<WebElement> button;
	
	
}
