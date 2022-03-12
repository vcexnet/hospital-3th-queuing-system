package com.cdold.hqcs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cdold.hqcs.dao")
public class HospitalQueuingCallSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalQueuingCallSystemApplication.class, args);
    }

}
