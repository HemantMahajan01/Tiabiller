package Keywords_Driven_Framework;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

import javax.imageio.ImageIO;

//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


	public class KeywordsUAT {
		
		public static WebDriver driver;
		//WebDriver driver;
		// KeywordsUAT key= new KeywordsUAT();

	
//	public static final Logger log= Logger.getLogger(Keywords.class);

	   
	
		public void OpenBrowser(String browserName) {
			
			if(browserName.equalsIgnoreCase("Chrome")) {
				driver= new ChromeDriver();
			//	log.info("ChromeBrowser is Lauch");
			}else if(browserName.equalsIgnoreCase("Edge")) {
				driver= new EdgeDriver();
			//	log.info("EdgeBrowser is Lauch");
			}else if(browserName.equalsIgnoreCase("Firefox")) {
				driver= new FirefoxDriver();
			//	log.info("FirefoxBrowser is Lauch");
			}else {
				System.out.println("Invalid Browser ");
			}

		}
		public void UrlLaunch(String url) {
			driver.get(url);

		}
		public void Maximize() {
			driver.manage().window().maximize();	
		}
//		public void Click(String element) {
//			driver.findElement(By.xpath(element)).click();
//		}
		public void Click(String element) {
		    if (driver == null) {
		        throw new RuntimeException("Driver is NULL. Browser not opened before click.");
		    }
		    driver.findElement(By.xpath(element)).click();
		}

		public void SendKeys(String element,String text) {
			driver.findElement(By.xpath(element)).sendKeys(text);	
		}
		public String GetText(String element) {
			return driver.findElement(By.xpath(element)).getText();
		}
		public void WaitCrossS() {
//			fluent.withTimeout(Duration.ofMillis(600000));
//			fluent.pollingEvery(Duration.ofMillis(60000));
//			fluent.withMessage("Element is not found in 60 second");
//			fluent.ignoring(Exception.class);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			WebElement fromDate = wait.until(
			    ExpectedConditions.presenceOfElementLocated(
			        By.xpath("//input[@name='fromDate']")
			    )
			);
			
		}
		public void waitsearch() {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement fromDate = wait1.until(
			    ExpectedConditions.presenceOfElementLocated(
			        By.xpath("(//button[@tabindex=\\\"0\\\"])[11]")
			    )
			);
			
		}
		
		
		
		public void Screenshot(String classNmae) throws IOException {
			AShot as = new AShot();
			as.shootingStrategy(ShootingStrategies.viewportPasting(20000));
			Screenshot sc=as.takeScreenshot(driver);
			BufferedImage img=sc.getImage();
			ImageIO.write(img, "jpg",new File(classNmae+"Tiastat.jpg"));
		}
		public void TearDown() {
			driver.close();
			
		}
		  
		  public void clear(String element) {
				driver.findElement(By.xpath(element)).clear();;
			}
		  public void wait2() {
			  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));			
		}
 public void ActionForMove(String xpath) {
	 By locator = By.xpath(xpath);

	    WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(ExpectedConditions.elementToBeClickable(locator));

	    Actions actions = new Actions(driver);
	    actions.moveToElement(element)
	           .click()
	           .perform();
		}
 public void jsClick(String xpath) {

	    if (driver == null) {
	        throw new RuntimeException("Driver is NULL. Open browser before JS click.");
	    }

	    WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", element);
	}

 public void ActionForClear(String xpath) {
	 By locator = By.xpath(xpath);

	    WebElement element = new WebDriverWait(driver, Duration.ofSeconds(20))
	            .until(ExpectedConditions.elementToBeClickable(locator));

	    Actions actions = new Actions(driver);
	    actions.moveToElement(element)
	           .click()
	           .perform();
		}
 public static void waitForUiToStabilize(
         WebDriver driver,
         WebElement element // can be null
 ) {

 	new WebDriverWait(driver, Duration.ofSeconds(10))
     .until(d -> (Boolean)
         ((JavascriptExecutor) d).executeScript("""
             const blockers = document.querySelectorAll(
               '.MuiBackdrop-root, div[role="presentation"]'
             );

             if (blockers.length === 0) return true;

             return [...blockers].every(b => {
                 const s = getComputedStyle(b);
                 return s.display === 'none'
                     || s.visibility === 'hidden'
                     || s.opacity === '0'
                     || s.pointerEvents === 'none';
             });
         """)
     );
 	
 }
 
 
 


			
		  }
			
		
		 
	



