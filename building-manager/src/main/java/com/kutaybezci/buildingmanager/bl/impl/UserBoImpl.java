package com.kutaybezci.buildingmanager.bl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kutaybezci.buildingmanager.bl.UserBo;
import com.kutaybezci.buildingmanager.dal.UserEntityDao;
import com.kutaybezci.buildingmanager.dal.model.UserEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserBoImpl implements UserBo {
	@Autowired
	private UserEntityDao userEntityDao;

	@Override
	@Transactional
	public boolean createInitialUser() {
		int totalUserCount = userEntityDao.getTotalUserCount();
		log.debug("{} users exists in DB", totalUserCount);
		if (totalUserCount == 0) {
			log.warn("No user to logon creating admin admin. Change password or deactivate user later");
			UserEntity userEntity = new UserEntity();
			userEntity.setUserName("admin");
			userEntity.setPassword("admin");
			userEntityDao.insert(userEntity);
			return true;
		}
		return false;
	}

}
