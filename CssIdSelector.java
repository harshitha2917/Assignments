package cssselector;
//Assignment-107
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//syntax-> #id_value
public class CssIdSelector {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		ele.sendKeys("shoe");
		ele.sendKeys(Keys.ENTER);
			
	}

}
