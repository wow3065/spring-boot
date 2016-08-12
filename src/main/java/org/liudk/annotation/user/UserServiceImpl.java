package org.liudk.annotation.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dengke.liu on 2016/08/12.
 */
@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired(required=false)
    private UserDao userDao;

    @Override
    public List<User> selectAllUser() {
        List<User> userList = null;
        try{
            userList = userDao.selectAllUser();
        }catch (Exception e){
            logger.error(e.toString());
        }
        return userList;
    }
}
