package org.liudk.annotation.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.liudk.annotation.DBUtils.BaseDao;

import java.util.List;

/**
 * Created by dengke.liu on 2016/08/12.
 */
@Mapper
public interface UserDao extends BaseDao<User>{

    @Select("select * from user;")
    public List<User> selectAllUser();
}
