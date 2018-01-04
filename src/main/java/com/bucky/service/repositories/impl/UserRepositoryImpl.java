package com.bucky.service.repositories.impl;

import com.bucky.service.model.User;
import com.bucky.service.repositories.UserRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Dang Dim
 * Date     : 04-Jan-18, 2:50 PM
 * Email    : d.dim@gl-f.com
 */

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public boolean createUser(User user) {
        return false;
    }
}
