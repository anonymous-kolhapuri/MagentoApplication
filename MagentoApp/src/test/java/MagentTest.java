

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class MagentTest
{

	public void magento() 
	{
		String url = "http://www.magento.com";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);
		
		Home h = new Home(driver);
		h.clickOnMyAcc();
		
		Login l1 = new Login(driver);
		l1.typeEmail("nitinmanjunath1991@gmail.com");
		l1.typePassward("Welcome123");
		l1.clickLogin();
		
		Logout l2 = new Logout(driver);
		l2.clickOnLogOut();
		
		driver.quit();
		
	}

}
