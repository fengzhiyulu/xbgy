package com.ssmm.dao;

import java.util.List;

import com.ssmm.model.Account;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
    
    List<Account> getAll();
    
    Account selectByUserName(String username);
}