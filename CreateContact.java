package Week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Boobal");
		driver.findElement(By.id("lastNameField")).sendKeys("Raj");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Boo");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Raja");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mech");
		driver.findElement(By.id("createContactForm_description")).sendKeys("I want become Software designer.");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Boomso.raj68@gmail.com");
		WebElement stateObj = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(stateObj);
		state.selectByVisibleText("Indiana");

		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is IMPORTANT NOTE field");
		driver.findElement(By.xpath("//input[@value='Update']")).click();

		System.out.println("Title of the Page: " + driver.getTitle());

	}

}
