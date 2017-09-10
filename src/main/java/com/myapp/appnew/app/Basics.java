package com.myapp.appnew.app;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * 
 */

/**
 * @author vn0u7yz
 *
 */
public class Basics extends Base {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath id classname, androidUIautomator
		
		/*
		 * xpath syntax
		 * //tagName[@attribute='value'] 
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
//		driver.findElementsById("android:id/checkbox");
		
//		WebElement element = driver.findElementById("com.tinder:id/gamepad_like");
//		int i =0;
//		
//		while(i<20){
//			element.click();
//			i++;
//		}
		
		
		System.out.println("done");

	}

}
