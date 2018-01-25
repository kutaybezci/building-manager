package com.kutaybezci.buildingmanager.dal;

import com.kutaybezci.buildingmanager.dal.model.UserEntity;

public interface UserEntityDao {

	int getTotalUserCount();

	void insert(UserEntity userEntity);

}
