package com.nicehancy.admin.web.controller;

import com.nicehancy.admin.web.controller.base.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 主页面
 * <p>
 * <p/>
 *
 * @author hancaiyun
 * @since 2019/11/29 11:25
 **/
@Slf4j
@Controller
public class HomeController extends BaseController {

    /**
     * 自定义登录页面
     * @param error 错误信息显示标识
     * @return      登录页
     *
     */
    @GetMapping("/login")
    public ModelAndView login(String error){
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("error", error);
        return modelAndView;
    }

    /**
     * 主页
     * @return      主页视图
     */
    @RequestMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    /**
     * 欢迎页
     * @return      欢迎页视图
     */
    @RequestMapping("/welcome")
    public ModelAndView welcome(){
        return new ModelAndView("component/welcome");
    }
}
