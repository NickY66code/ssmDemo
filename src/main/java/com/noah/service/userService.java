package com.noah.service;

import com.noah.domain.user;

import java.util.List;

public interface userService {
    public List<user> findUser(user users);

    public boolean SelectUser(user users);

}
