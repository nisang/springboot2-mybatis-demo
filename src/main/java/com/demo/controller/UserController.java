package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.User;
import com.demo.service.user.UserService;
import com.demo.web.Reply;
import com.github.pagehelper.PageInfo;

/**
 * Created by Administrator on 2017/8/16.
 * edit by:nisang
 * date:2018.08.30
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@ResponseBody
	@PostMapping(value="/add", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Reply addUser(@RequestBody User user) {
		Integer result =  userService.addUser(user);
		return Reply.ok(result);
	}

	@ResponseBody
	@GetMapping("/all")
	public Object findAllUser(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
		PageInfo<User> pageInfo = userService.findAllUser(pageNum, pageSize);
		return Reply.ok(pageInfo);
	}
}
