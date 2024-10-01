package __008demp;

class ShoppingCart {
	
	private CartItem[] items;
	private int itemCount;
	
	public ShoppingCart() {
		items = new CartItem[5];
		itemCount = 0;
	}

	// AddProductTocart
	
	public void addProductToCart(Product product,int quantity) {
	 CartItem newItem = new CartItem(product,quantity);
	items[itemCount]= newItem;
	itemCount++;
	product.reduceStock(quantity);
	}
}


 