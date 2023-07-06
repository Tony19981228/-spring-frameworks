package com.atguigu.spring;

import com.atguigu.spring.bean.Person;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Scope
//https://gitee.com/leifengyang/spring-framework
public class MainTest {

	public static void main(String[] args){
		System.out.println("test");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}


	public static void test(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
