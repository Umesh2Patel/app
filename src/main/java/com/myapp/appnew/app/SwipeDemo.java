package com.myapp.appnew.app;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.PerformsTouchActions;
/*import org.openqa.selenium.By;

import io.appium.java_client.PerformsTouchActions;*/
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * 
 */

/**
 * @author vn0u7yz
 *
 */
public class SwipeDemo extends Base {

	/**
	 * @param args
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction t = new TouchAction(driver);

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='Minutes circular slider: 15']").click();
		Thread.sleep(5000L);
//		t.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(Duration.ofSeconds(3))
//				.moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
		
		new TouchAction((PerformsTouchActions) driver)
				.press(driver.findElement(By.xpath("//*[@content-desc='15']")))
				.waitAction(Duration.ofSeconds(3))
				.moveTo(driver.findElementByXPath("//*[@content-desc='45']"))
				.release().perform();
		
		/*TouchAction ta = new TouchAction(driver);
		AndroidElement fifteen = driver.findElementByXPath("//*[@content-desc='15']");
		AndroidElement fortyfive = driver.findElementByXPath("//*[@content-desc='45']");
		
		ta.press(fifteen).waitAction(Duration.ofSeconds(4)).moveTo(fortyfive).release().perform();*/
		System.out.println("done");
	}

}
