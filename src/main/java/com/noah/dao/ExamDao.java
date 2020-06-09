package com.noah.dao;

import com.noah.domain.exam;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamDao {
    @Select("select * from exam where quesId=#{quesId}")
    public exam SelectQuestion(Integer quesId);

    @Select("select ChooseT from exam where quesId= #{quesId}")
    public String SelectChooseT(Integer quesId);

    @Select("select count(quesId) from exam")
    public int findByCount();
}
