package org.example;

import org.example.myinfo.MyInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath:BeanConfig.xml"})//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        MyInfo info = (MyInfo) context.getBean("my_Info1");

        System.out.println(info.getName());
        System.out.println(info.getAge());
        System.out.println(info.getHomeDistrictHomeDistrict());
        System.out.println(info.getMyAssets().getComputer());
        System.out.println(info.getMyAssets().getMoney());
        System.out.println(info.getMyAssets().getTable());

    }
}