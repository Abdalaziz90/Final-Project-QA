import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyClass_TestCases extends MyClass_SetUp{
	
//	Sign Up >>>>
	
//	@Test(groups = {"welcome in sign up"}, priority = 1)
//	public void SignUp() throws InterruptedException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
//		myAssertion = new SoftAssert();
//		driver.get("https://magento.softwaretestingboard.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Abdalaziz");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Zinati");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("abood_zinati@hotmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Abood8090@10");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("Abood8090@10");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
//		myAssertion.assertTrue(true);
//		myAssertion.assertAll();
//	}
//	
//	
////	Sign In  >>>>
//	
//	@Test(groups = {"welcome in sign up" ,"welcome sign in and buy products", "search bar selected", "checkout Page"} ,priority = 2)
//	public void SignIn() throws InterruptedException {
//		myAssertion = new SoftAssert();
//		driver.get("https://magento.softwaretestingboard.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abood_zinati@hotmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Abood8090@10");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//		myAssertion.assertTrue(true);
//		myAssertion.assertAll();
//	}
//	
//	
////	Search bar in the home page  >>>>
//	
//	@Test(groups = "search bar selected", priority = 3)
//	public void SearchBarSelected() {
//		myAssertion = new SoftAssert();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		String[] SearchRandomlyClothes = {"Jacket", "t-shirt", "jeans for men", "jeans for women","pants"};
//		Random random = new Random();
//		int randomCloths = random.nextInt(5);
//		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(SearchRandomlyClothes[randomCloths]+Keys.ENTER);
//		System.out.println(SearchRandomlyClothes[randomCloths]);
//		myAssertion.assertTrue(true);
//		myAssertion.assertAll();
//	}
//	
//	
//	
//	
//	@Test(groups = "welcome sign in and buy products" ,priority = 4)
//	public void AddFiveItemsInHomePage() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a")).click();
//		
////		Radiant tee >>>>
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/div/strong/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("3");
//		WebElement SizeRadiantTee = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
//		List<WebElement> divsSizeRadiantTee = SizeRadiantTee.findElements(By.tagName("div"));
//		System.out.println(divsSizeRadiantTee.size());
//		Random ranSizeRadiantTee = new Random();
//		int numberSize = ranSizeRadiantTee.nextInt(5);
//		Thread.sleep(3000);
//		divsSizeRadiantTee.get(numberSize).click();
//		WebElement ColorRadiantTee = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
//		List<WebElement> divsColorRadiantTee = ColorRadiantTee.findElements(By.tagName("div"));
//		System.out.println(divsColorRadiantTee.size());
//		Random ransColorRadiantTee = new Random();
//		int numberColorRadiantTee = ransColorRadiantTee.nextInt(3);
//		Thread.sleep(3000);
//		divsColorRadiantTee.get(numberColorRadiantTee).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		
//		
////		Breathe easy tank >>>> 
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/div/strong/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("2");
//		WebElement SizeBreatheEasyTank = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
//		List<WebElement> divsSizeBreatheEasyTank = SizeBreatheEasyTank.findElements(By.tagName("div"));
//		System.out.println(divsSizeBreatheEasyTank.size());
//		Random ranSizeBreatheEasyTank = new Random();
//		int numberSizeBreatheEasyTank = ranSizeBreatheEasyTank.nextInt(5);
//		Thread.sleep(3000);
//		divsSizeBreatheEasyTank.get(numberSizeBreatheEasyTank).click();
//		WebElement ColorBreatheEasyTank = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
//		List<WebElement> divsColorBreatheEasyTank = ColorBreatheEasyTank.findElements(By.tagName("div"));
//		System.out.println(divsColorBreatheEasyTank.size());
//		Random ransColorBreathEasyTank = new Random();
//		int numberColorBreatheEasyTank = ransColorBreathEasyTank.nextInt(3);
//		Thread.sleep(3000);
//		divsColorBreatheEasyTank.get(numberColorBreatheEasyTank).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		
//		
//		
////		Argus all weather tank  >>>>
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div/div/strong/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("4");
//		WebElement SizeArgusAllWeatherTank = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
//		List<WebElement> divsSizeArgusAllWeatherTank  = SizeArgusAllWeatherTank.findElements(By.tagName("div"));
//		System.out.println(divsSizeArgusAllWeatherTank.size());
//		Random ranSizeArgusAllWeatherTank = new Random();
//		int numberSizeArgusAllWeatherTank = ranSizeArgusAllWeatherTank.nextInt(5);
//		Thread.sleep(3000);
//		divsSizeArgusAllWeatherTank.get(numberSizeArgusAllWeatherTank).click();
//		WebElement ColorArgusAllWeatherTank = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
//		List<WebElement> divsColorArgusAllWeatherTank = ColorArgusAllWeatherTank.findElements(By.tagName("div"));
//		System.out.println(divsColorArgusAllWeatherTank.size());
//		Random ransColorArgusAllWeatherTank = new Random();
//		int numberColorArgusAllWeatherTank = ransColorArgusAllWeatherTank.nextInt(1);
//		Thread.sleep(3000);
//		divsColorArgusAllWeatherTank.get(numberColorArgusAllWeatherTank).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		
//		
////		Hero hoodie
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/div/strong/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("1");
//		WebElement SizeHeroHoodie = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
//		List<WebElement> divsSizeHeroHoodie  = SizeHeroHoodie.findElements(By.tagName("div"));
//		System.out.println(divsSizeHeroHoodie.size());
//		Random ranSizeHeroHoodie = new Random();
//		int numberSizeHeroHoodie = ranSizeHeroHoodie.nextInt(5);
//		Thread.sleep(3000);
//		divsSizeHeroHoodie.get(numberSizeHeroHoodie).click();
//		WebElement ColorHeroHoodie = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
//		List<WebElement> divsColorHeroHoodie = ColorHeroHoodie.findElements(By.tagName("div"));
//		System.out.println(divsColorHeroHoodie.size());
//		Random ransColorHeroHoodie = new Random();
//		int numberColorHeroHoodie = ransColorHeroHoodie.nextInt(3);
//		Thread.sleep(3000);
//		divsColorHeroHoodie.get(numberColorHeroHoodie).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		
////		Fusion backpack
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/div/strong/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("5");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//		
//		myAssertion.assertTrue(true);
//		myAssertion.assertAll();
//	}
//	
////	Checkout Shipping Address >>>>>
//	
//	@Test(groups = "checkout Page of fill out in shipping address", priority = 5)
//	public void CheckoutShippingAddress() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
//		
////		Shipping Address Fill out  >>>
//		
//		WebElement selectCountry = driver.findElement(By.xpath("//*[@id=\"P2BSS90\"]"));
//		Select mySelector = new Select(selectCountry);
//		mySelector.selectByValue("Jordan");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"YSY0BJN\"]")).sendKeys("Street Tarbabour");
//		driver.findElement(By.xpath("//*[@id=\"JECL4GE\"]")).sendKeys("Amman");
//		driver.findElement(By.xpath("//*[@id=\"G2J6QCC\"]")).sendKeys("11731");
//		driver.findElement(By.xpath("//*[@id=\"QRNALRG\"]")).sendKeys("+962799689938");
//		
//	}
//	
////	Checkout Page Place Order
//	
//	@Test(groups = "checkout Page", priority = 6)
//	public void CheckoutPagePlaceorder() throws InterruptedException {
//		myAssertion = new SoftAssert();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]/a")).click();
//		String ExpectFinalPrice = "$467.00";
//		String ExpectFinalPriceString = ExpectFinalPrice.replace("$", "");
//		BigDecimal ExpectFinalPriceNumber = new BigDecimal(ExpectFinalPriceString);
//		String ActualFinalprice = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[4]/td/strong/span")).getText();
//		String ActualFinalPriceString = ActualFinalprice.replace("$", "");
//		BigDecimal ActualFinalPriceNumber = new BigDecimal(ActualFinalPriceString);
//		System.out.println(ActualFinalPriceNumber);
//		myAssertion.assertEquals(ActualFinalPriceNumber, ExpectFinalPriceNumber);
//		myAssertion.assertAll();
//	}
	
	
//	Check my Order in 5 times
	
	@Test(groups = "my account in re-order", priority = 1)
	public void myAcountOnReOrderInFiveTimes() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abood_zinati@hotmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Abood8090@10");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
	}
		
	
//	Checkout of Re-order process >>>>>
	
		@Test(groups = "my account in re-order", priority = 2, invocationCount = 5)
		public void myAcountOnReOrderInFiveTimesCheck() throws InterruptedException	{
			myAssertion = new SoftAssert();
			driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/a[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");

			
		String ExpectReOrderPrice = "$467.00";
		String ExpectReOrderPriceString = ExpectReOrderPrice.replace("$", "");
		Double ExpectReOrderPriceNumber = Double.parseDouble(ExpectReOrderPriceString);
		WebElement PricesOrder = driver.findElement(By.className("price"));
		String ActualReOrderPrice = PricesOrder.getText();
		String ActualReOrderPriceString = ActualReOrderPrice.replace("$", "").replace(",", "");
		Double ActualReOrderPriceNumber = Double.parseDouble(ActualReOrderPriceString);
		System.out.println(ActualReOrderPriceNumber);
		myAssertion.assertEquals(ActualReOrderPriceNumber, ExpectReOrderPriceNumber);
		
		myAssertion.assertAll();
	}
	
	
	
}


