import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AddUser {
	@Test
	public void test() {									
		
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "http://thedemosite.co.uk/savedata.php";					
        driver.get(baseUrl);					

        // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement username = driver.findElement(By.name("username"));							

        // Get the WebElement corresponding to the Password Field		
        WebElement password = driver.findElement(By.name("password"));							

        //username.sendKeys("david1010");					
        //password.sendKeys("abcdefghlkjl");					
       //System.out.println("Text Field Set");					
         
        // Deleting values in the text box		
        username.clear();			
        password.clear();			
        System.out.println("Text Field Cleared");					

        // Find the submit button		
        WebElement save = driver.findElement(By.name("FormsButton2"));							
                    		
        // Using click method to submit form		
        username.sendKeys("david1010");					
        password.sendKeys("test");					
        save.click();			
        System.out.println("Login Done with Click");	
        
        WebElement login1 = driver.findElement(By.xpath("//a[@href='login.php']"));
        login1.click();			
        
        
        //using submit method to submit the form. Submit used on password field		
        WebElement log = driver.findElement(By.name("FormsButton2"));					
        driver.findElement(By.name("username")).sendKeys("david1010");							
        driver.findElement(By.name("password")).sendKeys("test");							
        log.click();					
        System.out.println("Login Done with Submit");					
        driver.getPageSource().contains("**Successful Login**");
		
	}
      //driver.close();	 
	      
} 