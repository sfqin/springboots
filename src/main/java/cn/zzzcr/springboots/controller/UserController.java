package cn.zzzcr.springboots.controller;

import cn.zzzcr.springboots.dao.model.UserInfoDO;
import cn.zzzcr.springboots.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String test(String param){

        logger.debug("------------------------ dubug");
        logger.debug("------------------------ info");
        logger.debug("------------------------ warn");
        logger.debug("------------------------ error");


        return param+"12345";
    }

    @GetMapping("/id")
    public UserInfoDO getUserById(Integer id){
        return userService.selectUser(id);
    }


}
