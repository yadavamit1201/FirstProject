package JavaPrograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brockenLinks {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		List<WebElement> myList=driver.findElements(By.tagName("a"));
		
		List<WebElement> activeLinks=new ArrayList<>();
		
		for(int i=0; i<myList.size(); i++)
		{
			if(myList.get(i).getAttribute("href") != null);
			{
				activeLinks.add(myList.get(i));		
		    }
	    }	
		for(int j=0; j<activeLinks.size(); j++)
		{
			HttpURLConnection connection=(HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			
			if(connection.getResponseCode()==200)
			{
				String response=connection.getResponseMessage();
				System.out.println(activeLinks.get(j).getText()+"==>"+activeLinks.get(j).getAttribute("href")+"==>"+response);
			}	
			connection.disconnect();
		}
	}
}
