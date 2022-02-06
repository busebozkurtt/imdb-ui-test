package steps;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchResultPage;
import pages.SeriesPage;

public class ImdbSearchSteps {
	
	WebDriver driver;
	HomePage homePage;
	SearchResultPage searchResultPage;
	SeriesPage seriesPage;
	
	@Given("Navigate to Imdb home page")
	public void navigate_to_ımdb_home_page() {
	    this.driver = BaseSteps.driver;
	    homePage = new HomePage(driver);
	    homePage.openPage();
	}
	
	@When("Search {string}")
	public void search(String seriesName) {
	   searchResultPage = homePage.searchSeries(seriesName);
	}
	
	@When("Click first result")
	public void click_first_result() {
	   seriesPage = searchResultPage.seriesPage();
	}
	
	@Then("Check actual name is equal to {string}")
	public void check_actual_name_is_equal_to(String expectedName) {
	   String actualName = seriesPage.getTitleText();
	   assertEquals(actualName,expectedName, "Actual series name is not equal to expected series name. Actual name: " + actualName + " Expected name: " + expectedName);
	}
	
	@Then("Check actual year is equal to {string}")
	public void check_actual_year_is_equal_to(String expectedYear) {
	   String actualYear = seriesPage.getYearText().trim().replace("–", "-");
	   assertEquals(actualYear, expectedYear.trim(), "Actual year is not equal to expected year. Actual year: " + actualYear + " Expected year: "+ expectedYear);
	}
}
