package com.imooc.sb1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody//可以返回json数据
public class OriginController {
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/contro",method = RequestMethod.GET)
    public String say(){
        //@Controller返回需要模板接收
        return girlProperties.getCupSize()+" "+girlProperties.getAge();
//        return "index";
    }
}
