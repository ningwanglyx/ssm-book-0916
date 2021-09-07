package com.ke.web.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

/**
 * @Summary:
 * @Author: YangxingLiu
 * @Since: 2019/11/14 17:33
 */
@RestController
@RequestMapping("/book")
public class HttpClientController {

    @PostMapping("/http")
    public JSONObject httpClientTest(@RequestParam(value = "id", required = false) Integer id, @RequestParam(value = "name", required = false) String name){
        JSONObject object = new JSONObject();
        object.put("id", id+10);
        object.put("name", new StringBuilder(name).append(" yangxing"));
        return object;
    }

    @PostMapping("/http2")
    public JSONObject httpClientTest2(@RequestBody JSONObject object){
        JSONObject object2 = new JSONObject();
        object2.put("id", object.getIntValue("id") + 10);
        object2.put("name", new StringBuilder(object.getString("name")).append(" haha"));
        return object2;
    }

    @GetMapping("/login")
    public JSONObject testDoGet(String name){
        JSONObject object = new JSONObject();
        object.put("name", name);
        System.out.println(name);
        return object;
    }

}
