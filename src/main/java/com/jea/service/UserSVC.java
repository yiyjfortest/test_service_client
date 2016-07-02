package com.jea.service;

import com.jea.vo.UserVO;

public interface UserSVC {
	public boolean hasMathUser(String userName, String password) throws Exception;
	public UserVO findUserByUserName(String userName) throws Exception;
}
