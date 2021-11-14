package com.somoim.clonecode.service.impl;

import java.sql.SQLException;

import com.somoim.clonecode.mapper.FaqMapper;
import com.somoim.clonecode.service.FaqService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaqServiceImpl implements FaqService{

  @Autowired
  private FaqMapper faqMapper;

  @Override
  public int test11(){
    int count = 0;
    try {
      count  = faqMapper.test();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return count;
  }
  
}
