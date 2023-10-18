package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base_class;

public class Book_A_Cab  extends Base_class{

	public Book_A_Cab() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//button[text()='SELECT'])[1]")
	private WebElement cab_WagonR;

	public WebElement getIndica_WagonR() {
		return cab_WagonR ;
	}
}

