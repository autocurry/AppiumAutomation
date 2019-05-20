package calculator;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CalculatorAutomation {

	private static AndroidDriver<WebElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
			 
		 DesiredCapabilities capabilities = new DesiredCapabilities();		 
		 capabilities.setCapability("deviceName", "3UMDU16511000750");		 
		 capabilities.setCapability("platformName", "Android");		 
		 capabilities.setCapability("appPackage", "com.android.calculator2");
		 capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");		 
		 driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 Thread.sleep(10000);
		 
		 driver.findElementByAccessibilityId("7").click();
		 driver.findElementByAccessibilityId("plus").click();
		 driver.findElementByAccessibilityId("6").click();
		 driver.findElementByAccessibilityId("equals").click();
		 
		 String result = driver.findElementByClassName("android.widget.EditText").getText();
		 
		 System.out.println(result);		 
		 
		 driver.quit();

	}

}
