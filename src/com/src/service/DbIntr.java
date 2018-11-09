package com.src.service;

import java.sql.SQLException;
import java.util.List;

import com.src.model.Clothes;
import com.src.model.LoginModel;

import com.src.model.RegisterModel;


public interface DbIntr {

	public int addUser(RegisterModel rm) throws SQLException;
	public boolean login(LoginModel lm) throws SQLException;
	public Clothes fetchById(int id)throws SQLException ;
	public List<String> getUsernames() throws SQLException;
	public List<Clothes> fetchClothes() throws SQLException;
	

}
