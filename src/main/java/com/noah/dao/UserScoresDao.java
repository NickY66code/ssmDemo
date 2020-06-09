package com.noah.dao;

import com.noah.domain.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserScoresDao {

    @Insert("insert into userScores(userId,username,scores) value(#{id},#{username},#{scores})")
    public void InsertScores(user users);

    @Select("select userId id,username,scores from userscores order by scores desc")
    public List<user> SelectRank();

    @Select("select count(userId) from userscores")
    public  int SelectNum();
}
