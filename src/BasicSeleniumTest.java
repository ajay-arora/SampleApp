import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumTest {
   @Test
   public void testA() {
      WebDriver driver = new FirefoxDriver();
      driver.get("http://google.com");
      System.out.println(driver.getTitle()); 
      driver.close();
   }

   @Test
   public void testB() {
       System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\ChromeDriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("http://google.com");
       System.out.println(driver.getTitle()); 
       driver.close();
   }

   @Test
   public void testC() {
      String str= "mno";
      assertEquals("mno",str);
   }
}
