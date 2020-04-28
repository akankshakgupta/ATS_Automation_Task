import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

    public static WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream(".//src//main//resources//data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");

        System.out.println(browserName);
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", ".//exeFile//chromedriver.exe");
            driver = new ChromeDriver();


        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", ".//exeFile//geckodriver.exe");
            WebDriver driver = new FirefoxDriver();

        } else if (browserName.equals("IE")) {
            System.setProperty("webdriver.ie.driver", ".//exeFile//IEDriverServer.exe");
            WebDriver driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }


    public void getScreenshot(String result) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src, new File(System.getProperty("user.dir") +"\\src\\test\\java\\Screenshot\\"+ result +"screenshot.png"));



    }
}
