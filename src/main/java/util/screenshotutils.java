package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class screenshotutils {
	//convert webdriver object to takescreenshot

	public static void takescreenshot(WebDriver driver, String screenshotName) throws IOException {
		String path=System.getProperty("user.dir");
		String filepath=path+"\\Screenshots\\"+screenshotName+".jpg";
		System.out.println(filepath);
	TakesScreenshot srcshot =(TakesScreenshot)driver;
	File file = srcshot.getScreenshotAs(OutputType.FILE);
	
	try {
	FileUtils.copyFile(file, new File(filepath));

	}
	catch(Exception e) {
	e.printStackTrace();
	}
}
}
