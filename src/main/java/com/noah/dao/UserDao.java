package com.noah.dao;

import com.noah.domain.user;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select("select * from users")
    public List<user> findAll();

    @Select("select * from users where username=#{username} and password=#{password}")
    public List<user> findByUsernameAndPassword(user users);

    @Select("select * from users where username=#{username}")
    public List<user> findUsers(user users);

    @Select("select * from users where username=#{username}")
    public user findUser(String username);

    @Update("update users set username =#{username},sex=#{sex},address=#{address},password=#{password} where id=#{id}")
    public void UpdateUserMess(user users);
}
