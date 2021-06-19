import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Hooks {
	public int abc;
	public String screenshot;
	WebDriver driver;
	
	Actions option;
	
	public void NewFunction() {
		option = new Actions(driver);
		option.contextClick().doubleClick().build().perform();
	}

}
