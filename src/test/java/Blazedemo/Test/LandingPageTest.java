package Blazedemo.Test;

import Blazedemo.Pages.ChooseFlight;
import Blazedemo.Pages.ConfirmationPage;
import Blazedemo.Pages.LandingPage;
import Blazedemo.Pages.PurchaseFlight;
import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LandingPageTest  {

    WebDriver driver;
    LandingPage obj_LandingPage;
    ChooseFlight obj_ChooseFlight;
    PurchaseFlight obj_PurchaseFlight;
    ConfirmationPage obj_ConfirmationPage;
    String driverPath="C:\\Users\\somesh\\Desktop\\Shubha_Automate_test1\\Shubhangee_automate_test\\src\\main\\resources\\Driver\\chromedriver.exe";

    @BeforeTest
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://blazedemo.com/");
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }
    @Test(priority = 0)
    public void Booking_verify_landingpage() {
        obj_LandingPage = new LandingPage(driver);
        String title_home_page = obj_LandingPage.getTitleofPage();
        Assert.assertEquals(title_home_page, "Welcome to the Simple Travel Agency!");
        obj_LandingPage.SelectDepCity("Boston");
        obj_LandingPage.SelectDestCity("Rome");
        obj_LandingPage.FindFlights();
    }

    @Test(priority = 1)
    public void Booking_verify_chooseFlight() {
        obj_ChooseFlight = new ChooseFlight(driver);
        String Title_ChooseFlight = obj_ChooseFlight.getTitleofPage();
        Assert.assertEquals(Title_ChooseFlight, "Flights from Boston to Rome:");
        obj_ChooseFlight.SelectFlight();
    }

    @Test(priority = 2)
    public void Booking_verify_purchasepage() {
        obj_PurchaseFlight = new PurchaseFlight(driver);
        obj_PurchaseFlight.Customerdetails("shubha", "address1", "maha", "Pune", "411014");
        obj_PurchaseFlight.CustomerPaymentdetails("amex", "123123", "02", "2020", "shubh");
        obj_PurchaseFlight.purchaseFlights();
    }

    @Test(priority = 3)
    public void Booking_verify_confirmationpage()
    {
        obj_ConfirmationPage=new ConfirmationPage(driver);
        String ConfID = obj_ConfirmationPage.getConfirmationId();
        System.out.println(ConfID);
        Assert.assertNotNull(ConfID);
        String titleconf = obj_ConfirmationPage.getTitleofPage();
        Assert.assertEquals(titleconf,"Thank you for your purchase today!");

    }




}