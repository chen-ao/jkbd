package com.qf.service;

import com.qf.bean.User;

/**
 * @Description:
 * @Auther: 费龙衍
 * @Date: 2019/8/12 12:05
 * @Signature: 面 向 对 象 面 向 君 , 不 负 代 码 不 负 卿
 */
public interface UserService {

    User finduser(String userphone);

    int insertuser(String userphone);

}
