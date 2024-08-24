package com.example.autowrited.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //this is file config
@ComponentScan(basePackages = "com.example.autowrited.annotation")
public class AppConfig {
}
