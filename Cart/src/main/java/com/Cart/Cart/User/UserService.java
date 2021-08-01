package com.Cart.Cart.User;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service  //Service annotation tells the @Autowired from controller that this class will be the bean
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  //This will return the list of Profiles in the database
  public List<User> getProfiles() {
    return  userRepository.findAll();

  }


  //Returns a list of users with the same userName(Which wont happen since userName is unique
  public List<User> findByUserName(String userName) {//Profile profile

    return userRepository.findByUserName(userName);

  }


 


  
}
