package org.liudk.xml.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.liudk.annotation.DBUtils.BaseDao;

import java.util.List;

/**
 * Created by dengke.liu on 2016/08/12.
 */
@Mapper
public interface UserXMLDao {

    public List<User> selectAllUser();
}
