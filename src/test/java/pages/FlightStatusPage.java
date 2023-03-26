package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class FlightStatusPage {
    public FlightStatusPage() {
       PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "headPrimary4")
    private WebElement flightStatusLink;
    public void flightStatusLinkClick(){
        flightStatusLink.click();
    }

    @FindBy(className = "calDispValueCont icon-Calendar focusable-element")
    private WebElement searchByDate;
    public void searchByDateClick(){
        searchByDate.click();
    }

    @FindBy(className = "form-control mb-2 mb-sm-0 input-mobile-tab-class ng-pristine ng-valid ng-touched")
    private WebElement flightNumber;
    public void flightNumberClick(){
        flightNumber.click();
    }

    @FindBy(id = "departcitylink")
    private WebElement from;
    public void fromClick(){
        from.click();
    }

    @FindBy(id = "arrivalcitylink")
    private WebElement to;
    public void toClick(){
        to.click();
    }

    @FindBy(xpath = "//*[@id=\"primaryPanel4\"]/div/form/div/div[4]/div/div[3]/a ::div/following-sibling::div/a")
    private WebElement reverse;
    public void reverseClick(){
        reverse.click();
    }

    @FindBy(id = "btn-flight-sts-submit")
    private WebElement submitButton;
    public void submitButtonClick(){
        submitButton.click();
    }

}
