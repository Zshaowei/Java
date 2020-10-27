package com.springmvc.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sd")
public class SDController {

    public JSONObject va01(){
        JSONObject object = new JSONObject();

        return object;
    }

    @GetMapping("/va05")
    public String va05(){
        JSONObject object = new JSONObject();
        object.put("vbeln","1000020201");
        object.put("erdat","2020-10-14");
        object.put("ernam","zsw");

        JSONObject object1 = new JSONObject();
        object1.put("vbeln","2000020201");
        object1.put("erdat","2020-10-14");
        object1.put("ernam","zsw");

        JSONObject object2 = new JSONObject();
        object2.put("vbeln","3000020201");
        object2.put("erdat","2020-10-14");
        object2.put("ernam","zsw");

        JSONObject object3 = new JSONObject();
        object3.put("vbeln","4000020201");
        object3.put("erdat","2020-10-14");
        object3.put("ernam","zsw");

        JSONObject object4 = new JSONObject();
        object4.put("vbeln","5000020201");
        object4.put("erdat","2020-10-14");
        object4.put("ernam","zsw");

        JSONArray array = new JSONArray();

        array.add(object);
        array.add(object1);
        array.add(object2);
        array.add(object3);
        array.add(object4);

        Long num = 21L;
        System.out.println();
        return array.toJSONString();
    }

    // 创建销售数据
    //
    public String getMsg(){
        // 创建销售数据
        return null;
    }

}
