package com.springmvc.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ht")
public class HTController {

    @RequestMapping("/home")
    public JSONObject ht(){
        JSONObject object = new JSONObject();
        object.put("话题001","公司");
        return object;
    }
}
