package org.framestudy.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.beans.UserInfo;
import org.framestudy.dao.UserDao;
import org.framestudy.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDaoImpl;
	
	
	public UserInfo getUserByLoginNameAndPwd(String loginName, String pwd) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserByLoginNameAndPwd(loginName, pwd);
	}
	
	public int saveUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteUserInfo(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public UserInfo getUserInfoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public List<UserInfo> queryUserListByMap(Map map) {
		// TODO Auto-generated method stub
		return userDaoImpl.queryUserListByMap(map);
	}

	public int batchSaveUserInfo(List<UserInfo> user) {
		// TODO Auto-generated method stub
		return userDaoImpl.batchSaveUserInfo(user);
	}

	public int batchDeleteUserInfo(List<UserInfo> user) {
		// TODO Auto-generated method stub
		return userDaoImpl.batchDeleteUserInfo(user);
	}

}
