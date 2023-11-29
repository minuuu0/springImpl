package org.example;


import org.example.controller.ControllerB;
import org.example.controller.ControllerD;

public class FrameworkApplication {
    public static void main(String[] args) throws Exception{
        SimpleDIContainer container = new SimpleDIContainer("org.example"); // 스캔 요청

        ControllerD controllerD = container.getBean(ControllerD.class); // 객체 요청

        System.out.println("주입 확인: " + controllerD.getControllerB()); // 의존 관계 확인

    }
}