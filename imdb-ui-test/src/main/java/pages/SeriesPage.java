package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeriesPage extends BasePageObject{

	private By titleLocator = By.xpath("//h1[@data-testid='hero-title-block__title']");
	private By yearLocator = By.xpath("(//ul[@data-testid='hero-title-block__metadata']/li/a)[1]");

	public SeriesPage(WebDriver driver) {
		super(driver);
	}

	public String getTitleText() {
		return find(titleLocator,10).getText();
	}
	
	public String getYearText() {
		return find(yearLocator,10).getText();
	}
}
