package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base_class;

public class Airport extends Base_class
{
	public Airport() {

		PageFactory.initElements(driver,this);

	}

	@FindBy(xpath ="//p[text()='Cabs']"  )
	private WebElement Cabs;

	public WebElement get_Cab()
	{
		return Cabs;

	}

	@FindBy(xpath = "//span[text()='Airport']")
	private WebElement Airport;

	public WebElement get_airport_btn()

	{
		return Airport;

	}

	@FindBy(id = "downshift-1-input")
	private WebElement pickup_location;

	public WebElement get_Pickup_location()
	{
		return pickup_location; 
	} 

	@FindBy(id="downshift-1-item-1") // Chennai domestic airport
	private WebElement pickup_xpath;

	public WebElement get_pickup_xpath() 
	{
		return 	pickup_xpath;
	}


	@FindBy(id = "downshift-2-input")
	private WebElement drop_location;

	public WebElement get_drop_location() 
	{
		return 	drop_location;
	}

	@FindBy(xpath = "//p[text()='Annanagar East, Chennai, Tamil Nadu, India']")
	private WebElement drop_xpath;

	public WebElement get_drop_xpath() 
	{
		return drop_xpath;
	}

	@FindBy(xpath = "//button[text()='SEARCH CABS']")
	private WebElement search_cab;

	public WebElement get_search_cab() 
	{
		return 	search_cab;
	}






}
