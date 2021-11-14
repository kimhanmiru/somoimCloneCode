package com.somoim.clonecode.mapper;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FaqMapper {
  int test() throws SQLException;
}
