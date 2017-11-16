package com.example.domain.test;

import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.time.OffsetTime;

@Getter
public class Test {

    @Id
    private String id;

    private OffsetTime test;

    public Test(String name, OffsetTime test) {
        this.test = test;
    }
}