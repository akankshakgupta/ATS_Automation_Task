import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.LoginPage;

import java.io.IOException;

public class Dashboard extends base {
    public static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeTest
    public void initialize() throws IOException {
        driver= initializeDriver();


    }
    @Test
    public void dashboardPage()
    {
        driver.get(prop.getProperty("url"));


        LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys("akankshakgupta@gmail.com");
        lp.getPassword().sendKeys("secret");
        lp.getLogin().click();

       Assert.assertEquals(lp.departmentTab().getText(),"Department");
        log.info("Successfully validated Department Tab");

        Assert.assertEquals(lp.referenceTab().getText(),"Reference");
        log.info("Successfully validated Reference Tab");

        Assert.assertEquals(lp.accessTab().getText(),"Access");
        log.info("Successfully validated Access Tab");

        Assert.assertEquals(lp.templateTab().getText(),"Template Management");
        log.info("Successfully validated Template Management Tab");

        Assert.assertEquals(lp.exitTab().getText(),"Exit Management");
        log.info("Successfully validated Exit Management Tab");

        Assert.assertEquals(lp.trfTab().getText(),"TRF Management");
        log.info("Successfully validated TRF Management Tab");

        Assert.assertEquals(lp.candidateTab().getText(),"Candidate Management");
        log.info("Successfully validated Candidate Management Tab");

        Assert.assertEquals(lp.hrManagementTab().getText(),"HR Management Logs");
        log.info("Successfully validated HR Management  Logs Tab");



    }
    @AfterTest
    public void teardown()
    {
        driver.close();
        driver=null;
    }


}
