package be.bertpeters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by bpeters on 4/10/2018.
 */
public class openBrowser {
    public static void main(String[] args) throws InterruptedException {}
        String url;


        public void setUp(){
            WebDriver browser = new ChromeDriver();
        }

        public void navigateToUrl(String url) throws InterruptedException {
            //browser.get(url);
            System.out.println("Opening browser and navigating to: " + url);
            Thread.sleep(3000);
        }

        public void tearDown(){
            //browser.quit();

        }
        //browser.close();

    }

