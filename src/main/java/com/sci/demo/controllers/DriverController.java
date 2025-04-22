package com.sci.demo.controllers;

import com.sci.demo.services.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {

  @Autowired
  @Qualifier(value = "DriverPC2")
  private Driver driver;

  @GetMapping("/name")
  public String getDriverName() {
    return driver.getName();
  }

  @GetMapping("/address")
  public String getDriverAddress() {
    return driver.getAddress();
  }
}
