package Scripts;
import pages.WebPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;


public class ScheduleVisit {
	static 
	{
		//TODO please change the driver path
		System.setProperty("webdriver.gecko.driver", "/home/avinash/eclipse-workspace/CoreJava/Avi/geckodriver");
	}
	WebDriver driver =  new FirefoxDriver();
	
	@Test(priority=1)
	public void login() {
		
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://52.201.90.154:9002/");
	
	WebPage.login_button(driver).click();
	WebPage.username(driver).sendKeys("7777777012");
	WebPage.password(driver).sendKeys("123456");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		System.out.println("Can't sleep");
		
	}
	
	WebPage.SignIn_btn(driver).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		System.out.println("Can't sleep");
		
	}
	System.out.println("Logged In succesfully");
	
	
	// supply the initial string
	
	}
	@Test(priority=2)
	public void search_select(){
		//selecting a place
	
		WebPage.search(driver).sendKeys("electronic");
		
		try {			
			
			Thread.sleep(1000);
			
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    List<WebElement> autoSuggest = driver.findElements(By.xpath("//ul[@id='ui-id-1']/child::li"));
		   
		       
		        autoSuggest.get(0).click();
		    System.out.println("Ecity selected");
		    
			}
			catch (InterruptedException e) {
				System.out.println("Could not select ECity2");
				
			}
		
		
	}
	
	
	//filter and select Goodfellas
	@Test(priority=3)
	public void filter_select() {
		
	
		Select budget = new Select(WebPage.budget(driver));
		budget.selectByIndex(1);;
		
		Select preference = new Select(WebPage.preference(driver));
		preference.selectByIndex(2);
		
		Select pgType = new Select(WebPage.PGtype(driver));
		pgType.selectByIndex(1);
		
		WebPage.goodfellas(driver).click();
		System.out.println("Goodfellas selected");
		String goodtitle = "Zolo Goodfellas for Men";
		
		
		WebPage.schedule_btn(driver).click();
		
		}
	@Test(priority=4)
	public void visit() throws InterruptedException {
		
		WebPage.visitDate(driver).clear();
		WebPage.visitDate(driver).sendKeys("2017-09-30");
		Select time =new Select(WebPage.visitTime(driver));
		time.selectByIndex(2);
		Thread.sleep(1000);
		WebPage.confirm_schedule_Btn(driver).click();
		
		String date_visit = "Sat Sep 30 2017";
		
		List<WebElement> visit = driver.findElements(By.xpath("//div[contains(@class, 'col-sm-3')]/child::h4[@class='ng-binding']"));
		
			
			if(date_visit.equals(visit.get(1).getText())) {
				System.out.println("Booking confirmed");
			}else {System.out.println("Booking not confirmed");}
		
		
		
		
	}
}
