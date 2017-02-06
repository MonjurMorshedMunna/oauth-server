package com.oauth.service;

import com.oauth.entities.User;
import com.oauth.entities.UserRole;
import com.oauth.repositories.UserRepository;
import com.oauth.repositories.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * Created by munna on 2/5/17.
 */
@Component
public class CustomUserDetailsService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(s);
        UserRole userRole = userRoleRepository.findByUser(user);
        return new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getPassword(),
                AuthorityUtils.createAuthorityList(userRole.getRole().getRoleName()));
    }
}
