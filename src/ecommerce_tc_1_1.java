import java.awt.Window;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;
public class ecommerce_tc_1_1 extends base{
	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver=capabilities();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
		// driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();

		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Australia\").instance(0))"));
		// driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"+ containedText +"\").instance(0))"));     
		driver.findElement(By.xpath("//*[@text='Australia']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(toastMessage);

		Assert.assertEquals("Please enter your name", toastMessage);//Actual validation
		Assert.assertEquals("Please enter your name", toastMessage);

		//name attribute for toast messages will have content

	}

}

