package com.noah.controller;

import com.noah.dao.ExamDao;
import com.noah.dao.UserDao;
import com.noah.dao.UserScoresDao;
import com.noah.domain.exam;
import com.noah.domain.user;
import com.noah.service.impl.ExamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ExamController {

    @Autowired
    ExamServiceImpl examService;

    @Autowired
    UserScoresDao userScoresDao;

    @Autowired
    ExamDao examDao;

    @RequestMapping("/success")
        public String BeganExamMethod(exam exams,user users,Model model){

        Integer num =1;
        users.setScores(0.0);
        model.addAttribute("scores",users.getScores());

        exams = examDao.SelectQuestion(num);
        model.addAttribute("quesId",exams.getQuesId());
        model.addAttribute("question",exams.getQuestion());
        model.addAttribute("answerA",exams.getAnswerA());
        model.addAttribute("answerB",exams.getAnswerB());
        model.addAttribute("answerC",exams.getAnswerC());
        model.addAttribute("answerD",exams.getAnswerD());

        System.out.println(users.getScores());
        System.out.println(exams);
            return "exam";

        }

    @RequestMapping("/exams")
    public String ExamMethod(exam exams, user users, Model model, HttpSession session){

        System.out.println("service:exam");
     //   System.out.println(exams);
        if(examService.TrueAnswer(exams)){
            users.setScores(users.getScores()+10);
            model.addAttribute("scores",users.getScores());
            System.out.println(users.getScores());

            Integer num =exams.getQuesId();
            exams.setQuesId(num+1);
            System.out.println(exams.getQuesId());

            if(examService.NextQues(exams)){
                exams = examDao.SelectQuestion(exams.getQuesId());
                model.addAttribute("quesId",exams.getQuesId());
                model.addAttribute("question",exams.getQuestion());
                model.addAttribute("answerA",exams.getAnswerA());
                model.addAttribute("answerB",exams.getAnswerB());
                model.addAttribute("answerC",exams.getAnswerC());
                model.addAttribute("answerD",exams.getAnswerD());
                System.out.println(exams);
            }
            return "exam";
        }else
            model.addAttribute("scores",users.getScores());
            users.setUsername((String)session.getAttribute("username"));
            users.setId((Integer)session.getAttribute("id"));
            userScoresDao.InsertScores(users);
            return "examClose";
    }

    @RequestMapping("/examClose")
    public String examCloMethod(user users,Model model){
        model.addAttribute("scores",users.getScores());
        return "examClose" ;
    }

    @RequestMapping("/rank")
    public String RankMethod(Model model){

        List<user> list = userScoresDao.SelectRank();
        model.addAttribute("list",list);
        for(user UserRank:list){
            System.out.println(list);
        }

        int num =userScoresDao.SelectNum();
        model.addAttribute("count",num);
        return "rank";
    }
}
