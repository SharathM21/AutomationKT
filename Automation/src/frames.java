import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		String Vtext;
		System.setProperty("webdriver.chrome.driver", "C:\\Drive\\Automation\\LatestChorme\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Vtext=driver.findElement(By.className("entery-title")).getText();
		System.out.println(Vtext);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame'")));
		
		Vtext=driver.findElement(By.id("draggable")).getText();
		System.out.println(Vtext);
		
		WebElement Source=driver.findElement(By.id("dragabble"));
		WebElement Dest=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(Source, Dest).build().perform();
		
		driver.switchTo().defaultContent();
		Vtext=driver.findElement(By.className("entry-title")).getText();
		System.out.println(Vtext);
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}

// incomplete