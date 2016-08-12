package org.liudk.xml.user;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dengke.liu on 2016/08/12.
 */
@Service
public class UserXMLServiceImpl implements UserXMLService {

    private static Logger logger = LoggerFactory.getLogger(UserXMLServiceImpl.class);

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<User> selectAllUser() {
        List<User> userList = null;
        try{
            userList = this.sqlSession.selectList("selectAllUser");
        }catch (Exception e){
            logger.error(e.toString());
        }
        return userList;
    }
}
