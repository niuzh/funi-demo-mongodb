package com.funi.demo.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录业务控制器
 * @author zhihuan.niu
 */
@Controller
public class LoginController {

    protected static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    /*
    * ModelAndView 包括视图信息和渲染视图的模型数据信息
    * 数据模型对象放置到request的属性中
    * */
    @RequestMapping("/")
    public String homePage() {
        logger.trace("trace测试 ");
        logger.debug("debug测试 ");
        logger.info("info测试");
        logger.warn("warn测试");
        logger.error("error测试");
        /*logger.error("error",new RuntimeException("test"));
        logger.error("error",new RuntimeException("test"));*/
        return "index";
    }
}
