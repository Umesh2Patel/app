/**
 * 
 */
package com.myapp.appnew.app;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

/**
 * @author vn0u7yz
 *
 */
public class Misc extends Base {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isLocked());
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		System.out.println("Back");

		
	}

}
