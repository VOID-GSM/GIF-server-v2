package com.example.gifserverv2.domain.retrospective.dto.response;

/**
 * 작성자 소속 프로젝트 정보(학년/반/팀/파트)를 서버가 채워 내려주기 위한 내부 집계용 값 객체.
 */
public record AuthorAffiliation(Integer grade, Integer classNo, Integer teamNo, String part) {
    public static AuthorAffiliation empty() {
        return new AuthorAffiliation(null, null, null, null);
    }
}
