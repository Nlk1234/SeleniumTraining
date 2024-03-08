package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchMettl_Test {
	@Test
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mettl.com/pre-employment-assessment-tests/?ads_cmpid=6751952633&ads_adid=83172002327&ads_targetid=kwd-785616132&ads_loc_intrst=&ads_loc_physcl=9062072&ads_network=g&ads_creative=650293181430&ads_kw_term=skill%20assessment%20test&ads_adposition=&utm_source=adwords&utm_medium=ppc&utm_campaign=6751952633&gclid=EAIaIQobChMIyti95vzehAMVkck8Ah0fzw-oEAAYASAAEgJtrfD_BwE&gad_source=1");
		driver.quit();	
}
}