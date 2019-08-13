package com.qf.service.impl;

import com.qf.bean.User;
import com.qf.dao.UserDao;
import com.qf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Auther: 费龙衍
 * @Date: 2019/8/12 12:06
 * @Signature: 面 向 对 象 面 向 君 , 不 负 代 码 不 负 卿
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User finduser(String userphone) {
        Map map=new HashMap();
        map.put("userphone",userphone);
        return userDao.finduser(map);
    }

    @Override
    @Transactional
    public int insertuser(String userphone) {
        User user=new User();
        StringBuffer nick=new StringBuffer("用户"+(int) (Math.random()*8+1));
        for (int i=0;i<9;i++){
            nick.append((int)Math.random()*9);
        }
        String usernick=nick.toString();
        user.setUserPhone(userphone);
        user.setUserNick(usernick);
        int k=userDao.insertSelective(user);
        return k;
    }
}
