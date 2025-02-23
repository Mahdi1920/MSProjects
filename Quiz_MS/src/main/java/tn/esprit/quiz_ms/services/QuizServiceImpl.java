package tn.esprit.quiz_ms.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.quiz_ms.entities.Quiz;
import tn.starter.mongoShared.dto.QuizDTO;
import tn.starter.mongoShared.services.IGenericServiceImpl;

@Service
@AllArgsConstructor
public class QuizServiceImpl extends IGenericServiceImpl<QuizDTO, Quiz> implements IQuizService{
}
