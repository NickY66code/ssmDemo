package com.noah.service.impl;

import com.noah.dao.UserDao;
import com.noah.domain.user;
import com.noah.service.userService;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userServiceImpls")
public class userServiceImpl implements userService {

    @Autowired
    UserDao userDao ;

    @Override
    public List<user> findUser(user users) {
        List<user> list=userDao.findUsers(users);
        return list;
    }

    @Override
    public boolean SelectUser(user users) {
        List<user> list =userDao.findByUsernameAndPassword(users);

        if(list.isEmpty())
        {
            return false;
        }else {
            return true;
        }
    }

}
