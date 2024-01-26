package com.wy.controller;

import com.wy.pojo.User;
import com.wy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("allUser")
    public String list(Model model){
        List<User> users = userService.selectUsers();
        model.addAttribute("users", users);
        for(User user:users){
            System.out.println(user);
        }
        return "allUser";
    }
}
