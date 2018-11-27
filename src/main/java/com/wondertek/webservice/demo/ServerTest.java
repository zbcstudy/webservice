package com.wondertek.webservice.demo;

import javax.xml.ws.Endpoint;

/**
 * 发布webservice
 */
public class ServerTest {

    public static void main(String[] args) {
        String address = "http://192.168.1.108:8989/hellos";

        Endpoint.publish(address, new HelloImpl());
        System.out.println("发布成功");
    }
}
