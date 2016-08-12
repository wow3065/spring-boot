package org.liudk;

/**
 * Created by dengke.liu on 2016/08/11.
 */
public class MyRestResponse {
    private String message;

    public MyRestResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
