package com.sci.demo.services;

import org.springframework.stereotype.Component;

@Component("DriverPC2")
public class DriverPC2 implements Driver {

  @Override
  public String getName() {
    return "PC2";
  }

  @Override
  public String getAddress() {
    return "PC2: 2.0.0.0";
  }
}