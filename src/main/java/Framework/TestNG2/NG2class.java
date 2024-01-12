package Framework.TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NG2class {
	@Test
	public void mone() 
	{
		System.out.println("This is a testng class1 fn1 should run aftertest");
	}
	
	@Test(groups="groupoflogin",priority=2)
	public void login() 
	{
	        WebDriver firefoxdriver = new FirefoxDriver();
	        firefoxdriver.get("https://www.saucedemo.com/v1/index.html");

	        // Login process
	        WebElement username = firefoxdriver.findElement(By.cssSelector("input[type=\"text\"]"));
	        username.sendKeys("standard_user");
	        WebElement pasw = firefoxdriver.findElement(By.id("password"));
	        pasw.sendKeys("secret_sauce");
	        WebElement loginButton = firefoxdriver.findElement(By.id("login-button"));
	        loginButton.click();
	        firefoxdriver.close();
	}
	@Test(groups="grouplast",priority=5)
	public void moneee() 
	{
		System.out.println("This is a testng class1 fn3 should run aftersuite");
	}

}
