package com.gestdepo.model.service.dummyimpl;

import com.gestdepo.model.exception.NoUserException;
import com.gestdepo.model.service.LoginService;
import com.gestdepo.model.vo.UserVO;

public class LoginServiceImpl implements LoginService {

	@Override
	public UserVO loginUser(String userName, String pwd) throws NoUserException {
		return new UserVO(userName, pwd);
	}

	@Override
	public UserVO loginUser(UserVO userVO) throws NoUserException {
		return userVO;
	}

	@Override
	public UserVO createAccount(UserVO userVO) {
		return userVO;
	}
}
