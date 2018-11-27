package com.wondertek.webservice.client.test;

import com.wondertek.webservice.demo.HelloImpl;
import com.wondertek.webservice.demo.HelloImplService;

/**h
 * 调用webservice
 */
public class ClientTest {

    public static void main(String[] args) {
        HelloImplService factory = new HelloImplService();
        HelloImpl helloImpl = factory.getHelloImplPort();
        System.out.println(helloImpl.sayHello("zhaobicheng"));
    }
}
