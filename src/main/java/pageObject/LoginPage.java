package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    By email= new  By.ByXPath("//input[@name='email']");
    By password= new  By.ByXPath("//input[@name='password']");
    By submit= new  By.ByXPath("//button[@type='submit']");
    By department= new By.ByXPath("//div[@class='os-content']/nav[@class='mt-2']/ul/li[2]/a[1]/p[1]");
    By reference = new By.ByXPath("//div[@class='os-content']/nav[@class='mt-2']//li[3]/a[1]/p[1]");
    By access= new By.ByXPath("//p[contains(text(),'Access')]");
    By template = new By.ByXPath("//p[contains(text(),'Template Management')]");
    By exit = new By.ByXPath("//p[contains(text(),'Exit Management')]");
    By trf = new By.ByXPath("//p[contains(text(),'TRF Management')]");
    By candidate = new By.ByXPath("//p[contains(text(),'Candidate Management')]");
    By logs = new By.ByXPath("//p[contains(text(),'HR Management Logs')]");





    public LoginPage (WebDriver driver) {

        this.driver=driver;
    }

    public WebElement getEmail()
    {
        return driver.findElement(email);
    }
    public WebElement getPassword()
    {
        return driver.findElement(password);
    }

    public WebElement getLogin()
    {
        return driver.findElement(submit);
    }
    public WebElement departmentTab()
    {
        return driver.findElement(department);
    }
    public WebElement referenceTab()
    {
        return driver.findElement(reference);
    }
    public WebElement accessTab()
    {
        return driver.findElement(access);
    }
    public WebElement templateTab()
    {
        return driver.findElement(template);
    }
    public WebElement exitTab()
    {
        return driver.findElement(exit);
    }
    public WebElement trfTab()
    {
        return driver.findElement(trf);
    }
    public WebElement candidateTab()
    {
        return driver.findElement(candidate);
    }
    public WebElement hrManagementTab()
    {
        return driver.findElement(logs);
    }

}

