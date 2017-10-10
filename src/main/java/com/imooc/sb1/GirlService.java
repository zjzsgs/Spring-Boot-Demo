package com.imooc.sb1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;//都可以
//import org.springframework.transaction.annotation.Transactional;


@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        //不加事务控制会添加一条信息
        Girl girlA = new Girl("B",12);
        girlRepository.save(girlA);
        Girl girlB = new Girl("FF",18);
        girlRepository.save(girlB);
    }
}
