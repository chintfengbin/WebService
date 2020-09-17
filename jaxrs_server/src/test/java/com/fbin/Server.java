package com.fbin;

import com.fbin.service.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class Server {

    public static void main(String[] args) {
        //创建发布服务工厂
        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();

        //设置服务地址
        factoryBean.setAddress("http://localhost:8080/ws/");

        //设置服务类
        factoryBean.setServiceBean(new UserServiceImpl());

        //添加日志输入输出拦截器
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());

        //发布服务成功
        factoryBean.create();

        System.out.println("success!");
    }


}
