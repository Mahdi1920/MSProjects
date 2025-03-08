package tn.esprit.candidat_ms.services;

import tn.esprit.candidat_ms.entities.Candidat;
import tn.starter.mysqlShared.dto.CandidatDTO;
import tn.starter.mysqlShared.dto.QuizDTO;
import tn.starter.mysqlShared.services.IGenericService;

public interface ICandidatService extends IGenericService<CandidatDTO,Long> {
	QuizDTO getQuizById(String id);
	Candidat updatecandidat(Candidat c);
	Candidat addCandidat(Candidat c);
}
