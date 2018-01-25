package com.kutaybezci.buildingmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.kutaybezci.buildingmanager.bl.UserBo;

@Component
public class ApplicationEventListener implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private UserBo userBo;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		userBo.createInitialUser();
	}

}
