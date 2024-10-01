package __008demp;

abstract class Product {
 private String productID;
 private String productName;
 private double productPrice;
 private int productQuantity;
 
 public Product (String productID,String productName,
		  double productPrice,int productQuantity) {
 
 //Constuctors
 this.productID = productID;
 this.productName = productName;
 this.productPrice =productPrice;
 this.productQuantity= productQuantity;
 }
 //Getters/Accessors
 public String getProductId() {
	 return this.productID;
 } 
	 public String getProductName(){
		 return this.productName;
	
 }
	 public double getProductPrice() {
		 return this.productPrice;
		
	 }
	 
	 public int getProductQuantity() {
		 return this.productQuantity;
	 }
	 
	 public void reduceStock(int quantity) {
		 if (quantity <= this.productQuantity) {
			 this.productQuantity -= quantity;
		 } else {
			 throw new IllegalArgumentException("Insuffi");
		 }
	 }
	 
	 
 
	 
 
}
