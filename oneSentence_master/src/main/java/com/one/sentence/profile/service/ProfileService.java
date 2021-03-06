package com.one.sentence.profile.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.one.sentence.common.vo.UserVo;
import com.one.sentence.profile.dao.ProfileDao;

@Service
public class ProfileService implements IProfileService{

	@Inject
	private ProfileDao dao;

	@Override
	public void changeUser_info(int userIdx, String userPassword, String userName, String userIntroduction) {	
		dao.updateUser_info(userIdx, userPassword, userName, userIntroduction);	
	}

	@Override
	public UserVo showUser_infoByuserIdx(int userIdx) {
		return dao.selectUser_infoByuserIdx(userIdx);
	}

}
