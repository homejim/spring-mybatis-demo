package com.example.demo.service;

import com.example.demo.model.User;

/**
 * @description mybatis_test
 * @author BEJSON
 * @date 2024-07-06
 */
public interface UserService {

    User load(int id);

}