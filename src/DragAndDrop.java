import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.MoveAction;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDrop extends base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		//WebElement Second = driver.findElementByXPath("//*[@content-desc='45']");
		//t.longPress(longPressOptions().withElement(element(Second)).withDuration(ofSeconds(2))).moveTo(element(Second)).release().perform();
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement distnaction = driver.findElementsByClassName("android.view.View").get(1);
		
		TouchAction t = new TouchAction(driver);
		//t.longPress(longPressOptions().withElement(element(source))).moveTo(element(distnaction)).release().perform();
		t.longPress(element(source)).moveTo(element(distnaction)).release().perform();

	}

}
