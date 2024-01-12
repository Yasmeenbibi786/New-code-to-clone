package Framework.TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NG2class2 {
	@Test(groups="sitegroup",priority=1)
	public void Checkout() throws InterruptedException {
        WebDriver firefoxdriver = new FirefoxDriver();
        firefoxdriver.get("https://www.saucedemo.com/v1/index.html");

        // Login process
        WebElement username = firefoxdriver.findElement(By.cssSelector("input[type=\"text\"]"));
        username.sendKeys("standard_user");
        WebElement pasw = firefoxdriver.findElement(By.id("password"));
        pasw.sendKeys("secret_sauce");
        WebElement loginButton = firefoxdriver.findElement(By.id("login-button"));
        loginButton.click();

        // Navigation to items
        WebElement menuButton = firefoxdriver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button"));
        menuButton.click();
        Thread.sleep(3000);
        WebElement allItems = firefoxdriver.findElement(By.id("inventory_sidebar_link"));
        allItems.click();
        Thread.sleep(5000);

        // Selecting and adding items to cart
        WebElement selectedItem = firefoxdriver.findElement(By.className("inventory_item_name"));
        selectedItem.click();
        WebElement addToCart = firefoxdriver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
        addToCart.click();
        WebElement goBack = firefoxdriver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button"));
        goBack.click();
        Thread.sleep(3000);
        WebElement selectByImage = firefoxdriver.findElement(By.xpath("//*[@id=\"item_2_img_link\"]/img"));
        selectByImage.click();
        WebElement addToCart1 = firefoxdriver.findElement(By.cssSelector("button.btn_primary.btn_inventory"));
        addToCart1.click();
        Thread.sleep(3000);

        // Clicking on cart - Handling StaleElementReferenceException
        WebElement cartclick;
        try {
            WebElement cartHeader = firefoxdriver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]"));
            cartclick = cartHeader.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
            cartclick.click();
        } catch (StaleElementReferenceException e) {
            WebElement cartHeader = firefoxdriver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]"));
            cartclick = cartHeader.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
            cartclick.click();
        }

        // Refreshing and continuing with checkout
        firefoxdriver.navigate().refresh();
        WebElement checkout = firefoxdriver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]"));
        checkout.click();
        WebElement firstName = firefoxdriver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        firstName.sendKeys("Muhammad");
        WebElement lastName = firefoxdriver.findElement(By.id("last-name"));
        lastName.sendKeys("Zeeshan");
        WebElement postcode = firefoxdriver.findElement(By.id("postal-code"));
        postcode.sendKeys("12546");
        WebElement continu = firefoxdriver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input"));
        continu.click();
        WebElement finsh = firefoxdriver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]"));
        finsh.click();
        firefoxdriver.quit();
        System.out.println("on priority one");
    
}


}
