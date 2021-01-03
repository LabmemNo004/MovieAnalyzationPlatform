package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.Entity.user;
import com.example.demo.JSON.JsonResult;
import com.example.demo.service.TokenService;
import com.example.demo.annotation.UserLoginToken;
import com.example.demo.service.numberService;
import com.example.demo.service.userService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value="/User",produces = "application/json;charset=UTF-8")
@CrossOrigin
public class UserController {

    @Autowired
    numberService NumberService;

    @Autowired
    userService UserService;

    @Autowired
    TokenService tokenService;




    @GetMapping(value = "/login")
    @ApiOperation(value = "登陆", notes = "输入手机号，密码登陆")
    public JsonResult login(
            @RequestParam("phone") String phone,
            @RequestParam("password") String password
    )
    {
        StopWatch myWatch = new StopWatch("myWatch");
        myWatch.start("task1");






        int temp1=0;
        myWatch.stop();
        return new JsonResult(temp1,
                "成功",myWatch.getLastTaskTimeMillis());
    }



    @GetMapping(value = "/register")
    @ApiOperation(value = "注册", notes = "输入手机号，密码，用户名注册")
    public JsonResult register(
            @RequestParam("phone") String phone,
            @RequestParam("password") String password,
            @RequestParam("username") String username
    )
    {
        StopWatch myWatch = new StopWatch("myWatch");
        myWatch.start("task1");
        user u=new user();

        JSONObject thisUser=new JSONObject();

        Integer temp=NumberService.getSimpleNumbers().getUserNumadd();
        thisUser.put("userID",temp);

        u.setUserID(temp);
        u.setPhone(phone);
        u.setProfileName(username);
        u.setPassword(password);
        u.setRole(0);
        UserService.saveUser(u);
        //在存储表中id自增。
        //非修改id直接传0
        NumberService.updataNumber(++temp,0,0);

        String token = tokenService.getToken(temp - 1,password);
        thisUser.put("token",token);


        myWatch.stop();
        return new JsonResult(thisUser,"注册成功",myWatch.getLastTaskTimeMillis());
    }





    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }




    @PostMapping(value = "/ModifyInformation")
    @ApiOperation(value = "修改个人信息", notes = "前端传递修改项")
    public JsonResult ModifyInformation(
            @RequestParam(value = "username",required = false) String username,
            @RequestParam(value = "avatar",required = false) String avatar,
            @RequestParam(value = "sex",required = false) Integer sex,
            @RequestParam(value = "birthday",required = false) Date birthday,
            @RequestParam(value = "phone",required = false) String phone,
            @RequestParam(value = "email",required = false) String email,
            @RequestParam(value = "signature",required = false) String signature
    )
    {
        StopWatch myWatch = new StopWatch("myWatch");
        myWatch.start("task1");
        int temp1=0;
        myWatch.stop();
        return new JsonResult(temp1,
                "成功",myWatch.getLastTaskTimeMillis());
    }

    @GetMapping(value = "/GetInformation")
    @ApiOperation(value = "获取个人信息", notes = "传递token和id确认身份")
    public JsonResult SaveInformation(
            @RequestParam("token") String token,
            @RequestParam("userid") String userid
    )
    {
        StopWatch myWatch = new StopWatch("myWatch");
        myWatch.start("task1");
        int temp1=0;
        myWatch.stop();
        return new JsonResult(temp1,
                "成功",myWatch.getLastTaskTimeMillis());
    }

    @GetMapping(value = "/PersonalHomePage")
    @ApiOperation(value = "展示个人信息主页",
            notes = "传递token和id确认身份,要展示评论电影的分页情况，以及评论收藏总数")
    public JsonResult PersonalHomePage(
            @RequestParam("token") String token,
            @RequestParam("userid") String userid
    )
    {
        StopWatch myWatch = new StopWatch("myWatch");
        myWatch.start("task1");
        int temp1=0;
        myWatch.stop();
        return new JsonResult(temp1,
                "成功",myWatch.getLastTaskTimeMillis());
    }

    @GetMapping(value = "/CollectionMovie")
    @ApiOperation(value = "展示个人收藏",
            notes = "传递token和id确认身份,要展示收藏电影的分页情况")
    public JsonResult CollectionMovie(
            @RequestParam("token") String token,
            @RequestParam("userid") String userid
    )
    {
        StopWatch myWatch = new StopWatch("myWatch");
        myWatch.start("task1");
        int temp1=0;
        myWatch.stop();
        return new JsonResult(temp1,
                "成功",myWatch.getLastTaskTimeMillis());
    }


}
