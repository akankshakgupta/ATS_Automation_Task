import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.PlaceholderSuggestion;

import java.io.IOException;

public class Placeholder  extends base{
    public static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeTest
    public void initialize() throws IOException {
        driver= initializeDriver();

    }
    @Test
    public void Placeholder()  {
        driver.get(prop.getProperty("url"));


        PlaceholderSuggestion p = new PlaceholderSuggestion(driver);
        p.Email().sendKeys("akankshakgupta@gmail.com");
        p.Password().sendKeys("secret");
        p.Login().click();
        p.clickTemplate().click();
        log.info("Successfully click on the Template Tab");
        p.viewTemplate().click();
        log.info("Successfully click on the View Template Tab");
        p.editTemplate().click();
        log.info("Successfully click on the Edit Template");
        p.clickTable().click();
        log.info("Successfully click on the Table");
        p.clickPlaceholder();
        log.info("Successfully click on the placeholder");




    }
    @AfterTest
    public void teardown()
    {
        driver.close();
        driver=null;
    }




}
