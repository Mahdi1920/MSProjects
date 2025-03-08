package tn.esprit.candidat_ms.feignClients;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.starter.mysqlShared.dto.QuizDTO;

import java.time.LocalDate;

//@FeignClient(name="quizes",url = "/quizms")
@FeignClient(name="quizms")
public interface QuizClient {
	@GetMapping("/api/quiz/getById/{id}")
	QuizDTO getQuizById(@PathVariable String id);

//	@CircuitBreaker(name = "quizService", fallbackMethod = "fallbackQuiz")
//	default QuizDTO getQuizByIdWithCircuitBreaker(String id) {
//		return getQuizById(id); // Call the original Feign client method
//	}
//
//	default QuizDTO fallbackQuiz(String id, Throwable throwable) {
//		return new QuizDTO(id, "Default Quiz", "Unknown", LocalDate.now());
//	}
}
