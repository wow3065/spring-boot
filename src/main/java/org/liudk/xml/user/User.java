package org.liudk.xml.user;

import java.io.Serializable;

/**
 * Created by dengke.liu on 2016/08/12.
 * @author dengke.liu
 * This is user pojo.
 */
public class User implements Serializable{
    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String userage;

    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
