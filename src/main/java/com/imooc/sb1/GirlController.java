package com.imooc.sb1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /**
     * 查询女生列表
     * @return
     */
    @GetMapping("/girls")
    public List<Girl> girls(){
        return girlRepository.findAll();
    }

    /**
     * 增加一个女生
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping("/girls")
    public Girl girlAdd(@RequestParam("cupSize")String cupSize,@RequestParam("age")Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);//save返回添加的对象
    }

//    查询
    @GetMapping("/girls/{id}")
    public Girl girlGet(@PathVariable("id")Integer id){
        return girlRepository.findOne(id);//返回对象
    }
//    更新
    @PutMapping("/girls/{id}")
    public Girl girlPut(@PathVariable("id")Integer id,@RequestParam("cupSize")String cupSize,@RequestParam("age")Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }
//    删除
    @DeleteMapping("/girls/{id}")
    public void girlDelete(@PathVariable("id")Integer id){
        girlRepository.delete(id);//无返回值
    }

//    通过年龄查询
    @GetMapping("/girls/age/{age}")
    public List<Girl> girlList(@PathVariable("age")Integer age){
        return girlRepository.findByAge(age);
    }

//    添加两个女生
    @PostMapping(value = "/girls/two")//地址栏只能发送get请求
    public void girlsTwo(){
        girlService.insertTwo();
    }
}
