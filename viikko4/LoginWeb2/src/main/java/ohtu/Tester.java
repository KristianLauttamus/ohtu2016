package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        driver.get("http://localhost:8090");
        System.out.println( driver.getPageSource() );
        WebElement element = driver.findElement(By.linkText("login"));       
        element.click(); 
        
        System.out.println("==");
        
        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));
        element.submit();
        
        System.out.println("==");
        System.out.println( driver.getPageSource() );
        
        element = driver.findElement(By.linkText("logout"));       
        element.click();
        
        System.out.println("----------------------------------");
        
        element = driver.findElement(By.linkText("login"));       
        element.click();
        
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("fail");
        element = driver.findElement(By.name("login"));
        element.submit();
        
        System.out.println("----------------------------------");
        
        element = driver.findElement(By.name("username"));
        element.sendKeys("fail");
        element = driver.findElement(By.name("password"));
        element.sendKeys("fail");
        element = driver.findElement(By.name("login"));
        element.submit();
        
        System.out.println("----------------------------------");
        
        element = driver.findElement(By.linkText("back to home"));       
        element.click();
        element = driver.findElement(By.linkText("register new user"));       
        element.click();
        
        element = driver.findElement(By.name("username"));
        element.sendKeys("test1");
        element = driver.findElement(By.name("password"));
        element.sendKeys("test1234");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("test1234");
        element = driver.findElement(By.name("add"));
        element.submit();
        
        System.out.println("------------------------------------");
        
        element = driver.findElement(By.linkText("continue to application mainpage"));       
        element.click();
        element = driver.findElement(By.linkText("logout"));       
        element.click();
    }
}
