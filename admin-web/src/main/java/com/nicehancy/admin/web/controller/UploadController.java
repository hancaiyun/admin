package com.nicehancy.admin.web.controller;

import com.nicehancy.admin.web.controller.base.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
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
public class UploadController extends BaseController {

    /**
     * 主页
     * @return      主页视图
     */
    @RequestMapping("/upload")
    public ModelAndView index(){
        return new ModelAndView("upload");
    }

}
