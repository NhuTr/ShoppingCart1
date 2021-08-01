package com.Cart.Cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cart.Cart.User.User;
import com.Cart.Cart.User.UserRepository;

@Service
public class CartService {
	

	  private final UserRepository userRepository;
	  private final CartRepository cartRepository;
	
	  @Autowired
	  public CartService(UserRepository userRepository,
	      CartRepository cartRepository) {
	    this.userRepository = userRepository;
	    this.cartRepository = cartRepository;
	  }

	
	  public List<Cart> getCart(){
	    return cartRepository.findAll();
	  }


	  public void addNewCart(Cart cart){
	       cartRepository.save(cart);

	    System.out.println(cart);
	  }
	public Cart assignCartToUser(Integer card_id, Integer user_id){

	    Cart cart = cartRepository.findById(card_id).get();
	    User user = userRepository.findById(user_id).get();

	    cart.assignUser(user);

	    return cartRepository.save(cart);

	  }

	

	

}