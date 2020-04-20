package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan({"com.example.demo.dao"})
public class Test3Application {
	public static void main(String[] args) {

		System.out.println("修改启动类");
		SpringApplication.run(Test3Application.class, args);
		System.out.println("123");
	}

}
