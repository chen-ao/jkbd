package com.qf.web;

import com.qf.bean.Specialtype;
import com.qf.bean.Subject1;
import com.qf.service.Subject1Service;
import com.qf.util.MsgSuccessUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @auther 费龙衍
 * @date 2019/7/30 21:37
 * 面向对象面向君,不负代码不负卿
 */
@RestController
public class Subject1Controller {

    @Resource
    private Subject1Service subject1Service;

    //顺序练习,模拟练习_全部模拟
    @RequestMapping("/subject1/alltest")
    public MsgSuccessUtil findall(@RequestParam(defaultValue = "1") int index){
        List<Subject1> list=subject1Service.findall(index);
        MsgSuccessUtil msgSuccessUtil=new MsgSuccessUtil();
        msgSuccessUtil.setData(list);
        return msgSuccessUtil;
    }

    //模拟练习_优先未做题
    @RequestMapping("/subject1/unfinishedtest")
    public MsgSuccessUtil undotest(int userID){
        List<Subject1> list=subject1Service.unfinishedtest(userID);
        MsgSuccessUtil msgSuccessUtil=new MsgSuccessUtil();
        msgSuccessUtil.setData(list);
        return msgSuccessUtil;
    }

    //VIP课堂
    @RequestMapping("/subject1/viptest")
    public MsgSuccessUtil viptest(){
        List<Subject1> list=subject1Service.viptest();
        MsgSuccessUtil msgSuccessUtil=new MsgSuccessUtil();
        msgSuccessUtil.setData(list);
        return msgSuccessUtil;
    }

    //收藏题
    @RequestMapping("/subject1/collect")
    public void collectiontest(int questionID,int userID, ServletResponse response){
        int k=subject1Service.collect(questionID,userID);
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            if(k>0){
                out.print("true");
            }else{
                out.print("false");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //专项练习_获取练习项
    @RequestMapping("/subject1/specialtypetest")
    public MsgSuccessUtil specialtypetest(){
        List<Specialtype> specialtypes=subject1Service.specialtypetest();
        MsgSuccessUtil msgSuccessUtil=new MsgSuccessUtil();
        msgSuccessUtil.setData(specialtypes);
        return msgSuccessUtil;
    }
    //开始练习
    @RequestMapping("/subject1/dosttest")
    public MsgSuccessUtil doSTtest(int specialtypeID){
        List<Subject1> list=subject1Service.doSTtest(specialtypeID);
        MsgSuccessUtil msgSuccessUtil=new MsgSuccessUtil();
        msgSuccessUtil.setData(list);
        return msgSuccessUtil;
    }

    //错题练习_获取练习项
    @RequestMapping("/subject1/errorstest")
    public MsgSuccessUtil itemstest(){
        List<Specialtype> list=subject1Service.errorSTtest();
        MsgSuccessUtil msgSuccessUtil=new MsgSuccessUtil();
        msgSuccessUtil.setData(list);
        return msgSuccessUtil;
    }
    //错题练习_开始错题练习
    @RequestMapping("subject1/doerrosttest")
    public MsgSuccessUtil doerrorSTtest(int specialtypeID){
        List<Subject1> list=subject1Service.doerrorSTtest(specialtypeID);
        MsgSuccessUtil msgSuccessUtil=new MsgSuccessUtil();
        msgSuccessUtil.setData(list);
        return msgSuccessUtil;
    }

    //随机练习
    @RequestMapping("/subject1/randomtest")
    public MsgSuccessUtil randomtest(){
        List<Subject1> list=subject1Service.randomtest();
        MsgSuccessUtil msgSuccessUtil=new MsgSuccessUtil();
        msgSuccessUtil.setData(list);
        return msgSuccessUtil;
    }
}
