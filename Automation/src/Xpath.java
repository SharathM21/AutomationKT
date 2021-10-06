import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Drive\\Automation\\Edge Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		Thread.sleep(2000);
		//driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Qctest");
		//driver.findElement(By.name("session_password")).sendKeys("qctest");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Qctest");
		driver.findElement(By.xpath("//*[@id='password-visibility-toggle' and @class='button__password-visibility']")).click();
		Thread.sleep(2000);
		
		
		
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.xpath("//div[@id='nav-main']/div[2]/div/div/a[1]")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
