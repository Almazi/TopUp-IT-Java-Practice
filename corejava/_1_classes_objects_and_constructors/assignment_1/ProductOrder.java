package corejava._1_classes_objects_and_constructors.assignment_1;

import java.util.Scanner;

public class ProductOrder extends CustomerInfo{
	int orderNo;
	int orderDate;
	String shippingMode;
	String orderStatus;
	ProductOrder(){
		
	}
	ProductOrder(String name, String houseNo, String area, String city, String country, 
			int telephoneNo, int customerID, int licenseNo, boolean customerIsCompany, int orderNo,
			int orderDate, String shippingMode, String orderStatus){
		this.name = name;
		this.houseNo = houseNo;
		this.area = area;
		this.city = area;
		this.country = country;
		this.telephoneNo = telephoneNo;
		this.customerID = customerID;
		this.licenseNo = licenseNo;
		this.customerIsCompany = customerIsCompany;
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.shippingMode = shippingMode;
		this.orderStatus = orderStatus;
	}
	
}
