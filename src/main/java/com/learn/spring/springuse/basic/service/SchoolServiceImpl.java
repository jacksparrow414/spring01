package com.learn.spring.springuse.basic.service;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Service 注解默认的bean的名字为schoolServiceImpl,即当前类名的驼峰写法
 * @author jacksparrow414
 * @date 2020/5/16 10:04
 */
@Component
//@Service
public class SchoolServiceImpl {

    public String getTimeStr(){
      return   LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:MM:ss"));
    }

    public String getInStr(String str){
        return str;
    }
}
