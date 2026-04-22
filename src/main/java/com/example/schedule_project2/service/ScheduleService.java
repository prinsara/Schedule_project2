package com.example.schedule_project2.service;

import com.example.schedule_project2.dto.CreateScheduleRequest;
import com.example.schedule_project2.dto.CreateScheduleResponse;
import com.example.schedule_project2.dto.GetScheduleResponse;
import com.example.schedule_project2.entity.Schedule;
import com.example.schedule_project2.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    //Repository 필드 만들어주기
    private final ScheduleRepository scheduleRepository;

    //저장
    //요청 DTO 받아오기
    @Transactional
    public CreateScheduleResponse createSchedule(CreateScheduleRequest request) {

        //요청 DTO를 DB에 저장하기 위해 Entity로 바꿔주기
        Schedule schedule = new Schedule(
                request.getName(),
                request.getTitle(),
                request.getContent()
        );

        //해당 객체를 Repository에 담아주기
        Schedule addSchedule = scheduleRepository.save(schedule);

        //응답 Dto로 변환
        CreateScheduleResponse response = new CreateScheduleResponse(
                addSchedule.getId(),
                addSchedule.getName(),
                addSchedule.getTitle(),
                addSchedule.getContent(),
                addSchedule.getCreatedAt(),
                addSchedule.getModifiedAt()
        );

        //반환해주기
        return response;
    }

    //전체(다건)조회
    //조회만 하기
    @Transactional(readOnly = true)
    public List<GetScheduleResponse> getSchedule() {

        //1. DB에서 데이터 꺼내오기
        List<Schedule> schedules = scheduleRepository.findAll(); // 엔티티를 다 찾아옴

        //리스트로 반환해줘야 하기 때문에 빈 리스트 생성
//        List<GetScheduleResponse> dtos = new ArrayList<>();

//        //일정 리스트에 하나씩 접근하기
//        for(Schedule schedule : schedules) {
//            //응답 DTO로 변환하기
//            GetScheduleResponse response = new GetScheduleResponse(
//                    schedule.getId(),
//                    schedule.getName(),
//                    schedule.getTitle(),
//                    schedule.getContent(),
//                    schedule.getCreatedAt(),
//                    schedule.getModifiedAt()
//            );
//
//            //빈 리스트에 응답 DTO 담아주기
//            dtos.add(response);
//        }
        //2. 배열을 스트림 타입으로 바꿔준다. map, toList를 쓰기위해서
        return schedules.stream().
                //3. map : 배열 안에 있는 모든 값들 하나하나에 접근해서 지정한 방식으로 변환해주는 것
                map(schedule -> new GetScheduleResponse(
                        //4. 스케줄 -> 응답 DTO로 변환
                        schedule.getId(),
                        schedule.getName(),
                        schedule.getTitle(),
                        schedule.getContent(),
                        schedule.getCreatedAt(),
                        schedule.getModifiedAt())).
                //5. 리스트로 만들기
                toList();

    }
}
