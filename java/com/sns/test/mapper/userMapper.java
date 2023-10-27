package com.sns.test.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface userMapper {
	public List<Map<String, Object>> selectUser();
}
