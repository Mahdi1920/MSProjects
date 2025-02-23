package tn.esprit.quiz_ms.mappers;

import org.mapstruct.Mapper;
import tn.esprit.quiz_ms.entities.Quiz;
import tn.starter.mongoShared.dto.QuizDTO;
import tn.starter.mongoShared.mappers.GenericMapper;

@Mapper(componentModel = "spring")
public interface QuizMapper extends GenericMapper<QuizDTO, Quiz> {
}
