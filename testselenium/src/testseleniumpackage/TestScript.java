package testseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestScript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\merty\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Roof Stack Yazýlým");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"btnK\"]")).click();
		Thread.sleep(1000);
		JavascriptExecutor down = (JavascriptExecutor)driver;
		down.executeScript("scrollBy(0,1000)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[3]/div[2]/div/div/div[1]/a/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Career']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"slide-portfolio\"]/div/ul/li[2]/figure/a/span")).click();
		Thread.sleep(1000);
		down.executeScript("scrollBy(0,1500)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"slide-portfolio\"]/div/ul/li[3]/figure/a/span")).click();
		Thread.sleep(1000);
		down.executeScript("scrollBy(0,900)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//html/body/main/div[3]/div/div[2]/div/div[1]/div/a/h3/small")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("mertyarligan01@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"file\"]")).sendKeys("C:\\Users\\merty\\OneDrive\\Masaüstü\\MertCv.pdf");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btn_upload\"]")).click();
		
		
	
		//driver.close();
		
	
	}

}

