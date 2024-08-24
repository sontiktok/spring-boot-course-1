package com.example.componentscan.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //this is file config
@ComponentScan(basePackages = "com.example.componentscan.annotation")
public class AppConfig {
}
