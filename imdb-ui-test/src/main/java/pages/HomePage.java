package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePageObject{
	
	private String url = "https://www.imdb.com/";
	private By searchButton = By.xpath("//input[@id='suggestion-search']");

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void openPage () {
		openUrl(url);
	}
	
	public SearchResultPage searchSeries(String seriesName) {
		setText(searchButton, seriesName + Keys.ENTER, 10);
		return new SearchResultPage(driver);
	}
}
