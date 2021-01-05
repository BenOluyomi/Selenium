import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	@Test
	public void test() {									
		
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "http://demo.guru99.com/test/newtours/register.php";					
        driver.get(baseUrl);					

        // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement firstName = driver.findElement(By.name("firstName"));									
        WebElement lastName = driver.findElement(By.name("lastName"));	
        WebElement phone = driver.findElement(By.name("phone"));
        WebElement userName = driver.findElement(By.name("userName"));
        WebElement address1 = driver.findElement(By.name("address1"));
        WebElement city = driver.findElement(By.name("city"));
        WebElement state = driver.findElement(By.name("state"));
        WebElement postalCode = driver.findElement(By.name("postalCode"));
        WebElement country = driver.findElement(By.name("country"));
        
        WebElement email = driver.findElement(By.name("email"));									
        WebElement password = driver.findElement(By.name("password"));
        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        // Deleting values in the text box		
        //firstName.clear();			
        //lastName.clear();			
        //System.out.println("Text Field Cleared");					
        WebElement submit = driver.findElement(By.name("submit"));
                    		
        // Using click method to submit form		
        firstName.sendKeys("Bruce");					
        lastName.sendKeys("Wayne");	
        phone.sendKeys("12345678");
        userName.sendKeys("not@batman.com");
        address1.sendKeys("33 wayne house");		
        city.sendKeys("Gotham");
        state.sendKeys("Somewhere in America");
        postalCode.sendKeys("GZX 1JE");
        country.sendKeys("UNITED STATES");
        
        email.sendKeys("not@batman.com");
        password.sendKeys("test1234");
        confirmPassword.sendKeys("test1234");
        submit.click();
        
        driver.getPageSource().contains("Thank you for registering. You may now sign-in using the user name and password you've just entered.");
        
        
	}
}
