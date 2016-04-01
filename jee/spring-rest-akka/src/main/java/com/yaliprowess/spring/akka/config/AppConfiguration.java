package com.yaliprowess.spring.akka.config;
 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.yaliprowess.spring.akka.controller")
public class AppConfiguration {
      
}