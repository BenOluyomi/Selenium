
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class initials {

		private static RemoteWebDriver driver;
		
		Actions action = new Actions(driver);
		
		HomePage nav = PageFactory.initElements(driver, HomePage.class);
		
		@BeforeClass
		public static void init() {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			driver =new ChromeDriver(); 
		}

	
		@Before
		public void setup() {
		driver.get(nav.URL);
		}
		
		@AfterClass
		public static void tearDown() {
			//driver.quit();
		}
		
		@Test
		public void drawInitials() throws InterruptedException{
			WebElement canvas = driver.findElement(By.cssSelector("#catch"));
			
			nav.clickBrush();
			action.moveToElement(canvas).clickAndHold().moveByOffset(0, -200 ).moveByOffset(100, 0 ).click().moveToElement(canvas,0,0).clickAndHold().moveByOffset(100, 0 ).click().moveToElement(canvas,0,0).clickAndHold().moveByOffset(0, -200 ).moveByOffset(100, 0 ).click().moveToElement(canvas,0,0).clickAndHold().moveByOffset(100, -200 ).click().moveToElement(canvas,0,0).build().perform();
		}
}
