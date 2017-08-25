package com.itshaw.blog;

import com.itshaw.blog.filter.AuthorizeFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ServletComponentScan
@Controller
@EnableCaching
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String home(HttpServletRequest request) {
        return "forward:/html5/login.html";
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(AuthorizeFilter authorizeFilter) {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(authorizeFilter);
        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/html5/admin/*");
        urlPatterns.add("/html5/demo/*");
        registrationBean.setUrlPatterns(urlPatterns);
        return registrationBean;
    }

    @Bean
    public AuthorizeFilter authorizeFilter(){
        return new AuthorizeFilter();
    }

}