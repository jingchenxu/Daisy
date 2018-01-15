package org.deepwater.daisy.service.user.impl;

import org.deepwater.daisy.entity.user.User;
import org.deepwater.daisy.mapper.user.UserMapper;
import org.deepwater.daisy.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User loginByName(String userName) {
        return userMapper.selectByUserName(userName);
    }
}
