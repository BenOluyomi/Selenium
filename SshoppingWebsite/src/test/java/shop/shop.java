package shop;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shop {
   
	@Test
    public void test() {

    WebDriver driver; // declare webdriver instance
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // set driver path
    driver =new ChromeDriver(); 

    driver.get("http://automationpractice.com/index.php"); // open google.com

    driver.findElement(By.id("search_query_top")).sendKeys("Dress");
    WebElement search = driver.findElement(By.name("submit_search"));							
    search.click();
   
    driver.getPageSource().contains("Printed Summer Dress");

    }

}