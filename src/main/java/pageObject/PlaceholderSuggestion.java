package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PlaceholderSuggestion {
    public WebDriver driver;

    By email= new  By.ByXPath("//input[@name='email']");
    By password= new  By.ByXPath("//input[@name='password']");
    By submit= new  By.ByXPath("//button[@type='submit']");

    By template = new By.ByXPath("//p[contains(text(),'Template Management')]");
    By viewtemplate = new By.ByXPath("//p[contains(text(),'View Mail Template')]");
    By edit = new By.ByXPath("//tr[1]//td[3]//div[1]//a[1]//i[1]");

    By table = new By.ByXPath("//tr[2]//td[7]");
    By placeholder = new By.ByXPath("//tr[2]//td[1]//a[1]");




    public PlaceholderSuggestion (WebDriver driver) {

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
        return driver.findElement(submit);
    }

    public WebElement clickTemplate()
    {
        return driver.findElement(template);
    }
    public WebElement viewTemplate()
    {
        return driver.findElement(viewtemplate);
    }
    public WebElement editTemplate()
    {
        return driver.findElement(edit);
    }

    public WebElement clickTable()
    {
        return driver.findElement(table);
    }

    public void clickPlaceholder()  {



        WebElement element = driver.findElement(placeholder);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);





    }

}
