package com.study.effective.chapter01;

public class HelloServiceFactory {

    public static void main(String[] args) {
        HelloService ko = HelloService.of("ko");
        System.out.println(ko.hello());
    }

}
