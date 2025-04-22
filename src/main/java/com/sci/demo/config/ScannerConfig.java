package com.sci.demo.config;

import java.util.Scanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScannerConfig {

  @Bean
  @Scope("prototype")
  public Scanner getScanner() {
    return new Scanner("Generally, when we need to validate user input, Spring MVC offers standard predefined validators.");
  }
}
