import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Drive\\Automation\\Edge Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text='Click me!")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@text()='Click me!'])[2]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//button[@text()='Click for Prompt Box']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("sharath");
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		driver.close();
	}

}

// incomplete