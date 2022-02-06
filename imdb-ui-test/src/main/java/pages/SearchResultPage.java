package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePageObject {
	
	private By firstResultLocator = By.xpath("(//h3[contains(text(), 'Titles')]/following-sibling::table/tbody/tr/td[@class='result_text']/a)[1]");

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}
	
	public SeriesPage seriesPage() {
		click(firstResultLocator, 10);
		return new SeriesPage(driver);
	}

}
