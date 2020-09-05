package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameter1 {
public static 	WebDriver driver;
	
	

@BeforeTest
public void open() throws InterruptedException  {
 
System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
}


@Test
@Parameters({"user","password"})  
public void Login_1(String users, String passwords) throws InterruptedException{
	WebElement user = driver.findElement(By.name("email"));
	user.sendKeys(users);
	Thread.sleep(3000);
	
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys(passwords);
	Thread.sleep(3000);

	user.clear();
	password.clear();
	Thread.sleep(3000);
	

	
}

@AfterTest
public void close(){
	driver.close();
}
}

