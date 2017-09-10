/**
 * 
 */
package com.myapp.appnew.app;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author vn0u7yz
 *
 */
public class DragNDrop extends Base {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		TouchAction t = new TouchAction(driver);
		t.longPress(driver.findElementsByClassName("android.view.View").get(0))
				.moveTo(driver.findElementsByClassName("android.view.View").get(1))
				.release().perform();
		
		System.out.println("done");
	}

}
