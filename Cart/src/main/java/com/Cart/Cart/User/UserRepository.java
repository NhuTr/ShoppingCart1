package com.Cart.Cart.User;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository     //This interface is responsible for DATA ACCESS
public interface UserRepository extends JpaRepository<User, Integer> {

  //This transforms into SQL: SELECT * FROM profile WHERE email = ?     ? means whatever we pass
  @Query("SELECT s FROM Profile s WHERE s.userName = ?1")
  //JBQL
  Optional<User> findUserByuserName(String userName);

  List<User> findByUserName(String userName);

  User findProfileByUserName(String userName);



}