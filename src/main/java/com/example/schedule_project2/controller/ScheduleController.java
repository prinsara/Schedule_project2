package com.example.schedule_project2.controller;

import com.example.schedule_project2.dto.CreateScheduleRequest;
import com.example.schedule_project2.dto.CreateScheduleResponse;
import com.example.schedule_project2.dto.GetScheduleResponse;
import com.example.schedule_project2.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //HTTP 요청을 받고, 결과를 JSON 응답으로 돌려주는 컨트롤러이다.
@RequestMapping("/schedules") //기본 주소값 지정
@RequiredArgsConstructor //final 붙은 필드들로 생성자를 자동으로 만들어줘서 의존성 주입을 쉽게 하게 해주는 것
public class ScheduleController {

    private final ScheduleService scheduleService;

    //저장
    @PostMapping
    public ResponseEntity<CreateScheduleResponse> createSchedule(@RequestBody CreateScheduleRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(scheduleService.createSchedule(request));
    }

    //전체 조회
    @GetMapping
    public ResponseEntity<List<GetScheduleResponse>> getSchedule() {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.getSchedule());
    }
}
