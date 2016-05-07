package com.muahmed.epos.dao;

import java.util.List;
import com.muahmed.epos.model.User;

public interface UserDAO {
	
	public void saveUser(User user) ;
	public List<User> listUser() ;
}