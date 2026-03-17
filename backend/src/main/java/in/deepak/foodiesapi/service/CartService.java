package in.deepak.foodiesapi.service;

import in.deepak.foodiesapi.io.CartRequest;
import in.deepak.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
