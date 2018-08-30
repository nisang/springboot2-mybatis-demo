package com.demo.service.user;

import com.demo.model.User;
import com.github.pagehelper.PageInfo;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

	int addUser(User user);

	PageInfo<User> findAllUser(int pageNum, int pageSize);
}
