package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *     Created by 2019/7/1 @author Gracie
 *     e-mail : 13574845807@163.com
 *     des :
 *     version:
 * </pre>
 */

@RestController
public class UserController {

    @GetMapping("/getUserInfo")
    public String getUserInfo(){
        return "i am users";
    }
}
