package Basics;


import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgramPractice {



	public static void main(String[] args) throws Exception {
		
//		WebDriver driver;
//		System.setProperty("webdriver.edge.driver", "./msedgedriver.exe");
//		driver=new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.google.com/");
//		
//		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		

//	    String s="Amit Yadav";
//	    
//	    String[] c=s.split(" ");
//	   
//	    String rev="";
//	    for(int i=0; i<c.length; i++)
//	    {
//	    	for(int j=c[i].length()-1; j>=0; j--)
//	    	{
//	    		rev=rev+c[i].charAt(j);
//	    	}
//	    	rev=rev+" ";
//	    }
//	    		System.out.print(rev);
		
		
//		int x=14;
//		int y=8;
//		
//		x=x+y;
//		y=x-y;
//		x=x-y;
//		
//		System.out.println("x="+x+ " Y="+y);
		
//		String n="My name is Amit yadav";
//		
//		HashMap<Character, Integer> hs=new HashMap<>();
//		
//		char ch[]=n.toCharArray();
//		
//		int count=0;
//		
//		//System.out.println(ch[]);
//		
//		for(int i=0; i<ch.length; i++) 
//		{
//			if(ch[i]!=' ')
//		{
//				if(hs.containsKey(ch[i]))
//				{
//					count=hs.get(ch[i])+1;
//					hs.put(ch[i], count);
//				}
//				else
//				{
//					hs.put(ch[i], 1);
//				}
//				
//		}
//		
//		
//	}
//		System.out.println(hs);
		
//		
//		int n[]= {4,8,3,6,45,23,56,66,24,99,18};
//		
//		for(int i=0; i<n.length; i++)
//		{
//			for(int j=i+1; j<n.length; j++)
//			{
//				if(n[i]<n[j])
//				{
//					int temp=n[i];
//					n[i]=n[j];
//					n[j]=temp;
//				}
//			}
//		}
//		
//	System.out.println(Arrays.toString(n));
//	
//	System.out.println("Second Smallest "+n[1]);
//	System.out.println("Second Largest "+n[n.length-2]);
//		
//		int a=10;
//		int b=20;
//		
//		System.out.println("Amit"+b+a);
//		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		FileHandler.copy(ts.getScreenshotAs(null), null);
		
//		WebElement element=driver.findElement(By.id(""));
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wt.until(ExpectedConditions.visibilityOf(element));
//
//		Select s=new Select(element);
//		s.selectByVisibleText("");
//		s.selectByIndex(1);
//		s.selectByValue("");
//
//		Alert a=driver.switchTo().alert();
//		a.getText();
//		a.accept();
//		a.dismiss();
//
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("path"));
//		
//		List<WebElement> list=driver.findElements(By.id(""));
		
//		int n=3443;
//		int rev=0;
//		int t=n;
//
//		while(n!=0)
//		{
//		int rem=n%10;
//		rev=rev*10+rem;
//		n=n/10; 
//
//		}
//		 
//		 if(t==rev)
//		 {
//			 System.out.println("Yes");
//		 }
//		 else
//		 {
//			 System.out.println("No");
//		 }
//		
//		for (int i=1; i<=5; i++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//		
		
		String s=new String("Amit Yadav");
		
		s.concat("Yadav");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("Amit");
		sb.append("Yadav");
		System.out.println(sb);
		
		int len=0;
		for (char c: s.toCharArray())
		{
			len++;
		}
		System.out.println(len);
		
		
	}
}
