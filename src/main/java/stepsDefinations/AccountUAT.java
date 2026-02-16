package stepsDefinations;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
import Keywords_Driven_Framework.KeywordsUAT;
import Keywords_Driven_Framework.LocatorsForTiastaUAT;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AccountUAT {
	WebDriver driver;
	 KeywordsUAT key= new KeywordsUAT();
	
	 
	/**
	 * Verify the application is logging with correct credentials.
	 */
	@Given ("Firefox Broser open")
	public void BrowserOpen() {
		key.OpenBrowser("firefox");
	}
	@And  ("Browser should Maximize")
	public void Maximize() {
		key.Maximize();
	}
	@And  ("Application url should enter and application should open")
	public void URL() {
		key.UrlLaunch("https://tiabilleruat.tiatech.net/login");
		
	}
	@When ("User should be enter the valid username and password")
	public void UserNPass() throws InterruptedException {
	//	key.javascriptexecutor(LocatorsForTiastaUAT.Username, "jayrambv2");
		key.jsClick(LocatorsForTiastaUAT.Username);
		
		key.SendKeys(LocatorsForTiastaUAT.Username, "jayrambv2");
		key.jsClick(LocatorsForTiastaUAT.Password);
		key.SendKeys(LocatorsForTiastaUAT.Password, "Jayaram@54321");
	}
	@And  ("Click on Login in button")
	public void BTN() throws InterruptedException {
		key.Click(LocatorsForTiastaUAT.LoginBTN);		
		Thread.sleep(100);
	}
	@And  ("User should wait for getting Screen shot")
	public void waiting() throws IOException, InterruptedException {
		//key.Wait();
		Thread.sleep(100);
	}
	@Then ("User should get Screen shot")
	public void image() throws IOException {
		key.Screenshot("LoginApp");
	}
	@Then ("Broswser should closed")
	public void close() {
		key.TearDown();
		
	}
	/**
	 * Verify that search button functionality
	 * @throws InterruptedException 
	 */
//	@And ("Click on Create claim button")
//	public void createClaim() throws InterruptedException {
//		//Thread.sleep(1000);
//		
//		key.ActionForMove(LocatorsForTiastaUAT.CreateClaim);
//
//	}
//	@And ("User should click on from date cross button")
//	public void clickCross() throws InterruptedException {
//		//key.Wait();
//		//Thread.sleep(1000);
//		//key.javascriptexecutor(driver,LocatorsForTiastaUAT.FromDateCrossBTN);
//		
//		key.ActionForMove(LocatorsForTiastaUAT.FromDateCrossBTN);
//		
//	}
//	@And ("click on Search button")
//	public void ClickSearch() {
//		key.waitsearch();;
//	}
	/**
	 * Verify that search button functionality for Refering provider page.
	 *  
	 */
	@And ("Click on Three line,Configuration,Refering provider button")
	public void clickThreeLines() throws InterruptedException {
	Thread.sleep(20000);
		key.Click(LocatorsForTiastaUAT.ThreeLines);
		Thread.sleep(2000);
		key.ActionForMove(LocatorsForTiastaUAT.Configuration);
		//key.Click(LocatorsForTiastaUAT.Configuration);
		Thread.sleep(2000);
		key.Click(LocatorsForTiastaUAT.Refering);
			
	}
	@And ("Enter Valid provider name")
	public void providrtext() throws InterruptedException {
		Thread.sleep(1000);
		key.SendKeys(LocatorsForTiastaUAT.proviTextBox, "Dave Walker");
		
	}
	@And ("click on Search button")
	public void SeARCH() throws InterruptedException {
		Thread.sleep(1000);
		key.Click(LocatorsForTiastaUAT.RefSearch);
		
		
	}
	@And("Click on Edit button")
	public void EditBTN() throws InterruptedException {
		Thread.sleep(1000);
		key.Click(LocatorsForTiastaUAT.EditRef);
		
	}@And ("Click on Speciality and taxonomity")
	public void specialityAndtaxonomity() throws InterruptedException {
		Thread.sleep(1000);
		key.Click(LocatorsForTiastaUAT.Taxonomy);
	}
	/*
	 * Verify that search button functionality for Rendering provider page.
	 */
	@And ("Click on  line,Configuration,rendering provider button")
	public void CLKRefering() throws InterruptedException {
		KeywordsUAT key= new KeywordsUAT();
		Thread.sleep(20000);
		key.Click(LocatorsForTiastaUAT.ThreeLines);
		Thread.sleep(2000);
		key.ActionForMove(LocatorsForTiastaUAT.Configuration);
		//key.Click(LocatorsForTiastaUAT.Configuration);
		Thread.sleep(2000);
		key.Click(LocatorsForTiastaUAT.Rendering);
	}
	@And ("Enter Valid Rendering name")
	public void enterRend() throws InterruptedException {
		Thread.sleep(1000);
		//key.javascriptexecutor1(driver, LocatorsForTiastaUAT.RendText);
		key.SendKeys(LocatorsForTiastaUAT.RendText, "Kumar V2 Jayram");
	}
	@And ("click on RendSearch button")
	public void searchRed() throws InterruptedException {
		Thread.sleep(1000);
key.Click(LocatorsForTiastaUAT.RendSearch);

		
	}
	

/*
 * 
 * Verify that Edit button functionality for Rendering provider page
 *
 */
@And ("Click on RendEdit button")
public void EditButton() throws InterruptedException {
	Thread.sleep(1000);
	key.Click(LocatorsForTiastaUAT.RendEdit);	
}
@When ("Click on Speciality and taxonomy")
public void SyButton() throws InterruptedException {
	Thread.sleep(1000);
	key.Click(LocatorsForTiastaUAT.SynBTN);
}
/*
 * Scenario: Verify that search button functionality for Service Location page.
 */
@And ("Click on  line,Configuration,Service Location button")
public void ClickServiceLoc() throws InterruptedException {
	Thread.sleep(20000);
	key.Click(LocatorsForTiastaUAT.ThreeLines);
	Thread.sleep(2000);
	key.ActionForMove(LocatorsForTiastaUAT.Configuration);
	//key.Click(LocatorsForTiastaUAT.Configuration);
	Thread.sleep(2000);
	key.Click(LocatorsForTiastaUAT.ServicLo);	
}
@And ("Enter Valid Service Location name")
public void EnterService() throws InterruptedException {
	Thread.sleep(1000);
//	key.SendKeys(LocatorsForTiastaUAT.ServiceText, "Novo Hospital");
//	key.Click(null);
	//List<WebElement> options=KeywordsUAT.driver.findElements(By.cssSelector(LocatorsForTiastaUAT.ServiceText));
//	for(WebElement option:options){
//
//	    if (option.getText().equalsIgnoreCase("TestServiceLocation")){
//	        option.click();
//	        break;
	        //System.out.println();
	
	  key = new KeywordsUAT();
//		WebElement dropdownBtn = KeywordsUAT.driver.findElement(By.xpath(LocatorsForTiastaUAT.ServiceText));
//		dropdownBtn.click();	
//		key.javascriptexecutor1(driver, LocatorsForTiastaUAT.ServiceText);
//		key.SendKeys(LocatorsForTiastaUAT.ServiceText, "Reef Medical");
//		 
//		List<WebElement> opts = driver.findElements(By.xpath("//*[@role='option']"));
//		for (WebElement o : opts) {
	  key.jsClick(LocatorsForTiastaUAT.ServiceText);
		key.SendKeys(LocatorsForTiastaUAT.ServiceText, "Reef Medical");
	
	key.jsClick(LocatorsForTiastaUAT.options);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(.,'Growth')]"))).click();
		 

//		System.out.println(o.getText());
		}
	    
	
																	 
@And ("click on ServiceSearch button")
public void searchServClick() {
	key.Click(LocatorsForTiastaUAT.SearchServ);
}
/*
 * Verify that Edit button functionality for Service Location page.
 */
@And ("Click on ServiceEdit button") 
public void EditService() {
	key.jsClick(LocatorsForTiastaUAT.SerEdit);

}

}
