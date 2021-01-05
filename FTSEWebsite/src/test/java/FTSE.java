import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FTSE {
	@Test
	public void test() {

		WebDriver driver; // declare webdriver instance
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // set driver path
		driver = new ChromeDriver();

		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100/risers"); //
		String innerText = driver.findElement(By.xpath("//*[@id=\"ls-row-NXT-L\"]/td[1]")).getText();
		System.out.println(innerText);
		
		
		// WebElement riser =
		// driver.findElement(By.xpath("//a[@href='https://www.hl.co.uk/shares/stock-market-summary/ftse-100/risers']"));
		// riser.click();

		//WebElement p = driver.findElement(By.partialLinkText("RISERS"));
		// cant click link with either method?
		//p.click();
		
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100/fallers"); //
		String innerText1 = driver.findElement(By.xpath("//*[@id=\"ls-row-ABF-L\"]/td[1]")).getText();
		System.out.println(innerText1);
		

	}

}
