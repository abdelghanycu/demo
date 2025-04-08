package com.sci.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class Test2Controller {

  @GetMapping("/m1")
  public String m1() {
    return "Hello World";
  }

  @GetMapping("/m2")
  public Node m2() {
    return new Node(5, 7);
  }
}
