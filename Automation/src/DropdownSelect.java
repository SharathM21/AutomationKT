import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Drive\\Automation\\Edge Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org//");
		System.out.println("Title " +driver.getTitle());
		
		Select select=new Select(driver.findElement(By.name("param[start_month]")));
		select.selectByIndex(3);
				Thread.sleep(4000);
		select.selectByValue("6");
		Thread.sleep(4000);
		select.selectByVisibleText("Nov");
		Thread.sleep(4000);
		driver.close();

	}

}
