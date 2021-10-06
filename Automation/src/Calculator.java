import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Calculator {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Drive\\Automation\\latestEdge\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org//");
		driver.findElement(By.id("homeval")).sendKeys("4000");
		driver.findElement(By.name("param[downpayment]")).sendKeys("400");
		driver.findElement(By.name("param[downpayment_type]")).click();
		driver.findElement(By.name("param[interest_rate]")).sendKeys("5.5");
		driver.findElement(By.name("cal")).click();
		String total = driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		System.out.println("Price= "+total);
		driver.close();
	}
	

}
