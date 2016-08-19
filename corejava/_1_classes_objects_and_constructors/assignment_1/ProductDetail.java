package corejava._1_classes_objects_and_constructors.assignment_1;

public class ProductDetail extends ProductOrder{
	String productName;
	String category;
	int price;
	int quantity;
	ProductDetail(String name, String houseNo, String area, String city, String country, 
			int telephoneNo, int customerID, int licenseNo, boolean customerIsCompany, int orderNo,
			int orderDate, String shippingMode, String orderStatus, String productName, String category, int price,
			int quantity){
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
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		
	}

}
