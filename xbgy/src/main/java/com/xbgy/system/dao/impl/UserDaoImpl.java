package com.xbgy.system.dao.impl;

import org.springframework.stereotype.Repository;

import com.xbgy.system.dao.UserDao;
import com.xbgy.system.model.TSecUserDef;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Override
	public TSecUserDef getUserByUsername(String username, String password) {
		return null;
	}
}
