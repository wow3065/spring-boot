package org.liudk.annotation.user;

import java.util.List;

/**
 * Created by dengke.liu on 2016/08/12.
 */
public interface UserService {
    //public void saveUser(User user);
    public List<User> selectAllUser();
}
