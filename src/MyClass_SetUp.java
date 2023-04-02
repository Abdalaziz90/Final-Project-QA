import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;




public class MyClass_SetUp {
	
	WebDriver driver;
	SoftAssert myAssertion;
	
	@BeforeTest
	public void SetUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		myAssertion = new SoftAssert();
		driver.get("https://magento.softwaretestingboard.com/");
		
	}
	
	  

	
}
