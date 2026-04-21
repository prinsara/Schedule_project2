package com.example.schedule_project2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //HTTP 요청을 받고, 결과를 JSON 응답으로 돌려주는 컨트롤러이다.
@RequestMapping("/schedules") //기본 주소값 지정
@RequiredArgsConstructor //final 붙은 필드들로 생성자를 자동으로 만들어줘서 의존성 주입을 쉽게 하게 해주는 것
public class ScheduleController {

    @PostMapping
    public void createSchedule() {

    }
}
