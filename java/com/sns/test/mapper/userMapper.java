package com.sns.test.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends JpaRepository<String, Integer>{
	public List<Map<String, Object>> selectUser();
}
