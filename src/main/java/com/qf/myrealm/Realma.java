package com.qf.myrealm;

import com.qf.bean.User;
import com.qf.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

/**
 * @Description:
 * @Auther: 费龙衍
 * @Date: 2019/8/12 11:55
 * @Signature: 面 向 对 象 面 向 君 , 不 负 代 码 不 负 卿
 */
public class Realma extends AuthorizingRealm {

    @Resource
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //1.得到输入的用户信息
        String username=(String) authenticationToken.getPrincipal();
        //2.根据用户名获得数据库用户密码
        User user=userService.finduser(username);
        if(user==null){
            return null;
        }
        SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(username,user.getUserPassword(),ByteSource.Util.bytes(user.getUserSalt()),"Realma");
        return info;
    }
}
