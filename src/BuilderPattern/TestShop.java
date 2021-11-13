package BuilderPattern;

public class TestShop {

	public static void main(String[] args) {
		Shopping shop= new Shopping();
		shop.addToCart("oil");
		shop.doSearch("suger");
		shop.login("raji", "1222")
		     .doSearch("macbookpro")
		      .doPayment("abcd",123)
		       .checkOrder("oil")
		         .checkOrder("suger")
		             .logOut();
		System.out.println("*************");
		shop.checkOrder("cloths")
		     .addToCart("T shirt")
		     .logOut();
		
	
	}
}
