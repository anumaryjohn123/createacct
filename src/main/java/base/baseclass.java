package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.utilclass;

public class baseclass {

	public static WebDriver driver;
	public static Properties prop;
	
	public baseclass() {
		try {
		 prop = new Properties();
		 FileInputStream fis = new FileInputStream("C:/Users/anujo/eclipse-workspace/freecrmpom1/src/main/java/config/config.properties");
		 prop.load(fis);
		}
		catch(FileNotFoundException e)
            {
			e.printStackTrace();
			}
catch(IOException e)
{
	e.printStackTrace();
}
		

}
	public static void intialization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver","C:/Users/anujo/Downloads/chromedriver/chromedriver.exe");
					  
					  driver= new ChromeDriver(); 
					  driver.manage().window().maximize();
					  driver.manage().deleteAllCookies(); 
					  driver.manage().timeouts().pageLoadTimeout(utilclass.page_load_timeout, TimeUnit.SECONDS);
					  driver.manage().timeouts().implicitlyWait(utilclass.implicit_wait, TimeUnit.SECONDS);
					  driver.get(prop.getProperty("url"));
					  
		}
	}
		
	}

