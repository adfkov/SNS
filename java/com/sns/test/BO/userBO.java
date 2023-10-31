package com.sns.test.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.test.mapper.UserMapper;

@Service
public class userBO {
	@Autowired
	private UserMapper userMapper;
	
}
