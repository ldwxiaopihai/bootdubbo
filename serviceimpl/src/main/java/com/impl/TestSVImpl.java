package com.impl;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.config.annotation.Service;
import com.iservice.ITestSV;


/**
 * Created by lvdw on 2018/8/24 0024.
 */
@Service()
public class TestSVImpl implements ITestSV {

    @Override
    public String sayHello() {
        return "Hello";
    }
}
