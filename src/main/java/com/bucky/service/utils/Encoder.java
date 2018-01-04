package com.bucky.service.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by Dang Dim
 * Date     : 04-Jan-18, 10:57 AM
 * Email    : d.dim@gl-f.com
 */
public class Encoder {

    /*public static void main(String[]args){
        System.out.println(new BCryptPasswordEncoder().encode("123"));
    }*/

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
