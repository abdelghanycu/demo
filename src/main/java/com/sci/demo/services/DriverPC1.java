package com.sci.demo.services;

import org.springframework.stereotype.Component;

@Component("DriverPC1")
public class DriverPC1 implements Driver {

  @Override
  public String getName() {
    return "PC1";
  }

  @Override
  public String getAddress() {
    return "PC1: 1.0.0.0";
  }
}
