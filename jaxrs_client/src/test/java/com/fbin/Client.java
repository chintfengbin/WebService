package com.fbin;

import com.fbin.enitity.Car;
import com.fbin.enitity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {


    @Test
    public void tsetSave(){
        User user = new User();
        user.setId(1);
        user.setCity("上海");
        user.setUsername("冯斌");
        user.setCars(null);
        WebClient.create("http://localhost:8080/ws/userService/user").type(MediaType.APPLICATION_JSON_TYPE).post(user);
    }

    @Test
    public void testGet(){
        User user = WebClient.create("http://localhost:8080/ws/userService/user/1").type(MediaType.APPLICATION_JSON_TYPE).get(User.class);
        System.out.println(user);
    }
}
