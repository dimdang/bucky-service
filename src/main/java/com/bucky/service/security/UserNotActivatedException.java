package com.bucky.service.security;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by Dang Dim
 * Date     : 04-Jan-18, 1:50 PM
 * Email    : d.dim@gl-f.com
 */

public class UserNotActivatedException extends AuthenticationException {

    public UserNotActivatedException(String msg, Throwable t) {
        super(msg, t);
    }

    public UserNotActivatedException(String msg) {
        super(msg);
    }

}
