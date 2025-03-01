package tn.esprit.quiz_ms.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import tn.esprit.quiz_ms.entities.Quiz;
import tn.starter.mongoShared.dto.QuizDTO;
import tn.starter.mongoShared.mappers.GenericMapper;

@Mapper(componentModel = "spring")
public interface QuizMapper extends GenericMapper<QuizDTO, Quiz> {
	@Mapping(target = "id", ignore = true) // Prevent overwriting the ID
	void updateEntityFromDto(QuizDTO dto, @MappingTarget Quiz entity);
}
