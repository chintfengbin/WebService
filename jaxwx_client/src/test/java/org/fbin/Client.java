package org.fbin;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.fbin.service.HelloService;

public class Client {
    public static void main(String[] args) {
        //服务接口访问地址

        //创建cxf代理工厂
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();

        //设置远程访问服务端地址
        factoryBean.setAddress("http://localhost:8080/ws/hello");

        //设置接口类型
        factoryBean.setServiceClass(HelloService.class);

        //对接口生成代理对象
        HelloService helloService = factoryBean.create(HelloService.class);

        System.out.println(helloService.getClass());

        //远程访问服务端方法
        String content = helloService.sayHello("fbin");
        System.out.println(content);
    }
}
