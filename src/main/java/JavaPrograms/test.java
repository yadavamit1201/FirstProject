package JavaPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='SIvCob']//a"));
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i).getText());
			System.out.print(" ");
		}
		
		
		
		
		
	}

}
