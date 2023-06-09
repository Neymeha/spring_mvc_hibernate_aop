package com.zaurtregulov.spring.mvc_hibernate_aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com")
@Configuration
@EnableAspectJAutoProxy
public class MyConfig {
}
