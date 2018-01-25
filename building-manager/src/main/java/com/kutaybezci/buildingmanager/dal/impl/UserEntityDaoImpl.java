package com.kutaybezci.buildingmanager.dal.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kutaybezci.buildingmanager.dal.UserEntityDao;
import com.kutaybezci.buildingmanager.dal.model.UserEntity;

@Repository
public class UserEntityDaoImpl implements UserEntityDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String SQL_TOTAL_USER_COUNT = "select count(*) from user";
	private static final String SQL_INSERT_USER = "insert into user(user_name, password, person_id) values(?,?,?)";

	@Override
	public int getTotalUserCount() {
		return jdbcTemplate.queryForObject(SQL_TOTAL_USER_COUNT, Integer.class);
	}

	@Override
	public void insert(UserEntity userEntity) {
		jdbcTemplate.update(SQL_INSERT_USER,
				new Object[] { userEntity.getUserName(), userEntity.getPassword(), userEntity.getPersonId() });
	}

}
