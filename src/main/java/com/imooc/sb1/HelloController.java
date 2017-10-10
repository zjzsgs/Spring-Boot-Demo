package com.imooc.sb1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @Controller 处理HTTP请求
 * @RestController Spring4之后新增的注解，返回json.==@Controller+@ResponseBody
 *      返回json数据不需要模板
 * @RequestMapping 配置url映射
 * 获取url中参数
 * @PathVariable 获取url中的数据
 * @RequestParam 获取请求参数的值
 * @GetMapping 组合注解 或者@PostMapping
 *
 */
@RestController
@RequestMapping("/")//整个类的
public class HelloController {

    @Value("${cupSize}")//使用自定义属性配置
    private String cupSize;
    @Value("${age}")
    private Integer age;
    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girlProperties;

    //可以映射多个
    @RequestMapping(value = {"/hello","hi"},method = RequestMethod.GET)//请求方法常用get/post,不写表明都可以
    public String hello(){
//        return "Hello Spring Boot "+cupSize+" "+age+" "+content+" "+girlProperties.getCupSize();
        return girlProperties.getCupSize()+" "+girlProperties.getAge();
    }

    @RequestMapping(value = {"/param/{id}","{id}/param"},method = RequestMethod.GET)
    public String testParam(@PathVariable("id")Integer id){
        return "id:"+id;
    }

//    @RequestMapping(value = {"param1"},method = RequestMethod.GET)//传参方式：param?id=111
    @GetMapping("param1")//以上的组合注解
    /**
     * 可以id=或id后面不接 这样得到的是null
     * 若非则400错误
     * 通过设置defaultValue可以避免以上问题
     */
    public String testParam1(@RequestParam(value = "id",required = false,defaultValue = "0")Integer myId){
        return "id:"+myId;
    }
}
