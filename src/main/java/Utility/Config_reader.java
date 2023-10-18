package Utility;

public class Config_reader {
	Property_Reader pr = new Property_Reader();
		
		public  String get_Browser() {
			String property = pr.getPropertyFile().getProperty("Browser");
			return property;
			}
		
		public String get_Url() {
			String property = pr.getPropertyFile().getProperty("url");
			return property;
		}
		public String get_MobileNo() {
			String property = pr.getPropertyFile().getProperty("mobileNo");
			return property;
		}
		
		public String get_From() {
			String property = pr.getPropertyFile().getProperty("From");
			return property;
		}
		
		public String get_To() {
			String property = pr.getPropertyFile().getProperty("To");
			return property;
		}
		

}
