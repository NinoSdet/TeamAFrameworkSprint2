package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightStatusPage;
import utils.Driver;

import static utils.SeleniumUtils.*;

public class FlightStatusTests extends TestBase{
    @Test
    public void checkTitle() {
        String homePageTitle = "Delta Air Lines | Flights & Plane Tickets + Hotels & Rental Cars";
        waitForTitleIs("Delta Air Lines | Flights & Plane Tickets + Hotels & Rental Cars", 3);
        Assert.assertEquals(Driver.getDriver().getTitle(), homePageTitle);
    }

    @Test
    public void fsClick(){
        waitForClickablility(By.id("headPrimary4"), 3);
        FlightStatusPage FlightStatusPage = new FlightStatusPage();
        FlightStatusPage.flightStatusLinkClick();
    }

    @Test
    public void checkMenu(){
        fsClick();
        WebElement menuVerify = Driver.getDriver().findElement(By.cssSelector("#headPrimary4"));
        elementExists(menuVerify, 3);
    }

    private void searchByDateClick() {
        FlightStatusPage FlightStatusPage = new FlightStatusPage();
        FlightStatusPage.searchByDateClick();
    }
    @Test
    public void checkSearchByDate(){
        fsClick();
        searchByDateClick();
        WebElement calendarVerify = Driver.getDriver().findElement(By.xpath("//*[@id=\"primaryPanel4\"]/div/form/div/div[1]/date-selection-view/div/div/div/div/div[4]"));
        elementExists(calendarVerify, 3);
        WebElement currentDate = Driver.getDriver().findElement(By.xpath("//*[@id=\"primaryPanel4\"]/div/form/div/div[1]/date-selection-view/div/div/div/div/div[4]/div/div[2]/div[1]/div[2]/table/tbody/tr[6]/td[1]"));
        WebElement oneDayBack = Driver.getDriver().findElement(By.xpath("//*parent preceding-sibling::td"));
        oneDayBack.click();
        System.out.println("One Day Back is Ok.");
        oneDayBack.click();
        System.out.println("Two Days Back went through.");

    }




}


