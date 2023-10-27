package com.sns.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sns.test.mapper.userMapper;

@Controller
public class TestController {
	@Autowired
	private userMapper usermapper;
	
	@ResponseBody
	@GetMapping("/sns/test1") // string
	public String test1() {
		return "edfa";
	}
	
	@ResponseBody
	@GetMapping("/sns/test2") // json
	public Map<String, Object> test2() {
		Map<String, Object> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		
		return map;
	}
	
	@GetMapping("/sns/test3") // jsp
	public String test3() {
		return "test/test";
	}
	
	// SnsApplication DB 설정 안 보는 설정 제거
	// DatabaseConfig 클래스 추가 - 2강
	// resources/mappers xml - 
	// application.yml DB 접속 정보 추가 - 2강
	// logback-xml
	@ResponseBody
	@GetMapping("/sns/test4")
	public List<Map<String, Object>> getUser() {
		return usermapper.selectUser();
	}
}
