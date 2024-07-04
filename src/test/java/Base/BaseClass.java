package Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static WebDriver driver;

	public static String getScreenShot() throws IOException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String dynamicDate = sdf.format(date);
		String desty = "C:\\Users\\Lenovo\\eclipse-workspace\\Report\\src\\test\\resources\\Attachments\\screen_"+dynamicDate+".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(desty));
		return desty;
		System.out.println("hi");
	}

}
