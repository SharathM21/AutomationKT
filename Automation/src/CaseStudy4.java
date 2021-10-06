import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CaseStudy4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Drive\\Automation\\Edge Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		System.out.println("Title of Gmail " +driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		Set<String> GID=driver.getWindowHandles();
		Iterator<String> GIT=GID.iterator();
		String Gparent=GIT.next();
		String GChild=GIT.next();
		driver.switchTo().window(GChild);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}	
