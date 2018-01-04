package com.bucky.service.repositories;

import com.bucky.service.model.User;

/**
 * Created by Dang Dim
 * Date     : 04-Jan-18, 2:45 PM
 * Email    : d.dim@gl-f.com
 */

public interface UserRepository {

    User findByEmail(String email);

    boolean createUser(User user);
}
