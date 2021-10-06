import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class gettitle {

	public static void main(String[] args) {
		String Searchdata ="Automation QC";
		System.setProperty("webdriver.edge.driver", "C:\\Drive\\Automation\\Edge Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Title " +driver.getTitle());
		//int vsize= driver.findElement(By.tagName("a")).size();
		int vsize=driver.findElements(By.tagName("a")).size();
		
		for(int i=0; i<vsize; i++)
		{
			String vlink = driver.findElements(By.tagName("a")).get(i).getText();
			
						if(vlink=="signin"){
						driver.findElement(By.linkText("Sign in")).click();
						System.out.println("link" +vlink);
						break;
	

		}
		driver.close();
		
	}

}}
