package tn.esprit.candidat_ms.mappers;

import org.mapstruct.Mapper;
import tn.esprit.candidat_ms.entities.Candidat;
import tn.starter.mysqlShared.dto.CandidatDTO;
import tn.starter.mysqlShared.mappers.GenericMapper;
@Mapper(componentModel = "spring")
public interface CandidatMapper extends GenericMapper<CandidatDTO,Candidat> {
}
