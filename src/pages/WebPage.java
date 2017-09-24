package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPage {
	
	private static WebElement element = null;
	
	
	public static WebElement login_button(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//a[@href='/login?signIn=true']"));
		

		return element;
		
		
	}

public static WebElement username(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@name='name']"));
		

		return element;
		
		
	}
public static WebElement password(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@name='password']"));
		

		return element;
		
	   }
public static WebElement SignIn_btn(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//input[@value='Sign In']"));
	

	return element;
	
   }
public static WebElement search(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//input[@id='searchBar']"));
	

	return element;
	
	
 }

public static WebElement budget(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//select[@ng-model='budget']"));
	

	return element;
	
	
}
public static WebElement preference(WebDriver driver) {
	
	element = driver.findElement(By.xpath(".//select[@ng-model='preference']"));
	

	return element;
	
	
}
public static WebElement PGtype(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//select[@ng-model='gender']"));
	

	return element;
	
	
}
public static WebElement goodfellas(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@id='583849856193f53870e51342']"));
	

	return element;
	
	
}
public static WebElement schedule_btn(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//a[contains(@href,'visits/new/0?centerId=583849856193f53870e51342')and@class='btn btn-default btn-block']"));
	

	return element;
	
	
}
public static WebElement visitDate(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//input[@name='visitDate']"));
	

	return element;
	
	
}
public static WebElement visitTime(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//select[@ng-model='visit.time']"));
	

	return element;
	
	}
public static WebElement confirm_schedule_Btn(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@ng-click='scheduleVisit(visit)']"));
	

	return element;
	
	}
public static WebElement goodfellas_title(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//span[contains(@class, 'summaryItem')]/child::h1[@class='pageTitle ng-binding']"));
	

	return element;
	
	}
public static WebElement visit_details(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[contains(@class, 'col-md-6')]/child::h4[@class='text-blue-z ng-binding']"));
	

	return element;
	
	}
}
