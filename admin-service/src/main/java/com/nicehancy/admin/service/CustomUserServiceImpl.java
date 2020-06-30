package com.nicehancy.admin.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *     将用户权限交给springsecurity进行管控
 * <p/>
 *
 * @author hancaiyun
 * @since 2019/11/4 15:22
 **/
@Slf4j
@Service
public class CustomUserServiceImpl implements UserDetailsService {

    /**
     * 登陆验证时，通过username获取用户的所有权限信息
     * 并返回UserDetails放到spring的全局缓存SecurityContextHolder中，以供授权器使用
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.info("call CustomUserService loadUserByUsername, parameter:{}", username);
        //UserInfoBO user = userInfoManager.queryByUserName(username);
        //log.info("call CustomUserService loadUserByUsername result:{}", user);
        if(!"19921577717".equals(username)){
            throw new RuntimeException("用户名不存在！");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        //用于添加用户的权限。只要把用户权限添加到authorities
        authorities.add(new SimpleGrantedAuthority("admin"));

        MUserDetails userDetails = new MUserDetails();
        userDetails.setUsername("19921577717");
        userDetails.setPassword("$2a$10$eAKksvQhbi4i6vAdBF6.gOr/2WTWEZ09fduJAELyw5CFIKTUx6tXy");
        userDetails.setAuthorities(authorities);
        return userDetails;
    }
}
