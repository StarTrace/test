package org.framestudy.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.framestudy.beans.UserInfo;
import org.framestudy.dao.UserDao;
import org.framestudy.mapper.UserMapper;
import org.framestudy.util.SessionUtils;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	private UserMapper um;
	
	public int saveUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		SqlSession session = SessionUtils.getSession();//获得会话连接对象
		um = session.getMapper(UserMapper.class);//取得接口的实例
		int rows = 0;
		try {
			rows = um.saveUserInfo(user);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		
		return rows;
	}

	public int updateUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		SqlSession session = SessionUtils.getSession();//获得会话连接对象
		um = session.getMapper(UserMapper.class);//取得接口的实例
		int rows = 0;
		try {
			rows = um.updateUserInfo(user);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		
		return rows;
	}

	public int deleteUserInfo(Long id) {
		// TODO Auto-generated method stub
		SqlSession session = SessionUtils.getSession();//获得会话连接对象
		um = session.getMapper(UserMapper.class);//取得接口的实例
		int rows = 0;
		try {
			rows = um.deleteUserInfo(id);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		
		return rows;
	}

	public UserInfo getUserInfoById(Long id) {
		// TODO Auto-generated method stub
		SqlSession session = SessionUtils.getSession();//获得会话连接对象
		um = session.getMapper(UserMapper.class);//取得接口的实例
		UserInfo user = null;
		try {
			user = um.getUserInfoById(id);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		
		return user;
	}

	public UserInfo getUserByLoginNameAndPwd(String loginName, String pwd) {
		// TODO Auto-generated method stub
		SqlSession session = SessionUtils.getSession();//获得会话连接对象
		um = session.getMapper(UserMapper.class);//取得接口的实例
		UserInfo user = null;
		try {
			user = um.getUserByLoginNameAndPwd(loginName,pwd);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		
		return user;
	}

	public List<UserInfo> queryUserListByMap(Map map) {
		// TODO Auto-generated method stub
		SqlSession session = SessionUtils.getSession();//获得会话连接对象
		um = session.getMapper(UserMapper.class);//取得接口的实例
		List<UserInfo> users = null;
		
		try {
			users = um.queryUserListByMap(map);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return users;
	}
	
	public int batchSaveUserInfo(List<UserInfo> user) {
		// TODO Auto-generated method stub
		SqlSession session = SessionUtils.getSession();//获得会话连接对象
		um = session.getMapper(UserMapper.class);//取得接口的实例
		int rows = 0;
		try {
			rows = um.batchSaveUserInfo(user);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		
		return rows;
	}

	public int batchDeleteUserInfo(List<UserInfo> user) {
		// TODO Auto-generated method stub
		SqlSession session = SessionUtils.getSession();//获得会话连接对象
		um = session.getMapper(UserMapper.class);//取得接口的实例
		int rows = 0;
		try {
			rows = um.batchDeleteUserInfo(user);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		
		return rows;
	}



}
