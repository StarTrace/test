package com.framestudy.springContainer.dao;

import com.framestudy.springContainer.beans.UserBean;

public interface UserDao {
	public void saveUserInfo(UserBean user) throws Exception;
	
	public void updateUserInfo(UserBean user) throws Exception;
}
