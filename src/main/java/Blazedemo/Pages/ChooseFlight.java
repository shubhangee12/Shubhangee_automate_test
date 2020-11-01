package Blazedemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChooseFlight {

    WebDriver driver;
    By CHOOSEFLIGHT =By.xpath("//input[@type='submit' and @value='Choose This Flight']");
    By TITLEOFPAGE = By.xpath("/html/body/div[2]/h3");

    public ChooseFlight(WebDriver driver)
    {
        this.driver= driver;
    }

    public void SelectFlight() {
        driver.findElement(CHOOSEFLIGHT).click();
    }

    public String getTitleofPage()
    {
        return driver.findElement(TITLEOFPAGE).getText();

    }

}
