package com.grizz.dream.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 *
 * @author GCITFEOD008
 * @date 2020-08-22 22:44
 */
@RestController
public class UserController {

    @GetMapping("test")
    public String test() {
        return "hellow world";
    }
}
