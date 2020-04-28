package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Trf {

    public WebDriver driver;

    By email= new  By.ByXPath("//input[@name='email']");
    By password= new  By.ByXPath("//input[@name='password']");
    By login= new  By.ByXPath("//button[@type='submit']");
    By trf = new By.ByXPath("//p[contains(text(),'TRF Management')]");
    By add = new By.ByXPath("//p[contains(text(),'Add TRF')]");
    By department = new By.ByXPath("//select[@id='department_id']");
    By bu = new By.ByXPath("//select[@id='buhead']");
    By  technology = new By.ByXPath("//input[@placeholder='Technology']");
    By designation = new By.ByXPath("//select[@id='designation']");
    By qualification = new By.ByXPath("//input[@class='select2-search__field']");
    By ctc = new By.ByXPath("//input[@placeholder='CTC Range']");
    By vacancy = new By.ByXPath("//input[@placeholder='Total number of Vacancies']");
    By location = new By.ByXPath("//div[11]//div[1]//input[2]");
    By notice = new By.ByXPath("//div[12]//div[1]//input[2]");
    By skills = new By.ByXPath("//textarea[@placeholder='Mandatory Technical Skills.']");
    By technicalskill = new By.ByXPath("//textarea[@placeholder='Good to have Technical Skills.']");
    By responsibilities = new By.ByXPath("//textarea[@placeholder='Responsibilities.']");
    By manager = new By.ByXPath("//input[@placeholder='Reporting Manager']");
    By exp = new By.ByXPath("//input[@placeholder='Experience']");
    By attribute = new By.ByXPath("//textarea[@placeholder='Personality Attributes/ Traits.']");
    By authorize = new By.ByXPath("//input[@placeholder='Authorized Body']");
    By submit = new By.ByXPath("//button[@class='btn btn-primary btn-sm']");


    public Trf (WebDriver driver) {

        this.driver=driver;
    }

    public WebElement Email()
    {
        return driver.findElement(email);
    }
    public WebElement Password()
    {
        return driver.findElement(password);
    }
    public WebElement Login()
    {
        return driver.findElement(login);
    }

    public WebElement getTrf()
    {
        return driver.findElement(trf);
    }
    public WebElement addTRF()
    {
        return driver.findElement(add);
    }

    public void addDepartment()
    {
        Select dep = new Select(driver.findElement(department));
        dep.selectByValue("16");
    }
    public void addBU()
    {

        Select bunit = new Select(driver.findElement(bu));
        bunit.selectByVisibleText("QA");
    }
    public WebElement addTechnology()
    {
        return driver.findElement(technology);

    }
    public void addDesignation()
    {
        Select bu = new Select(driver.findElement(designation));
        bu.selectByVisibleText("Quality Engineer");

    }
    public void addQualification()
    {
        WebElement textbox = driver.findElement(qualification);
        textbox.sendKeys(Keys.ENTER);



    }
    public WebElement addCtc()
    {
        return driver.findElement(ctc);
    }

    public WebElement totalVacancy()
    {
        return driver.findElement(vacancy);
    }
    public WebElement addLocation()
    {
        return driver.findElement(location);
    }
    public WebElement addNotice()
    {
        return driver.findElement(notice);
    }
    public WebElement addSkills()
    {
        return driver.findElement(skills);
    }
    public WebElement addTechnicalSkills()
    {
        return driver.findElement(technicalskill);
    }
    public WebElement addResponsibilities()
    {
        return driver.findElement(responsibilities);
    }
    public WebElement addReportingManager()
    {
        return driver.findElement(manager);
    }
    public WebElement addExperience()
    {
        return driver.findElement(exp);
    }
    public WebElement addPersonalityAttribute()
    {
        return driver.findElement(attribute);
    }
    public WebElement authorizedBy()
    {
        return driver.findElement(authorize);
    }
    public void submit()
    {
        WebElement element = driver.findElement(submit);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }





}
