package com.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.iservice.ITestSV;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lvdw on 2018/8/24 0024.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    /*@Reference(url = "dubbo://localhost:20880")*/
    @Reference()
    private ITestSV iTestSV;

    @RequestMapping("/hello")
    public String index() {
        int id = 1;
        logger.debug("hahah{}", id);
        logger.warn("警告");
        logger.info("标注");
        logger.debug("标注");
        String var = iTestSV.sayHello();
        return "/service.html";

    }

}