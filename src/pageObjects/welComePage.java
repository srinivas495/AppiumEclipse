package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class welComePage {
	
	public welComePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidBy(xpath = "//android.widget.ImageView[@content-desc='search']")
	public AndroidElement clickOnSearchButton;
	
	@AndroidBy(xpath = "//android.widget.EditText[@text='Search for brands & products']")
	public AndroidElement serachByName;
	
	
	
	
	
}
