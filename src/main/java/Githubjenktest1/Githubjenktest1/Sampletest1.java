package Githubjenktest1.Githubjenktest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest1 {

    @org.testng.annotations.Test
	public void Test() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Srikanth\\Drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.guru99.com/");
		driver1.manage().window().maximize();
		System.out.print("Application launched successfully");
		driver1.close();
	}
}
