package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AirlinePartnersPage;
import pages.Flights2Page;

public class AirlinePartnersTest  extends TestBase {


    @Test (priority= 1 , groups = {"smoke"})
    public void testAirlinePartnersMenu() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.airlinePartners();
    }

    @Test
    public void testAirlinePartnersDropDownMenu() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.clickAirPartnersDropDownMenu();
    }

    @Test
    public void testAirFrance() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectAirFrance();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "Air France");

    }

    @Test
    public void testAeroMexico() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectAeromexico();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "AeroMexico");
    }

    @Test
    public void testChinaEastern() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectChinaEastern();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "China Eastern");

    }

    @Test
    public void testKlm() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectKLM();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "KLM");

    }

    @Test
    public void testKoreanAir() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectKoreanAir();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "Korean Air");
    }

    @Test
    public void testLatam() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectLatam();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "LATAM");

    }

    @Test
    public void testVirginAtlantic() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectVirginAtlantic();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "Virgin Atlantic");

    }

    @Test
    public void testWestJet() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectWestJet();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "WestJet");
    }
}