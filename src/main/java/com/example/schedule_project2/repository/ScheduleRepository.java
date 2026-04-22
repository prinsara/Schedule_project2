package com.example.schedule_project2.repository;

import com.example.schedule_project2.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 어떤 엔티티를 다룰지, 그 엔티티의 PK 타입이 무엇인지
 */
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    Long Id(Long id);
}
