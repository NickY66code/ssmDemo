package com.noah.service.impl;

import com.noah.dao.ExamDao;
import com.noah.domain.exam;
import com.noah.domain.user;
import com.noah.service.examService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl implements examService {

    @Autowired
    ExamDao examDao;

    int count =0;


    public boolean TrueAnswer(exam exams){
        count =examDao.findByCount();
        String  TrueAns = examDao.SelectChooseT(exams.getQuesId());

        System.out.println(TrueAns);
        if(exams.getChoose().equals(TrueAns) && exams.getQuesId()<count ){
            return true;
        }else
            return false;
    }

    public boolean NextQues(exam exams){
        count =examDao.findByCount();
        if (exams.getQuesId()!=1 && exams.getQuesId()<=count){
            return true;
        }else {
            return false;
        }
    }
}
