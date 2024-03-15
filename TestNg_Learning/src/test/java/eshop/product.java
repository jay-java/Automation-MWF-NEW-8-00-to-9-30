package eshop;

import org.testng.annotations.Test;

public class product {
	@Test(groups = "purchase")
	public void searchProduct() {
		System.out.println("search product");
	}
	@Test(groups = "purchase")
	public void selectProdcut() {
		System.out.println("select product");
	}
	@Test(groups = {"purchase","smoke"})
	public void addtocart() {
		System.out.println("add to cart");
	}
	@Test(groups = "smoke")
	public void wishlst() {
		System.out.println("add to wishlist");
	}
	@Test
	public void cartManage() {
		System.out.println("cart manage");
	}
	
}
