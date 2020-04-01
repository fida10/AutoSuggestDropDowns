import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "//Users//fida10//selenium//drivers//chrome//chromedriver");
		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		dr.get("https://ksrtc.in/oprs-web/");
		HandlingAutoDropDown.selectInputBox(dr, "fromPlaceName", "Beng");
		HandlingAutoDropDown.selectAutoDropDown(dr, "ui-id-1", "li", "BENGALURU INTERNAT"); //this part is usually at the bottom of the page, play with html to find it.
	}
}
