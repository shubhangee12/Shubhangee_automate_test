package Blazedemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {

    WebDriver driver;
    By TITLEOFGPAGE = By.xpath("/html/body/div[2]/div/h1");
    By CONFIRMATIONID =By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]");

    public ConfirmationPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public String getTitleofPage()
    {
        return driver.findElement(TITLEOFGPAGE).getText();
    }

    public String getConfirmationId()
    {
        return driver.findElement(CONFIRMATIONID).getText();
    }



}
