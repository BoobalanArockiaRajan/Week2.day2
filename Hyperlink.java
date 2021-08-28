package Week2.day2;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.linkText("HyperLink")).click();
		@SuppressWarnings("unused")
		String attribute = driver.findElement(By.partialLinkText("supposed")).getAttribute("href");
		WebElement pageNot = driver.findElement(By.partialLinkText("Verify "));
		pageNot.click();
		String expTitle = "HTTP Status 404 – Not Found";
		if (driver.getTitle().equals(expTitle)) {
			System.out.println(" Page not found");
		} else
			System.out.println("page is loaded");
		driver.navigate().to("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		driver.navigate().back();
		List list = (List) driver.findElementsByTagName("a");
		list.size();
		int size = driver.findElementsByTagName("a").size();
		System.out.println(size);
	}
}
