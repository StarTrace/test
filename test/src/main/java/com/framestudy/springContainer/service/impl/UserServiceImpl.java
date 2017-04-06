package com.framestudy.springContainer.service.impl;

import com.framestudy.springContainer.beans.UserBean;
import com.framestudy.springContainer.dao.UserDao;
import com.framestudy.springContainer.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao dao;

	public UserServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserServiceImpl(UserDao dao) {
		super();
		this.dao = dao;
	}

	public void saveUserInfo(UserBean user) throws Exception {
		// TODO Auto-generated method stub
		dao.saveUserInfo(user);
	}

	public void updateUserInfo(UserBean user) throws Exception {
		// TODO Auto-generated method stub
		dao.updateUserInfo(user);
	}

}
