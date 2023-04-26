package UI.WebAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");

		System.setProperty("webdriver.chrome.driver", "./myDrivers/chromedriver.exe");

		// 2.web driver setup

		WebDriver driver = new ChromeDriver();
		// 3.url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// 4.window maximize

		driver.manage().window().maximize();
	}

}
