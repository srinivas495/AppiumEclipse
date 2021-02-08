import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class flipkartTest extends base{

	public static void main(String[] args) throws MalformedURLException 
	{
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"English\")").click();
		driver.findElementByAndroidUIAutomator("text(\"CONTINUE\")").click();
		driver.findElementByAndroidUIAutomator("text(\"NONE OF THE ABOVE\")").click();
	}

}
