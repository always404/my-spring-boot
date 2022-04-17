package com.yang.controller;

import com.yang.service.UsersAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 合并表控制层
 * @author yang
 * 2022/04/13
 */
@RestController
public class UsersAddController {
    @Autowired
    private UsersAddService usersAddService;


    @GetMapping("/nativeFindAndSave")
    public String nativeFindAndSave() {
        usersAddService.nativeFindAndSave();
        return "SUCCESS";
    }

    @GetMapping("/mapFindAndSave")
    public String mapFindAndSave() {
        usersAddService.mapFindAndSave();
        return "SUCCESS";
    }

    @GetMapping("/findAndSave")
    public String findAndSave(){
        usersAddService.findAndSave();
        return "SUCCESS";
    }
}
