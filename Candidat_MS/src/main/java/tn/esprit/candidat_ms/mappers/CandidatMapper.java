package tn.esprit.candidat_ms.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import tn.esprit.candidat_ms.entities.Candidat;
import tn.starter.mysqlShared.dto.CandidatDTO;
import tn.starter.mysqlShared.mappers.GenericMapper;
@Mapper(componentModel = "spring")
public interface CandidatMapper extends GenericMapper<CandidatDTO,Candidat> {
		@Mapping(target = "id", ignore = true) // Prevent overwriting the ID
		void updateEntityFromDto(CandidatDTO dto, @MappingTarget Candidat entity);
}
