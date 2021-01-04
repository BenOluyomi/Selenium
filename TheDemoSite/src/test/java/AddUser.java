import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddUser {
	public static void main(String[] args) {									
		
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "http://thedemosite.co.uk/savedata.php";					
        driver.get(baseUrl);					

        // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement username = driver.findElement(By.id("username"));							

        // Get the WebElement corresponding to the Password Field		
        WebElement password = driver.findElement(By.name("password"));							

        username.sendKeys("david1010");					
        password.sendKeys("abcdefghlkjl");					
        System.out.println("Text Field Set");					
         
        // Deleting values in the text box		
        username.clear();			
        password.clear();			
        System.out.println("Text Field Cleared");					

        // Find the submit button		
        WebElement login = driver.findElement(By.id("SubmitLogin"));							
                    		
        // Using click method to submit form		
        username.sendKeys("david1010");					
        password.sendKeys("abcdefghlkjl");					
        login.click();			
        System.out.println("Login Done with Click");					
        		
        //using submit method to submit the form. Submit used on password field		
        driver.get(baseUrl);					
        driver.findElement(By.id("username")).sendKeys("david1010");							
        driver.findElement(By.name("password")).sendKeys("abcdefghlkjl");							
        driver.findElement(By.id("save")).submit();					
        System.out.println("Login Done with Submit");					
         
		driver.close();		
        		
    }		
}