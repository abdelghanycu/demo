package com.sci.demo.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class TestController {

  @GetMapping("/m1")
  public String m1() {
    return "Hello World";
  }

  @GetMapping("/m2")
  public Node m2() {
    return new Node(5, 7);
  }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Node {

  private int x;
  private int y;
}
