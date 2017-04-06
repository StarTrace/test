package com.framestudy.springContainer.service;

import com.framestudy.springContainer.beans.UserBean;

public interface UserService {
	
	public void saveUserInfo(UserBean user) throws Exception;
	
	public void updateUserInfo(UserBean user) throws Exception;
}
