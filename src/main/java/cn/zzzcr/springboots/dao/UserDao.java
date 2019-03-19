package cn.zzzcr.springboots.dao;


import cn.zzzcr.springboots.dao.model.UserInfoDO;



public interface UserDao {

    UserInfoDO selectUser(Integer id);

}
