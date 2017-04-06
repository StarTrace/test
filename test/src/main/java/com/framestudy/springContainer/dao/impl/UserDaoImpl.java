package com.framestudy.springContainer.dao.impl;

import com.framestudy.springContainer.beans.UserBean;
import com.framestudy.springContainer.dao.UserDao;

public class UserDaoImpl implements UserDao {

	public void saveUserInfo(UserBean user) throws Exception {
		System.out.println("保存用户！");
	}

	public void updateUserInfo(UserBean user) throws Exception {
		System.out.println("修改用户！");
	}
}
