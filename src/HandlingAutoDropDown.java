import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HandlingAutoDropDown {
	public static void selectInputBox(WebDriver dr, String inputBoxID, String searchBoxKeys){
		Actions a = new Actions(dr);
		WebElement inputBox = dr.findElement(By.id(inputBoxID));
		a.moveToElement(inputBox).click().sendKeys(searchBoxKeys).build().perform();
	}
	public static void selectAutoDropDown(WebDriver dr, String autoDropDownID, String dropDownElementsTag, String desiredDropDownOpt){
		WebElement inputBox = dr.findElement(By.id(autoDropDownID));
		List<WebElement> autoDropDownOptions = inputBox.findElements(By.tagName(dropDownElementsTag));
		for(int i = 0; i < autoDropDownOptions.size(); i++){
			String autoDropOpt = autoDropDownOptions.get(i).getText();
			System.out.println("Option available is: " + autoDropOpt);
			if(autoDropOpt.contains(desiredDropDownOpt)){
				System.out.println("Element match!");
				autoDropDownOptions.get(i).click();
				break;
			}
		}
	}
}
