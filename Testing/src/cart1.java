import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cart1 {

	@Test
	public void testCreateCart() {
		// When created, the cart has 0 items 
		// 1. Create a shopping cart
		ShoppingCart cart = new ShoppingCart();
		
		// 2. Use getItemCount() to check how many items are in cart
		int numItems = cart.getItemCount();
		
		assertEquals(0, numItems);

	}

	@Test
	public void testEmptyCart() {
		// When empty, the cart has 0 items  
		
		// 1. Create a cart  (Known issue that getItmeCount() doesn't work properly)
		ShoppingCart cart = new ShoppingCart();
		
		// 2. Add things to the cart
		Product p = new Product("coffee", 200);
		cart.addItem(p);
		
		Product p2 = new Product("donut", 100);
		cart.addItem(p2);
		
		// 3. EMPTY the cart
		cart.empty();
		
		// 4. Check the number of items in the cart (expected = 0)
		assertEquals(0, cart.getItemCount());		
	}
	
	@Test
	public void testAddingProductsToCart() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRemoveProductFromCart() {
		fail("Not yet implemented");
	}
}
