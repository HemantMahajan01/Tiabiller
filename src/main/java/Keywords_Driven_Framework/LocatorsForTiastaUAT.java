package Keywords_Driven_Framework;

import org.openqa.selenium.WebElement;

public interface LocatorsForTiastaUAT {
	String Username="//input[@id='username']";
	String Password="//input[@id='password']";
	String LoginBTN="//button[@type='submit']";
	//String CreateClaim="//button[@aria-label='Create Claims']";
    String FromDateCrossBTN="(//button[@type='button'])[13]";
String Search="//button[contains(text(),'Search')]";
String CreateClaim="//button[@aria-label=\"Create Claims\"]";
String ThreeLines="//div[@class='_menuTrigger_fbrkl_39']";
String Refering="(//li[contains(.,'Referring Provider Management')])[2]";
String Configuration="(//div[@class='MuiAccordionSummary-content css-1n11r91'])[1]";
String proviTextBox="//input[@placeholder=\"Provider Name\"]";
String RefSearch="//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedAccent MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorAccent MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedAccent MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorAccent MuiButton-disableElevation btn-normal css-1rpbjkv\"]";
String EditRef="(//button[@type=\"button\"])[15]";
String Taxonomy="//button[contains(text(),'Speciality and Taxonomy')]";
String Rendering="//a[contains(text(),'Rendering Provider Management')]";
String RendText="//input[@id=\"providerName\"]";
String RendSearch="(//button[@type=\"button\"])[12]";
String RendEdit="(//button[@type=\"button\"])[14]";
String SynBTN="(//button[@role=\"tab\"])[2]";
String ServicLo="//a[contains(text(),'Service Location')]";
String ServiceText="//input[@name=\"name\"]";
String SearchServ="//button[contains(text(),'Search')]";
String options="//li[contains(.,'Reef')]";
String SerEdit="(//button[@type=\"button\"])[15]";
}

