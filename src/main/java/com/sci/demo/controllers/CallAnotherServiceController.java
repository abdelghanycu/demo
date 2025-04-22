package com.sci.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/call-another-service")
public class CallAnotherServiceController {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping
  public String getResponse() {
    String url = "https://enduserauth.free.beeceptor.com/book";
    String res = restTemplate.getForObject(url, String.class);
    return res;
  }
}
