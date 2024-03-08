package Beauty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchSugar_Test {
	@Test
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.sugarcosmetics.com/collections/sugar-x-jbl-2299?utm_source=google&utm_medium=perf_max&utm_campaign=17185724877&adgroupid=&utm_content=&utm_term=&gad_source=1&gclid=EAIaIQobChMI_szZmfPehAMVsx-DAx3howgwEAAYASAAEgJT0PD_BwE");
		driver.findElement(By.xpath("(//div[@class=\"navbarHeadings py-3\"])[1]")).click();
		driver.quit();	
	}
}
