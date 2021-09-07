package com.ke.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.ke.model.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

/**
 * @Summary: hibernate-validator验证的测试类
 * @Author: YangxingLiu
 * @Since: 2019/11/12 11:34
 */
// @RestController = @Controller + @ResponseBody
@Controller
@RequestMapping("/book")
public class ValidateController {

    @RequestMapping("/into")
    public String toValidate(){
        return "validate";
    }

    @PutMapping("/check")
    @ResponseBody
    public JSONObject validateTest(@Valid Transaction transaction, Errors errors){
        JSONObject jsonObject = new JSONObject();
        List<FieldError> list = null;
        if(errors.hasErrors()){
            list = errors.getFieldErrors();
        }
        for (FieldError o : list) {
            jsonObject.put(o.getField().toString(), o.getDefaultMessage());
        }
        return jsonObject;
    }
}
