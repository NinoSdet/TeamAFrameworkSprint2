package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightStatusPage;
import utils.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.apache.commons.lang3.StringUtils.isNumeric;
import static utils.SeleniumUtils.*;

public class FlightStatusTests extends TestBase{
    @Test // Task 54
    public void checkTitle() {
        String homePageTitle = "Delta Air Lines | Flights & Plane Tickets + Hotels & Rental Cars";
        waitForTitleIs("Delta Air Lines | Flights & Plane Tickets + Hotels & Rental Cars", 3);
        Assert.assertEquals(Driver.getDriver().getTitle(), homePageTitle);
    }
    public void fsClick(){
        waitForClickablility(By.id("headPrimary4"), 3);
        FlightStatusPage FlightStatusPage = new FlightStatusPage();
        FlightStatusPage.flightStatusLinkClick();
    }
    public void checkMenu(){
        fsClick();
        WebElement menuVerify = Driver.getDriver().findElement(By.cssSelector("#headPrimary4"));
        elementExists(menuVerify, 3);
    }

    private void searchByDateClick() {
        FlightStatusPage FlightStatusPage = new FlightStatusPage();
        FlightStatusPage.searchByDateClick();
    }
    @Test //Task 55
    public void checkSearchByDate() {
        fsClick();
        searchByDateClick();
        WebElement calendarVerify = Driver.getDriver().findElement(By.xpath("//*[@id=\"primaryPanel4\"]/div/form/div/div[1]/date-selection-view/div/div/div/div/div[4]"));
        elementExists(calendarVerify, 3);
        WebElement currentDate = Driver.getDriver().findElement(By.xpath("//*[@id=\"primaryPanel4\"]/div/form/div/div[1]/date-selection-view/div/div/div/div/div[4]/div/div[2]/div[1]/div[2]/table/tbody/tr[6]/td[2]/a"));
        WebElement oneDayBack = Driver.getDriver().findElement(By.cssSelector("#primaryPanel4 > div > form > div > div.col-lg-3.order-1.offset-md-2.col-md-8.offset-lg-0.pl-xl-0.pl-xxl-0 > date-selection-view > div > div > div > div > div.calenderContainer.flightCalendarContainer > div > div.dl-datepicker-group-wrapper > div.dl-datepicker-group.dl-datepicker-group-0 > div.dl-datepicker-calendar-cont > table > tbody > tr:nth-child(6) > td:nth-child(1) > a"));
        WebElement twoDaysBack = Driver.getDriver().findElement(By.cssSelector("#primaryPanel4 > div > form > div > div.col-lg-3.order-1.offset-md-2.col-md-8.offset-lg-0.pl-xl-0.pl-xxl-0 > date-selection-view > div > div > div > div > div.calenderContainer.flightCalendarContainer > div > div.dl-datepicker-group-wrapper > div.dl-datepicker-group.dl-datepicker-group-0 > div.dl-datepicker-calendar-cont > table > tbody > tr:nth-child(5) > td:nth-child(7) > span"));
        if (Objects.equals(oneDayBack.getAttribute("class"), "dl-state-disabled")) {
            System.out.println("User can't choose a one-days old date.");
        }

        if (Objects.equals(twoDaysBack.getAttribute("class"), "dl-state-disabled")) {
            System.out.println("User can't choose a two-days old date.");
        }

        List<WebElement> allDates = Driver.getDriver().findElements(By.xpath("//div[@class='dl-datepicker-group-wrapper'][not(contains(@class, 'dl-state-disabled'))]"));
        List<String> dates = new ArrayList<>(); // creating a list of visible active dates
        for (WebElement element : allDates) {
            String elementText = element.getText();
            if (isNumeric(elementText)) {
                dates.add(elementText);
            }
            System.out.println(dates);

        }



    }
}
