package com.gestdepo.model.service.dummyimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.gestdepo.model.exception.NoUserException;
import com.gestdepo.model.service.AccountService;
import com.gestdepo.model.vo.Rol;
import com.gestdepo.model.vo.UserVO;

public class AccountServiceImpl implements AccountService {

	@Override
	public UserVO loginUser(long userId, String email, String userName, String pwd) throws NoUserException {
		return new UserVO(userId, email, userName, pwd, "DummyName", "DummyLastName", "", new Locale("ES"), new ArrayList<Rol>());
	}

	@Override
	public UserVO loginUser(UserVO userVO) throws NoUserException {
		return userVO;
	}

	@Override
	public UserVO createAccount(UserVO userVO) {
		userVO.setUserId(0l);
		return userVO;
	}

	@Override
	public List<Rol> getPossibleRols(Locale locale) {
		List<Rol> rols = new ArrayList<Rol>();
		rols.add(new Rol(1, "Coordinator", "ES"));
		rols.add(new Rol(2, "Coach", "ES"));
		rols.add(new Rol(3, "Player", "ES"));
		return rols;
	}

	@Override
	public UserVO getLogedUser(long loginId) {
		return new UserVO();
	}
	
}
