package com.myapp.appnew.app;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * 
 */

/**
 * @author vn0u7yz
 *
 */
public class Base {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		File f = new File("src");
		File fs1 = new File(f, "ApiDemos-debug.apk");
		File fs2 = new File(f, "tin_7.4.0-2211_minAPI16.apk");
		File fs3 = new File(f, "fb_127.0.0.22.69-60327773_minAPI22.apk");
		File fs4 = new File(f, "googlePlayStore_minAPI14.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator1");
		cap.setCapability(MobileCapabilityType.APP, fs1.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);		
		
		return driver;
	}

}
