
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	

	 WebDriver driver;
	 By email =By.id("email");
	 By pwd = By.id("pass");
	 By login = By.id("send2");

	public Login(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void typeEmail(String usn)
	{
		driver.findElement(email).sendKeys(usn);
	}
	
	public void typePassward(String p)
	{
		driver.findElement(pwd).sendKeys(p);
	}
	
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
	 
}
