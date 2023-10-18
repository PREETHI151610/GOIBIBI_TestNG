package Utility;

import org.openqa.selenium.WebDriver;

import POM.Airport;
import POM.Book_A_Cab;
import POM.Login;

public class PageObjectManager {

	WebDriver driver;

	private Config_reader C;
	private Login pom;
	private Airport pom1;
	private Book_A_Cab pom2;

	public Config_reader get_config() {
		C = new Config_reader();
		return C;
	}


	public Login getpom() 
	{
		pom = new Login();
		return pom;
	} 

	public Airport getpom1()
	{
		pom1 = new Airport();
		return pom1;
	}

	public Book_A_Cab getpom2() {
		pom2 = new Book_A_Cab();
		return pom2;
	}
}


