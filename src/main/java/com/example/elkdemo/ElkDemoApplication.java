package com.example.elkdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootApplication
@RestController
public class ElkDemoApplication {

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(ElkDemoApplication.class, args);

        log.info("============启动成功================");
    }

    @GetMapping(value = "/test")
    public String test() throws InterruptedException {
//        List<String> stringList = new ArrayList<>();
//        stringList.add("aa");
//        for (int i = 0; i < 10000; i++) {
//            Thread.sleep(500);
//            stringList.get(0);
//        }
        System.out.println(System.getProperty("APPID"));
        return "成功";
    }


}
