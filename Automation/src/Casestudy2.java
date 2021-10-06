import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Casestudy2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Drive\\Automation\\latestEdge\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebDriverWait Wait=new WebDriverWait(driver, 20);
	
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		driver.findElement(By.id("food")).sendKeys("300");
		Thread.sleep(1000);
		driver.findElement(By.id("clothing")).sendKeys("200");
		Thread.sleep(1000);
		driver.findElement(By.id("shelter")).sendKeys("250");
		Thread.sleep(1000);
		driver.findElement(By.id("monthlyPay")).sendKeys("1500");
		Thread.sleep(1000);
		driver.findElement(By.id("monthlyOther")).sendKeys("400");
		Thread.sleep(1000);
		
		String MonthExpense = driver.findElement(By.xpath("//*[@id=\"totalMonthlyExpenses\"]")).getAttribute("value");
		
		String Monthincome = driver.findElement(By.xpath("//*[@id=\"totalMonthlyIncome\"]")).getAttribute("value");
		
		System.out.println("Total Monthly Expense is " +MonthExpense);
		System.out.println("Total Monthly Income is " +Monthincome);
		driver.close();

	}

}
