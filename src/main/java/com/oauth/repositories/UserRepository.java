package com.oauth.repositories;

import com.oauth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by munna on 2/5/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String pEmail);
}
