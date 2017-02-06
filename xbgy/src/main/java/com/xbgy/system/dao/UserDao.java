package com.xbgy.system.dao;

import org.springframework.stereotype.Repository;

import com.xbgy.system.model.TSecUserDef;

public interface UserDao{

	public TSecUserDef getUserByUsername(String username,String password);
}
