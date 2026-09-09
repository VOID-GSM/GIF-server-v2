package com.example.gifserverv2.domain.push.repository;

import com.example.gifserverv2.domain.push.entity.NotificationHistory;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface NotificationRepository extends JpaRepository<NotificationHistory, Long> {

    Slice<NotificationHistory> findAllByUserIdAndCreatedAtGreaterThanEqualOrderByCreatedAtDesc(
            Long userId, LocalDateTime startDateTime, Pageable pageable);

    long countByUserIdAndIsReadFalseAndCreatedAtGreaterThanEqual(
            Long userId, LocalDateTime startDateTime);
}