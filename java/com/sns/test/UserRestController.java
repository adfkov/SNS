package com.sns.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@RequestMapping("/is_duplicated_id")
	public Map<String, Object> test(
			@RequestParam("loginId") String loginId) {
		Map<String, Object> result = new HashMap<>();
		// db 조회
		UserEntity 
		// json 리턴
		result.put("code",200);
		result.put("isDuplicated", true);
		
		
		return result;
	}
}
