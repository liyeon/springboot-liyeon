package com.liyeon.book.springboot.web;

import com.liyeon.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//컨트롤러를 JSON을 반환하는 컨트롤러로 만들어줌
//이전 스프링프레임워크에서는 @ResponseBody를 각 메소드 마다 선언했던것을 한번에 사용 할 수 있게 해줌
public class HelloController {
    @GetMapping("/hello")
    /*
     * HTTP Method인 Get 요청을 받을 수 있는 API를 만들어줌
     * 이전에는 @RequestMapping(method=RequestMethod.GET) 으로 사용되었음
     * 이제 이 프로젝트는 /hello 요청이 오면 문자열 hello를 반환하는 기능을 가지게 됨
     */
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount
                                     ){
        return new HelloResponseDto(name, amount);
    }
}