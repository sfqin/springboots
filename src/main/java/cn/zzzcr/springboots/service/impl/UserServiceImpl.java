package cn.zzzcr.springboots.service.impl;

import cn.zzzcr.springboots.dao.UserDao;
import cn.zzzcr.springboots.dao.model.UserInfoDO;
import cn.zzzcr.springboots.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public UserInfoDO selectUser(Integer id) {
        return userDao.selectUser(id);
    }
}
