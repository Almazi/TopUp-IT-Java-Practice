# Assignment 1 - Working with Object-Oriented Principles Assignment

The goal of this assignment is to become familiar with object-oriented concepts,    including classes, methods, and attributes. You also learn how to read a UML class model.

A description of the business rules contains information to enable you to determine the classes, methods, attributes, and associations that make up objects in the system. At the end of the assignment, you will have created a design model that includes the major classes in the business. The aim is to create a simple UML class model to show these objects.

Note that a model is a representation of something, and is subject to interpretation. Remember that no model is basically wrong—but some models are more usable than others.

# Description of the Order Entry Area of the Business

The Order Entry component of the business is now becoming automated. In most respects, the process of ordering products is rather simple. The customers select the items that they want from a list of products. Your customers must be included in your system.You keep information about your customers such as name, address, and telephone number. You also assign a unique customer ID to each new customer. For customers that are companies, you track a contact person and provide for a discount on company purchases. You identify individual customers by their license number.

The order is not very complicated. Each order has a unique number that you can use to keep track of it and has information such as the customer who is responsible for the order, the order date, shipping mode (air or ground), and an order status. Each order can have multiple line items. You currently limit your customers to 10 items per order. Each item on an order has the product being purchased, the price, quantity, and the product category. A product category can be a composite category consisting of additional categories, or a leaf category.

You track many things about your products, and the key things include the name, description, and list price. Additionally, you want to include a warranty period, the supplier who distributes the product, a catalog URL to reference it on the Web, and a weight classification that is used when you calculate shipping costs. It is important for you to also track information about the products that are available, and where they are located. You have many warehouses to hold all your products.

# Understanding Object-Oriented Principles
1.	Identifying Business Classes, Attributes, and Methods.

Ans: CustomerInfo, ProductOrder, ProductDetail.

2.	Identify some of the classes in the Order Entry business, limiting yourself to three. The process of identifying a class is to look for nouns that classify a group of things from the business description. Some nouns will describe the attributes of a class. Write a simple sentence or two describing each class to make sure that it is of interest to the business.

Ans: CustomerInfo contains the customer details and a method to determine the customer is a company or person. ProductOrder contains attributes to track the order for each unique customer extending CustomerInfo. ProductDetail determines the indiviudal product detail extending the ProductOrder class.

3.	Identify a few attributes for each of the new classes. Remember that attributes may be other classes.

Ans: name, id, address, cost, category etc.

4.	Define some behaviors (methods or operations) for each of the classes that you have discovered.

Ans: Determining each unique customer info with their orders and product list.

5.	Look for classes that can inherit structure (attributes) and behavior (methods) from other classes. Modify your definitions to reflect the inheritance model.
