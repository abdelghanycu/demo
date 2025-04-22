package com.sci.demo.controllers;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scanner")
public class ScannerController {

  @Autowired
  private Scanner scanner;

  @GetMapping
  public String getNextString() {
    return scanner.next();
  }
}
