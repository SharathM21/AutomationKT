import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Drive\\Automation\\LatestChorme\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("Title is " +title);
		driver.close();
	}
	

}
