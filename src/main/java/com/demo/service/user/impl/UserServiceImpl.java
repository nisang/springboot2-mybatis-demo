package com.demo.service.user.impl;

import com.demo.mapper.UserMapper;
import com.demo.model.User;
import com.demo.service.user.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

	private final UserMapper userDao;

	public UserServiceImpl(UserMapper userDao) {
		this.userDao = userDao;
	}

	@Override
	public int addUser(User user) {
		return userDao.insert(user);
	}

	/*
	 * 这个方法中用到了我们开头配置依赖的分页插件pagehelper 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
	 * pageNum 开始页数 pageSize 每页显示的数据条数
	 */
	@Override
	public PageInfo<User> findAllUser(int pageNum, int pageSize) {
		// 将参数传给这个方法就可以实现物理分页了，非常简单。
		PageHelper.startPage(pageNum, pageSize);
		List<User> userDomains = userDao.selectUsers();
		PageInfo<User> result = new PageInfo<User>(userDomains);
		PageHelper.clearPage();
		return result;
	}
}
