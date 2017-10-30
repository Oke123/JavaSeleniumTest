package uk.co.travelex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Main {
	public static void main(String[] args) {
		

		/*ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("default");*/
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver1.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://www.travelex.co.uk/";
		System.out.println("Opening Url");
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Adding First Currency");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/section[1]/"
				+ "article/section/article/div/form/div/div[2]/div[1]/button")).click();
		
		System.out.println("Adding Second Currency");
		driver.navigate().refresh();
		driver.findElement(By.xpath(".//*[@id='addMoreCurrency']/a[1]")).click();
		driver.findElement(By.xpath(".//*[@id='addMoreCurrency']/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath(".//*[@id='ui-id-7']")).click();
		driver.findElement(By.xpath(".//*[@id='addMoreCurrency']/div[1]/div/button")).click();
		
		System.out.println("Adding Third Currency");
		driver.findElement(By.xpath(".//*[@id='addMoreCurrency']/a[1]")).click();
		driver.findElement(By.xpath(".//*[@id='addMoreCurrency']/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath(".//*[@id='ui-id-487']")).click();
		driver.findElement(By.xpath(".//*[@id='addMoreCurrency']/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath(".//*[@id='ui-id-964']")).click();
		driver.findElement(By.xpath(".//*[@id='addMoreCurrency']/div[1]/div/button")).click();
		
		System.out.println("Adding Currency Completed");
		
		System.out.println("Finding Store");
		driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
		System.out.println("Finding Store Completed");
		
		//driver.close();
		System.out.println("Closing Driver");
	}
}
