package com.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //hey i want to go for ann config
@ComponentScan(basePackages = {"com.demo"})
public class AppConfig {

}
