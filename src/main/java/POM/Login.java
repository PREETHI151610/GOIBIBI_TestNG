package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base_class;

public class Login extends Base_class  {

	public Login() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "//input[@class='loginCont__input']")
	private WebElement Mobile_Number;

	@FindBy(xpath="//button[text()='Continue']")
	private WebElement Continue_btn;

	@FindBy(xpath = "(//input[@class='verifyOtpCont__otpFiled '])[1]")
	private WebElement otp;

	public WebElement getMobile_Number()
	{
		return Mobile_Number;
	}

	public WebElement getContinue_btn()
	{
		return Continue_btn;
	}

	public WebElement get_otp() {
		return otp;
	}

}





