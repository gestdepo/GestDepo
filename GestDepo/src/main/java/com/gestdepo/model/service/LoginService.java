package com.gestdepo.model.service;

import com.gestdepo.model.exception.NoUserException;
import com.gestdepo.model.vo.UserVO;

public interface LoginService {
	
	public UserVO loginUser(String userName, String pwd) throws NoUserException;
	public UserVO loginUser(UserVO userVO) throws NoUserException;
	
	public UserVO createAccount(UserVO userVO);
	
}
