package com.bocd.controller;

import com.bocd.anno.CurrentOp;
import com.bocd.model.UserModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenchaofu
 * @version 1.0, 2019/9/19
 * @desc
 */
@RestController
public class MethodArgController {


    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    private String sayHello(@CurrentOp UserModel userModel) {
        return userModel.toString();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/test")
    private String sayHello() {
        return "test";
    }

}
