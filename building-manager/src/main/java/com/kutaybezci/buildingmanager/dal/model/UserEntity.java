package com.kutaybezci.buildingmanager.dal.model;

import lombok.Data;

@Data
public class UserEntity {
	private Long userId;
	private String userName;
	private String password;
	private Long personId;
	private boolean active;
}
