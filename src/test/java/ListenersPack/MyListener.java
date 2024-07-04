package ListenersPack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Base.BaseClass;
import Reporter.ReporterManager;

public class MyListener implements ITestListener{
	private BaseClass base;
	private static ExtentReports ext = ReporterManager.generateReport();

	public MyListener() {
		this.base = new BaseClass();
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String screenShotPath;
		WebDriver driver;
		try {
			screenShotPath = base.getScreenShot();
			System.out.println(screenShotPath);

			ext.createTest("test 2").log(Status.INFO, "sec").addScreenCaptureFromPath(screenShotPath);
	        
			ext.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
		ext.flush();
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}
	
	

}
