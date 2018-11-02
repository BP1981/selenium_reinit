package be.bertpeters;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;

public class TestLogin {
    private WebDriver driver;

    @Before
    public void setUp(){
        driver=new ChromeDriver();
    }


    @Test
    public void login_failing(){
        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("Bert Peters");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button")).click();
        assertTrue("success message not present",driver.findElement(By.cssSelector(".flash.error")).isDisplayed());

    }

    @Test
    public void login_success(){
        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button")).click();
        assertTrue("success message not present",driver.findElement(By.cssSelector(".flash.success")).isDisplayed());

    }


    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
       // driver.close();
    }
}
