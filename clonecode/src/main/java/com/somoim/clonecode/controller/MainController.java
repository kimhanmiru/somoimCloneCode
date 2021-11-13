package com.somoim.clonecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {

  @RequestMapping(value="/")
  public String main() {
      log.debug("============= main =============");
      return "index";
  }
}
