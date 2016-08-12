package org.liudk.annotation.DBUtils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by dengke.liu on 2016/08/11.
 */
public interface BaseDao<T> extends Mapper<T>,MySqlMapper<T> {

}
