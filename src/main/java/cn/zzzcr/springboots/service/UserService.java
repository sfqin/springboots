package cn.zzzcr.springboots.service;


import cn.zzzcr.springboots.dao.model.UserInfoDO;


public interface UserService {


    UserInfoDO selectUser(Integer id);

}
