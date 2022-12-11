package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page103 {
	WebDriver driver;

	public Page103(WebDriver driver) {

		this.driver = driver;
	}

	// List of Elements
	@FindBy(how = How.ID_OR_NAME, using = "data")
	WebElement addTextElement;
	@FindBy(how = How.CSS, using = "input[value='Add']")
	WebElement addButton;
	@FindBy(how = How.ID_OR_NAME, using = "allbox")
	WebElement toggleallbutton;
	@FindBy(how = How.XPATH, using = "//input[@type = 'checkbox' ]")
	List<WebElement> allCheckBox;
	@FindBy(how=How.CSS,using="input[value='Remove'")
	WebElement removebutton;
	@FindBy(how = How.CSS,using="input[name='todo[0]']")
	WebElement firstCheckBox;

	// Corresponding methods

	public void createlist(String text) {
		addTextElement.sendKeys(text);
		addButton.click();
	}

	public void clickonaddbutton() {
		addButton.click();
	}

	public void clickontoggleallbutton() {

		if (allCheckBox.size() > 1) {
			toggleallbutton.click();
		} else {
			createlist("Pradyumna");
            createlist("Anirudha");
            createlist("Sankarshana");
            createlist("Vasudeva");
            createlist("Narayana");
			toggleallbutton.click();
		}
		}

	

	public void select1CheckBoxandremove () {
		
		firstCheckBox.click();
			removebutton.click();
		}

	public void toggleAllandRemove () {
		
		toggleallbutton.click();
		removebutton.click();
		}

	public boolean validateToggleAllButton() {
		boolean checkedAllCheckbox = false;
     for(int i=0;i<allCheckBox.size();i++) {
    	 if(allCheckBox.get(i).isSelected()) {
    		 checkedAllCheckbox = true;
    	 }
     	 
     }
		  
		
		return checkedAllCheckbox;
		
	}
	
	public int getCheckboxNumber() {
		
	return	allCheckBox.size();
	
		
	}

}
