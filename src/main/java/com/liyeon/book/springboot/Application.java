package com.liyeon.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableJpaAuditing //JPA Auditing 활성화
@SpringBootApplication
/*
Applicaion 클래스는 앞으로 만들 프로젝트의 메인 클래스가 됨
@SpringBootApplication 으로 스프링 부트의 자동 설정, 스프링 Bean읽기와 생성 모두 자동으로 설정됨
@SpringBootApplicatio이 있는 위치부터 설정을 읽어나가기에 이 클래스는 항상 프로젝트의 최상단에 위치해야함
*F
*
*/
public class Application {
    public static void main(String[] args) {
        //SpringApplicaion.run 으로 인해 내장 WAS(Web Application Server 웹 어플리케이션서버)를 실행함
        //내장 was는 별도로 외부에 서버를 두지 않고 애플리케이션을 실행 할 때 내부에서 was를 실행하는 것을 얘기함
        //이러므로 톰캣이 필요 없고 스프링 부트에서 만들어진Jar(실행가능한 java패키징 파일)로 실행 가능
        SpringApplication.run(Application.class, args);
    }
}
