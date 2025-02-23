package tn.esprit.candidat_ms.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.starter.mysqlShared.dto.QuizDTO;

//@FeignClient(name="quizes",url = "/quizms")
@FeignClient(name="quizms")
public interface QuizClient {
	@GetMapping("/api/quiz/getById/{id}")
	QuizDTO getQuizById(@PathVariable String id);
}
