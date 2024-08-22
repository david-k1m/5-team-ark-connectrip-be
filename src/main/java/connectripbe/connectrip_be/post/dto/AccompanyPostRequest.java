package connectripbe.connectrip_be.post.dto;

import connectripbe.connectrip_be.post.entity.enums.AccompanyArea;

import java.time.LocalDateTime;

public record AccompanyPostRequest(
        String title,
        String content,
        AccompanyArea accompanyArea,
        LocalDateTime startDate,
        LocalDateTime endDate
) {
}
