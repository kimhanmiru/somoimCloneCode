package com.somoim.clonecode.controller;

import com.somoim.clonecode.service.FaqService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FaqController {
  @Autowired
  private FaqService faqService;
  
  @RequestMapping(value="/test")
  public String test() {
      int count = faqService.test11();
      System.out.println("count ?? " + count);
      return "index";
  }
}
