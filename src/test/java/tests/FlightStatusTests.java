package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightStatusPage;
import pages.SkyMilesPage;
import utils.Driver;

public class FlightStatusTests extends TestBase{
    @Test
    public void checkTitle() {
        String homePageTitle = "Delta Air Lines | Flights & Plane Tickets + Hotels & Rental Cars";
        Assert.assertEquals(Driver.getDriver().getTitle(), homePageTitle);
        System.out.println("Page Title matches");
    }

    @Test
    public void menuFSClick(){
        FlightStatusPage FlightStatusPage = new FlightStatusPage();
        FlightStatusPage.flightStatusLinkClick();
//        System.out.println("Button Pressed");
    }

//    @Test
//    public void checkMenu(){
//        WebElement menuVerify = Driver.getDriver().findElement(By.name("viewFlightStatus"));
//        Assert.assertEquals(menuVerify.getText(), "Flight Status", "The menu was not opened");
//        System.out.println("Titles match");
//    }

   // @Test


}


