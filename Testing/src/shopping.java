import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class shopping {

	@Test
	public void testCreateProduct() {
		// 1. Create a new Product
		Product p = new Product("chair", 40);
		
		assertEquals("chair",p.getTitle());
		
		
}
	@Test
	public void testCreateProduct1() {
		// 1. Create a new Product
		Product p2 = new Product("TABLE", 40);
		
		assertEquals("chair",p2.getTitle());
		
		
}
	@Test
	public void testCreateProduct2() {
		// 1. Create a new Product
		Product p2 = new Product("TABLE", 40);
		Product P1 = new Product("TABLE", 40);
		assertEquals(true,p2.equals(P1));
		
		
}
}