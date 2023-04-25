package lab6;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;
import org.testng.Assert;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise {
	ChromeDriver driver;
	
	@BeforeMethod
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("https://automationexercise.com/products");
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

	@Test
	public void TC_001() throws Exception{
		Actions act = new Actions(driver);
		
		WebDriverWait wait15 = new WebDriverWait(driver, 15);			
		WebElement inputsearch = wait15.until(ExpectedConditions.visibilityOfElementLocated(By.name("search")));
		WebElement buttonsearch = driver.findElement(By.id("submit_search"));
		assertEquals(inputsearch.isDisplayed(),true,"inputsearch không Displayed");
		assertEquals(inputsearch.isEnabled(),true,"inputsearch không Enabled");
		assertEquals(buttonsearch.isEnabled(), true,"buttonsearch không Enabled");
		assertEquals(buttonsearch.isDisplayed(), true,"buttonsearch không Displayed");		
		
//		act.sendKeys(inputsearch,"Stylish Dress").perform();
		act.sendKeys(inputsearch,"Stylish Dress").sendKeys(Keys.ENTER).build().perform();
		act.click(buttonsearch).perform();							// buttonsearch.click();

		
		WebDriverWait wait5 = new WebDriverWait(driver, 5);	
		List<WebElement> List_product = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("single-products")));
		assertEquals(List_product.size(), 1, "Số lượng sp đầu ra không phải là 1");
		
		// Check class single-products
		if(List_product.size() == 1) {
			WebElement image_product = driver.findElement(By.xpath("//div[@class='single-products']/div[1]/img[1]"));
			WebElement price_product = driver.findElement(By.xpath("//div[@class='single-products']/div[1]/h2[1]"));
			WebElement name_product = driver.findElement(By.xpath("//div[@class='single-products']/div[1]/p[1]"));
			WebElement buton_addtocart = driver.findElement(By.xpath("//div[@class='single-products']/div[1]/a[1]"));
			//Kiểm tra có hiển thị hình ảnh
			assertEquals(image_product.isDisplayed(), true,"Ảnh không Displayed");
			assertNotNull(image_product.getAttribute("src"), "Không có link ảnh");
			
			// Kiểm tra trùng tên
			assertEquals(name_product.getText(),"Stylish Dress","Tên sản phẩm không trùng với tên tìm kiếm");
			
			// Kiểm tra có giá sản phẩm
			assertNotNull(price_product.getText(), "Không có giá sản phẩm");
			
			//Đảm bảo button “Add to cart” được hiển thị trên Item.
			assertEquals(image_product.isDisplayed(), true,"buton_addtocart không Displayed");
			assertEquals(image_product.isEnabled(), true,"buton_addtocart không isEnabled");
			
			//click add to cart
			act.click(buton_addtocart).perform(); 	//buton_addtocart.click();
			
// Màn hình Added - Your product has been added to cart.
			// Có msg_added Your product has been added to cart.!
			WebElement msg_added = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='modal-title w-100']")));
			assertEquals(msg_added.isDisplayed(), true,"View_Cart không Displayed");
			assertEquals(msg_added.isEnabled(), true,"View_Cart không isEnabled");
			assertEquals(msg_added.getText(), "Added!","Có msg");
			
			// Có msg 
			WebElement msg_addsucces = driver.findElement(By.xpath("//div[@class='modal-body']/p[1]"));
			assertEquals(msg_addsucces.isDisplayed(), true,"msg_addsucces không Displayed");
			assertEquals(msg_addsucces.isEnabled(), true,"msg_addsucces không isEnabled");
			assertEquals(msg_addsucces.getText(), "Your product has been added to cart.","Có msg");
			
			// có link View_cart
			WebElement View_cart = driver.findElement(By.xpath("//div[@class='modal-body']/p[2]"));
			assertEquals(View_cart.isDisplayed(), true,"View_cart không Displayed");
			assertEquals(View_cart.isEnabled(), true,"View_cart không isEnabled");
		
			act.click(View_cart).perform();			// View_Cart.click();
			
// Màn hình giỏ hàng
			List<WebElement> List_product_added = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@id='cart_info_table']/tbody[1]/tr")));
			assertEquals(List_product_added.size(),1);
			if(List_product_added.size() == 1) {
				WebElement Name_first_product_added = driver.findElement(By.xpath("//table[@id=\"cart_info_table\"]/tbody[1]/tr[1]/td[@class='cart_description']/h4/a"));
				assertEquals(Name_first_product_added.getText(),"Stylish Dress","Added không đúng tên sản phẩm");
				
				

			};
		}
	}	
}
