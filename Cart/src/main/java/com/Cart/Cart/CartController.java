package com.Cart.Cart;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Cart.Cart.User.UserRepository;

@RestController
@RequestMapping(path = "api/v1/cart")
public class CartController {

  @Autowired
  UserRepository userRepository;
  @Autowired
  CartRepository cartRepository;

  private final CartService cartService;

  @Autowired
  public CartController(CartService cartService) {
    this.cartService = cartService;
  }


 
  @GetMapping
  public List<Cart> getCart() {
    return cartService.getCart();
  }


  @PutMapping("/{cart_id}/{user_id}")
  public Cart assignCartToUser(
      @PathVariable Integer card_id,
      @PathVariable Integer user_id
  ) {
    return cartService.assignCartToUser(card_id, user_id);
  }
}
