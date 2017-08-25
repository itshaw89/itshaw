package com.itshaw.blog.web;

import com.itshaw.blog.domain.UserInfo;
import com.itshaw.blog.repository.UserRepository;
import com.itshaw.blog.util.CookieUtil;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jetty.server.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
@Slf4j
@CacheConfig(cacheNames = "guavaDemo")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * 注册用户.
     * @return
     */
    @PostMapping("/")
    public String register(UserInfo userInfo){
        log.info("log register");
        // 内存数据库操作
        userRepository.save(userInfo);
        return "save ok";
    }

    /**
     * 获取所有数据.
     * @return
     */
    @GetMapping("/")
    @Cacheable
    public Iterable<UserInfo> findAll(){
        log.info("log findAll");
        // 内存数据库操作
        return userRepository.findAll();
    }

    @PostMapping("/login")
    public String login(UserInfo userInfo,HttpServletRequest request,HttpServletResponse response){
        HttpSession session = request.getSession();
        UserInfo userInfoTmp = userRepository.findByEmail(userInfo.getEmail());

        if(userInfoTmp != null && userInfoTmp.getPassword().equals(userInfo.getPassword())){
            String token = UUID.randomUUID().toString();
            CookieUtil.addCookie(response, "token", token,86400);
            session.setAttribute("token",token);
            return token;
        }
        return "failure";
    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest request,HttpServletResponse response){
        HttpSession session = request.getSession();
        CookieUtil.addCookie(response, "token", null,1);
        session.setAttribute("token",null);
        return "success";
    }
}
