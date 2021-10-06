import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CaseStudy3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		String Searchdata ="Automation QC";
		System.setProperty("webdriver.edge.driver", "C:\\Drive\\Automation\\Edge Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Title " +driver.getTitle());
		driver.findElement(By.name("q")).sendKeys(Searchdata);
		String Search=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).getAttribute("value");
		System.out.println("Search Data Is " +Search);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(4000);
		if (Searchdata.equals(Search)) {
			System.out.println("Search Data is Pass");
		}else
		{
			System.out.println("Searched Data is Fail");
		}
		driver.close();
		

	}
}
