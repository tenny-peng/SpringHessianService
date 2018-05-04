package com.tenny;

import org.springframework.stereotype.Service;

/**
 * @author tenny
 *
 */
@Service
public class HelloImpl implements IHello {

    @Override
    public String hello(String name) {
        String result = "hello " + name;
        System.out.println("service result: " + result);
        return result;
    }

}
