package __008demp;

class CartItem {
	private Product product;
	private int cartQuantity;
	
	//constructro
	public CartItem(Product product, int quantity) {
		if (quantity > product.getProductQuantity()) {
			throw new IllegalArgumentException("Insufficent Stock");
	      
			}
			this.product = product;
			this.cartQuantity = quantity;
			
		}
			//Getters /Accessors
		
		public Product getProduct() {
			return this.product;
		}
		
		public int getCartQuantity() {
			return this.cartQuantity;
		}
		
		public double getTotalPrice() {
			return product.getProductPrice()* cartQuantity;
					
		}
	
	
	
	
	
		

}
