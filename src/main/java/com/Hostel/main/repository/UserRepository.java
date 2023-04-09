package com.Hostel.main.repository;

import com.Hostel.main.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Integer> {
//    Optional<User> findByEmail(String email);
Optional<User> findUserByEmail(String email);

}
