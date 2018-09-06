package ca.on.gov.common.cart;

import ca.on.gov.common.model.Cart;

public interface ShoppingCartApi {

	Cart createShoppingCart(String transactionId);
	Cart getShoppingCartByTransactionId(String transactionId);
	
	void updateShoppingCart(String transactionId, Cart shoppingCart);
	void clearShoppingCart(String transactionId);
	
	void reset();
}
