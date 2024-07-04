package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.BaseClass;

public class ExecutionClass extends BaseClass {
	
	@Test
	private void test1() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}
