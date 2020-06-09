package com.noah.util;

import com.noah.dao.ExamDao;
import com.noah.dao.UserDao;
import com.noah.domain.exam;
import com.noah.domain.user;
import com.noah.service.userService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserTest {

    @Test
    public void loginTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        userService us = (userService)context.getBean("userServiceImpls");
       // us.findAll();
    }

    @Test
    public void UserSelectText() throws IOException {
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session =factory.openSession();
        UserDao userDao=session.getMapper(UserDao.class);

        List<user> list =userDao.findAll();

        for(user findUser : list){
            System.out.println(findUser);

        }

        user users=new user();
        users.setUsername("aaa");
        users.setPassword("123");
        List<user> list1=userDao.findByUsernameAndPassword(users);

        for(user findUsers : list1){
            System.out.println(findUsers);

        }

        session.commit();
        session.close();
        in.close();
    }

    @Test
    public void ExamSelectText() throws IOException {
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session =factory.openSession();
        ExamDao examDao =session.getMapper(ExamDao.class);

        System.out.println(examDao.findByCount());
//        List<exam> list =examDao.SelectQuestion(1);
//        System.out.println(examDao.SelectChooseT(1));
//        for(exam findExam : list){
//            System.out.println(findExam);
//        }
//        session.commit();
//        session.close();
//        in.close();
    }
}
