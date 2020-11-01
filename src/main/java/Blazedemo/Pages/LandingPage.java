package Blazedemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LandingPage {


        WebDriver driver;
        By TITLEOFPAGE = By.xpath("/html/body/div[2]/div/h1");
        By DEPCITY = By.name("fromPort");
        By DESTCITY = By.name("toPort");
        By FINDFLIGHT = By.xpath("//input[@type='submit' and @value='Find Flights']");
        By HOME = By.xpath("/html/body/div[1]/div/div/a[3]");

        public LandingPage(WebDriver driver)
        {
            this.driver = driver;

        }

        public String getTitleofPage()
        {
            return driver.findElement(TITLEOFPAGE).getText();

        }

        public void SelectDepCity(String DEPCITY1)
        {
            WebElement ele = driver.findElement(DEPCITY);
            Select SelDepCity = new Select(ele);
            SelDepCity.selectByValue(DEPCITY1);

        }

        public void SelectDestCity(String DESTCITY1)
        {

            WebElement ele1 = driver.findElement(DESTCITY);
            Select SelDestCity = new Select(ele1);
            SelDestCity.selectByValue(DESTCITY1);

        }

        public void FindFlights()
        {
            driver.findElement(FINDFLIGHT).click();
        }


    }


