package testbase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import driverFactory.driverfactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.propconfig;
import util.screenshotutils;

public class TestBase {

	public WebDriver driver;
	public WebDriverWait wait;
	static Properties prop;
	static Logger log=Logger.getLogger(TestBase.class.getName()) ;
	
	@Parameters(value="env")
	@BeforeTest
	public void beforetest(String env) throws IOException {
		prop=propconfig.init_propreties(env);
		log.info(env);
	}
	
		
	
	@BeforeMethod
	public void beforeMethod(ITestResult result)
	{
		log.info("Execution started for testcase:"+result.getMethod().getMethodName()+"-----------");
		String browser =prop.getProperty("browser");
		driver =driverfactory.init_driver(browser);
		
		String urlvalue=prop.getProperty("Url");
		driver.get(urlvalue);
		
		wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
	}
	

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE) {
		screenshotutils.takescreenshot(driver ,result.getMethod().getMethodName());
		}
		driver.quit();
	}


}
