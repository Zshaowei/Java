package com.springmvc.controller;

import com.alibaba.fastjson.JSONObject;
import com.springmvc.model.TpmTestLog;
import com.springmvc.service.TpmTestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    private TpmTestLogService service;


    @GetMapping("/test")
    public JSONObject test(){
        JSONObject jsonobject = new JSONObject();
        TpmTestLog tpmTestLog = new TpmTestLog();
        tpmTestLog.setSyscreatedate("xbl");
        tpmTestLog.setTestmainUuid("userid001");
        tpmTestLog.setOperation("zsw");
        service.ceshi(tpmTestLog);
        jsonobject.put("title","测试成功" + tpmTestLog.getLogUuid());

        return jsonobject;
    }

    @GetMapping("/idea")
    public JSONObject idea(){
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("想法","拍照");

        return jsonobject;
    }
}
