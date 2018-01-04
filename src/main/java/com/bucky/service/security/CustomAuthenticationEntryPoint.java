package com.bucky.service.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dang Dim
 * Date     : 04-Jan-18, 1:20 PM
 * Email    : d.dim@gl-f.com
 */

@Component
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

    private final Logger log = LoggerFactory.getLogger(CustomAuthenticationEntryPoint.class);

    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException ex) throws IOException, ServletException {

        log.info("Pre-authenticated entry point called. Rejecting access");
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Access Denied");
    }

}
