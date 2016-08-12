package org.liudk;

import org.liudk.annotation.user.User;
import org.liudk.annotation.user.UserService;
import org.liudk.xml.user.UserXMLServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by dengke.liu on 2016/08/11.
 */
@Controller
public class WelcomeController {

    private static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @Autowired
    private UserService userService;

    @Autowired
    private UserXMLServiceImpl userServiceXml;

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/fail")
    public String fail() {
        throw new MyException("Oh dear!");
    }

    @RequestMapping("/fail2")
    public String fail2() {
        throw new IllegalStateException();
    }

    @RequestMapping("/users")
    public String selectAllUser(Map<String, Object> model){
        logger.warn("This is user annotation");
        List<User> userList = userService.selectAllUser();
        model.put("user",userList);
        return "user";
    }

    @RequestMapping("/userxml")
    public String selectAllUserXML(Map<String, Object> model){
        logger.warn("This is user xml");
        List<org.liudk.xml.user.User> userList = userServiceXml.selectAllUser();
        model.put("user",userList);
        return "user";
    }

    @ExceptionHandler(MyException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody MyRestResponse handleMyRuntimeException(MyException exception) {
        return new MyRestResponse("Some data I want to send back to the client.");
    }
}
