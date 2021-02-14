package com.andy.ba04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Andy
 * @Date: 2021/1/26 - 13:47
 * @Description: com.andy.ba02
 */
@Component("mySchool")
public class School {
    @Value("NCEPU")
    private String name;
    @Value("北京")
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
