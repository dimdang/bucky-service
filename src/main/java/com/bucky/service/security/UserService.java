package com.bucky.service.security;

import com.bucky.service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Dang Dim
 * Date     : 04-Jan-18, 2:17 PM
 * Email    : d.dim@gl-f.com
 */

@Service("userDetailsService")
public class UserService implements UserDetailsService {

    private final Logger log = LoggerFactory.getLogger(UserDetailsService.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
