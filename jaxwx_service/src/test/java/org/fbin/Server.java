package org.fbin;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.fbin.service.impl.HelloServiceImpl;

public class Server {
    public static void main(String[] args) {
        //发布服务的工厂
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();

        //设置服务地址
        factoryBean.setAddress("http://localhost:8080/ws/hello");

        //设置服务类
        factoryBean.setServiceBean(new HelloServiceImpl());

        //添加日志输入，输出拦截器，观察soap请求，响应
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getInInterceptors().add(new LoggingOutInterceptor());

        //发布服务
        factoryBean.create();

        System.out.println("发布服务成功!");
    }
}
