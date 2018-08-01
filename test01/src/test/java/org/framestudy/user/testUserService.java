package org.framestudy.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.beans.UserInfo;
import org.framestudy.service.UserService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class testUserService {
	
	@Resource
	private UserService userServiceImpl;

	@Test
	public void testBacthDeletUserInfo(){}

	@Test
	public void testBatchSaveUserInfo(){
		List<UserInfo> users = new ArrayList<UserInfo>();
		
		UserInfo user = new UserInfo(null, "小马", "d", "123456", 18);
		try {
			UserInfo user2 = (UserInfo) user.clone();
			user2.setLoginName("e");
			UserInfo user3 = (UserInfo) user.clone();
			user3.setLoginName("f");
			UserInfo user4 = (UserInfo) user.clone();
			user4.setLoginName("g");
			
			users.add(user4);
			users.add(user3);
			users.add(user2);
			users.add(user);
			
			int rows = userServiceImpl.batchSaveUserInfo(users);
			Assert.assertEquals(4, rows);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Ignore
	public void testQueryUserListByMap(){
		Map map = new HashMap();
		map.put("userName", "小妹");
		map.put("age", 18);
		List<UserInfo> users = userServiceImpl.queryUserListByMap(map);
		Assert.assertNotNull(users);
		System.out.println(users);
		
	}
	
	@Ignore
	public void testLogin(){
		String name = "a";
		String pwd = "123456";
		UserInfo user = userServiceImpl.getUserByLoginNameAndPwd(name,pwd);
		Assert.assertNotNull(user);
		System.out.println(user);
	}
	
	@Ignore
	public void testDeleteUserInfo(){
		//删除与修改之前，都需要先查询
		UserInfo user = userServiceImpl.getUserInfoById(3L);
		Assert.assertNotNull(user);
		System.out.println(user);
		
		int rows = userServiceImpl.deleteUserInfo(user.getId());
		Assert.assertEquals(1, rows);
		
	}
	
	@Ignore
	public void testUpdateUserInfo(){
		UserInfo user = new UserInfo(4L, "长大了","as", "123456", 18);
		userServiceImpl.updateUserInfo(user);
		
		System.out.println(user);
	}
	@Ignore
	public void testSaveUserInfo(){
		UserInfo user = new UserInfo(null, "小妹","ad", "123456", 18);
		userServiceImpl.saveUserInfo(user);
		
		System.out.println(user);
	}
	
	

}
