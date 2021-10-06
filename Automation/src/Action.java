import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Drive\\Automation\\Edge Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println("Title " +driver.getTitle());
		Thread.sleep(4000);	
		Actions Per=new Actions(driver);
		Per.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.className("nav-action-inner")).click();
		driver.close();
	}

}
// incomplete