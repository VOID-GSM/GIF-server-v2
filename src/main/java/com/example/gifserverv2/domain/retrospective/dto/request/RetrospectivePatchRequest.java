package com.example.gifserverv2.domain.retrospective.dto.request;

import com.example.gifserverv2.domain.retrospective.entity.RetrospectiveCategory;
import com.example.gifserverv2.domain.retrospective.entity.RetrospectiveVisibility;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import java.util.List;

/**
 * 정식 글 수정(PATCH /{id}), 임시 저장 생성/수정(POST,PATCH /draft*)에 공용으로 사용.
 * 모든 필드가 optional이며, null인 필드는 변경하지 않음(부분 수정).
 */
public record RetrospectivePatchRequest(
        RetrospectiveCategory category,
        RetrospectiveVisibility visibility,

        @Size(max = 100, message = "제목은 100자를 초과할 수 없습니다.")
        String title,

        @Size(max = 20000, message = "내용은 20000자를 초과할 수 없습니다.")
        String content,

        @Valid
        List<RelatedWorkRequest> relatedWorks
) {}
