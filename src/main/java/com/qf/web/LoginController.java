package com.qf.web;

import com.qf.bean.User;
import com.qf.service.UserService;
import com.qf.util.MsgSuccessUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Auther: 费龙衍
 * @Date: 2019/8/12 17:10
 * @Signature: 面 向 对 象 面 向 君 , 不 负 代 码 不 负 卿
 */
@RestController
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST,name = "/loginverify")
    public MsgSuccessUtil loginVerify(String userphone,HttpSession session){
        int k;
        User user=userService.finduser(userphone);
        MsgSuccessUtil msgSuccessUtil=new MsgSuccessUtil("");
        if(user==null){
            user.setUserPhone(userphone);
            k=userService.insertuser(userphone);
            if(k>0){
                session.setAttribute("user",user);
                return msgSuccessUtil;
            }else{
                msgSuccessUtil.setCode(1);
                msgSuccessUtil.setMsg("failure");
                msgSuccessUtil.setData("");
                return msgSuccessUtil;
            }
        }
        session.setAttribute("user",user);
        return msgSuccessUtil;
    }
}
