package corejava._1_classes_objects_and_constructors.assignment_1;

public class CustomerInfo {
	String name;
	String houseNo;
	String area;
	String city;
	String country;
	int telephoneNo;
	int customerID;
	int licenseNo;
	boolean customerIsCompany;
	CustomerInfo(){}
	CustomerInfo(String name, String houseNo, String area, String city, String country, 
			int telephoneNo, int customerID, int licenseNo, boolean customerIsCompany){
		this.name = name;
		this.houseNo = houseNo;
		this.area = area;
		this.city = area;
		this.country = country;
		this.telephoneNo = telephoneNo;
		this.customerID = customerID;
		this.licenseNo = licenseNo;
		this.customerIsCompany = customerIsCompany;
	}
	void discount(boolean customerIsCompany){
		
	}
	

}
