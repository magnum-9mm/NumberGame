package com.NumberGame.NumberGame.Dao;

import org.springframework.data.repository.CrudRepository;

import com.NumberGame.NumberGame.Model.UserData;

public interface UserDao extends CrudRepository<UserData, Integer>{

}
