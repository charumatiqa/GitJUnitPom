package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Page103;
import util1.BrowserFactory;

public class TestToggleAllButton {
	WebDriver driver;

//	Test Data
	String text = "addTextElement";

	@Before
	public void launchbrowser() {

	driver = BrowserFactory.init();
}

@Test
public void testcase1() {
	Page103 page103 = PageFactory.initElements(driver, Page103.class);
	page103.clickontoggleallbutton();

    Assert.assertTrue(page103.validateToggleAllButton());
}

@Test
public void testcase2(){
	Page103 page103 = PageFactory.initElements(driver, Page103.class);
	int i = page103.getCheckboxNumber();
	System.out.println("checkbox before: " + i);
	page103.select1CheckBoxandremove();
	int j = page103.getCheckboxNumber();
	System.out.println("checkbox after: " + j);
	Assert.assertNotSame(i, j);

     
}

@Test
public void testcase3() {
	Page103 page103 = PageFactory.initElements(driver, Page103.class);
	page103.toggleAllandRemove();
	Assert.assertSame(1, page103.getCheckboxNumber());
}



@After
public void tearDown() {
	BrowserFactory.tearDown();
}

}
