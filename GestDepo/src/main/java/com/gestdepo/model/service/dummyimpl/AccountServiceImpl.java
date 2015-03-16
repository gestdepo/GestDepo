package com.gestdepo.model.service.dummyimpl;

import java.util.ArrayList;

import com.gestdepo.model.exception.NoUserException;
import com.gestdepo.model.service.AccountService;
import com.gestdepo.model.vo.Rol;
import com.gestdepo.model.vo.UserVO;

public class AccountServiceImpl implements AccountService {

	@Override
	public UserVO loginUser(String email, String userName, String pwd) throws NoUserException {
		return new UserVO(email, userName, pwd, "DummyName", "DummyLastName", "", new ArrayList<Rol>());
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
