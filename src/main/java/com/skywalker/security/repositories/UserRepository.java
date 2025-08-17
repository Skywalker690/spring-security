package com.skywalker.security.repositories;

import com.skywalker.security.models.ApplicationUser;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ApplicationUser, Integer> {

  // SDP
  Optional<ApplicationUser> findByEmail(String email);
}
