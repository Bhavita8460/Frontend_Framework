package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import globalResources.GlobalStatic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Base {
    public void launchBrowser()throws IOException {
        openSpecificBrowser("Chrome");

        GlobalStatic.driver.manage().window().maximize();
        GlobalStatic.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void openSpecificBrowser(String browser){
        if(browser.equals("Chrome")|| browser.equals("chrome") ) {
            GlobalStatic.driver = new ChromeDriver();
        }
        if(browser.equals("Firefox")|| browser.equals("firefox") || browser.equals("FF") )
        {
            GlobalStatic.driver = new FirefoxDriver();
        }
        if (browser.equals("Edge")) {
            GlobalStatic.driver = new EdgeDriver();
        }
    }


}
