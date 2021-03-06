package com.qf.web;

import com.qf.bean.User;
import com.qf.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 鸡你太美
 */
@RestController
public class UserController {
    @Resource
    private UserInfoService userInfoService;


   @RequestMapping("/selectUserInfo")
   public Map getUserInfoById(int userId){
       Map map = new HashMap();
       map.put("code",0);
       map.put("msg","成功了");

       User u = userInfoService.selectByPrimaryKey(userId);

       Map dataMap = new HashMap();
       dataMap.put("user",u);
       map.put("data",dataMap);
       return map;
   }

    @RequestMapping("/addUserInfo")
   public Map addUserInfo(User u){
       Map map = new HashMap();

       int i = userInfoService.insertSelective(u);
       if(i>0) {
           map.put("msg","新增成功");
       }else{
           map.put("msg","新增失败");
       }


       return map;
   }

    @RequestMapping("/updateUserInfo")
    public Map updateUserInfo(User user){
        Map map = new HashMap();
        map.put("code:",0);


        int i = userInfoService.updateByPrimaryKeySelective(user);
        if(i>0) {
            map.put("msg","修改成功");
        }else{
            map.put("msg","修改失败");
        }


        return map;
    }

    @RequestMapping("/deleteUser")
    public Map deleteUser(int userId){
       Map map = new HashMap();
        map.put("code:",0);
        int i = userInfoService.deleteByPrimaryKey(userId);
        if(i>0) {
            map.put("msg","删除成功");
        }else{
            map.put("msg","删除失败");
        }
        return  map;
    }









}
