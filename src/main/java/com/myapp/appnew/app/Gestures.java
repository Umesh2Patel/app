package com.myapp.appnew.app;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.PerformsTouchActions;
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
public class Gestures extends Base {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		//Tap functionality
		TouchAction t = new TouchAction(driver);
		WebElement el = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");		
		t.tap(el).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
//		boolean flag = el1.isDisplayed();
//		System.out.println("flag : " + flag);
//		t.press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(Duration.ofSeconds(3)).release().perform();
		Thread.sleep(5000L);
		WebElement el1 = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		new TouchAction((PerformsTouchActions) driver).press(el1).waitAction(Duration.ofSeconds(3)).release().perform();

//		t.longPress(el1).release().perform();

		System.out.println(driver.findElementById("android:id/alertTitle").getText());
				
	}

}
