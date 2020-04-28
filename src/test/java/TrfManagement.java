import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.Trf;

import java.io.IOException;

public class TrfManagement  extends base{
    public static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeTest
    public void initialize() throws IOException {
        driver= initializeDriver();

    }
    @Test
    public void TrfTab() {
        driver.get(prop.getProperty("url"));


        Trf t = new Trf(driver);
        t.Email().sendKeys("akankshakgupta@gmail.com");
        t.Password().sendKeys("secret");
        t.Login().click();
        t.getTrf().click();
        log.info("Successfully click on TRF Tab");
        t.addTRF().click();
        log.info("Successfully click on Add Tab");
        t.addDepartment();
        log.info("The Department is added");
        t.addBU();
        log.info("Business Unit is added");
        t.addTechnology().sendKeys("Automation Testing");
        log.info("Technology is added");
        t.addDesignation();
        log.info("Designation is added");
        t.addQualification();
        log.info("Qualification is added");
        t.addQualification();
        t.addCtc().sendKeys("4 to 5");
        log.info("CTC is added");
        t.totalVacancy().sendKeys("5");
        log.info("Vacancy is added");
        t.addLocation().click();
        log.info("Location is added");
        t.addNotice().click();
        log.info("Notice period added");
        t.addSkills().sendKeys("Selenium\n" +
                "Project Management");
        log.info("Desired skill added");
        t.addTechnicalSkills().sendKeys("Must have knowledge of selenium\n" +
                "Knowledge of any testing tool");
        log.info("Technical skill added");
        t.addResponsibilities().sendKeys("Managing the overall project independently with the guidance of senior team members.\n" +
                "Ensure the project is delivered on time(hours/cost) with the agreed quality");
        log.info("Responsibilities is added ");
        t.addReportingManager().sendKeys("Manoj Mehra");
        log.info("Reporting manager is added");
        t.addExperience().sendKeys("2 to 3 year");
        log.info("Experience is added");

        t.addPersonalityAttribute().sendKeys("Good Communication skill\n" +
                "Punctual");
        log.info("Personality Attribute is added");
        t.authorizedBy().sendKeys("Prateek Gera");
        log.info("Authorized body is added");
        t.submit();
        log.info("Successfully TRF is added");

    }
    @AfterTest
    public void teardown()
    {
        driver.close();
        driver=null;

    }




}
