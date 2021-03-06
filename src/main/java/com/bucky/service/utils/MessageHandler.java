package com.bucky.service.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dang Dim
 * Date     : 04-Jan-18, 10:30 AM
 * Email    : d.dim@gl-f.com
 */

public class MessageHandler<T> {

    public static final String MESSAGE_SUCCESS = "SUCCESS";
    public static final String MESSAGE_FAILURE = "FAIL";
    private Map<String, Object> map = new HashMap<>();

    private Map<String, Object> mapData(T object, HttpStatus status, String message){
        if (object != null){
            map.put("DATA", object);
            map.put("STATUS", status);
            map.put("MESSAGE", message);
        }else {
            map.put("STATUS", status);
            map.put("MESSAGE", message);
        }
        return map;
    }

    public ResponseEntity<Map<String, Object>> responseMessages(T object, HttpStatus httpStatus){
        if (object != null){
           map = mapData(object, HttpStatus.OK, MESSAGE_SUCCESS);
        }else{
            map = mapData(null, HttpStatus.NOT_FOUND, MESSAGE_FAILURE);
        }
        return new ResponseEntity<>(map, httpStatus);
    }

    public ResponseEntity<Map<String, Object>> responseJson(List<T>object, HttpStatus status){
        if (object != null){
            map = mapData((T)object, HttpStatus.OK, MESSAGE_SUCCESS);
        }else {
            mapData(null, HttpStatus.OK.NOT_FOUND, MESSAGE_FAILURE);
        }
        return new ResponseEntity<Map<String, Object>>(map, status);
    }
}
