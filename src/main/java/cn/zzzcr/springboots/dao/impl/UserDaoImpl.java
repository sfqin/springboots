package cn.zzzcr.springboots.dao.impl;

import cn.zzzcr.springboots.dao.UserDao;

import cn.zzzcr.springboots.dao.mapper.UserInfoDOMapper;
import cn.zzzcr.springboots.dao.model.UserInfoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {


    @Autowired
    private UserInfoDOMapper userInfoDOMapper;


    @Override
    public UserInfoDO selectUser(Integer id) {
        UserInfoDO userInfoDO = userInfoDOMapper.selectByPrimaryKey(id);
        return userInfoDO;
    }
}
