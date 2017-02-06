package com.oauth.repositories;


import com.oauth.entities.User;
import com.oauth.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by munna on 2/5/17.
 */
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long>{

    UserRole findByUser(User pUser);

}
