import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CaseStudy1 {

	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter in which browser to execute");
		String browser=Obj.next();
		int i=Integer.parseInt(browser);
		if(i>1)
		{
			System.setProperty("webdriver.edge.driver", "C:\\Drive\\Automation\\latestEdge\\msedgedriver.exe");
			WebDriver driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			String title=driver.getTitle();
			System.out.println("Edge Title is " +title);
			driver.close();
		}
		else
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Drive\\Automation\\LatestChorme\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(" Chrome Title is " +title);
		driver.close();
		}

	}

}
