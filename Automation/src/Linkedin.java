import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkedin {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Drive\\Automation\\latestEdge\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
	}

}
