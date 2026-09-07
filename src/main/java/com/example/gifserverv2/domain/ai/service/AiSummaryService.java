package com.example.gifserverv2.domain.ai.service;

import com.example.gifserverv2.domain.ai.service.AiSummaryPersistenceService.SummaryContext;
import com.example.gifserverv2.global.ai.OpenAiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AiSummaryService {

    private final AiSummaryPersistenceService persistenceService;
    private final OpenAiService openAiService;

    // TODO: 프로젝트 요약 AI 기능 오류로 인해 임시 주석 처리
//    public String summarizeProject(Long projectId) {
//        SummaryContext context = persistenceService.loadProjectContext(projectId);
//        if (context.cachedSummary() != null) {
//            return context.cachedSummary();
//        }
//
//        String summary = openAiService.summarize(context.prompt());
//        persistenceService.saveProjectSummary(projectId, summary);
//        return summary;
//    }

    // TODO: 양식 요약 AI 기능 오류로 인해 임시 주석 처리
//    public String summarizeFormSubmit(Long submitId) {
//        SummaryContext context = persistenceService.loadFormSubmitContext(submitId);
//        if (context.cachedSummary() != null) {
//            return context.cachedSummary();
//        }
//
//        String summary = openAiService.summarize(context.prompt());
//        persistenceService.saveFormSubmitSummary(submitId, summary);
//        return summary;
//    }
}
