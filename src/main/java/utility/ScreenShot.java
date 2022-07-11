package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static String date()
	{
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
		LocalDateTime cutdt=LocalDateTime.now();
		String d=dtf.format(cutdt);
		return d;		
	}
	
	public static void getData(WebDriver driver, String name) throws IOException 
	{
		String d=ScreenShot.date();
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File resource=new File("D:\\Velocity\\SrceenShot\\"+name+d+".jpg");
		FileHandler.copy(source, resource);
		
	}


}
