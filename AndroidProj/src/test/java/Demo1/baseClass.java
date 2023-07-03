package Demo1;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class baseClass {
	
	static AndroidDriver androidDriver;
	DesiredCapabilities cab;

	public void capabilities() throws Exception

	{

		cab = new DesiredCapabilities();
		
		cab.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cab.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S21 FE 5G");
		cab.setCapability("appPackage", "io.appium.android.apis");
		cab.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		cab.setCapability("ignoreHiddenApiPolicyError", "true");
		cab.setCapability("noReset", "true");

		androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cab);
		//androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cab);
		// driverCall();
		//((AndroidDriver) androidDriver).closeApp();

		System.out.println("Application launched successfully.");
	
	}
}
